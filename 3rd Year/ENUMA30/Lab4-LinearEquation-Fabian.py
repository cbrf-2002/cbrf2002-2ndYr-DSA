import sympy as s
from sympy import symbols, sympify
import sys
import numpy as np

def welcome(): #Input selection for Jacobi and Gauss-Seidel Method, with error handling. Returns method_choice to be used in picking methods.
    print('Welcome to the Jacobi and Gauss-Seidel Method\nChoose what method you want to use:')
    truth = True
    while True:
        try:
            method_choice = int(input('\t1. Jacobi Method\n\t2. Gauss-Seidel Method\nInput your choice:\t\t'))
            if method_choice == 1 or method_choice == 2:
                truth = False
                return method_choice
        except(ValueError, TypeError):
            print(f'There is an error with your input, try again.')

def equation_and_variable():
    makesure = True
    while makesure: #lets the user input up to 10 equations (as well as the variables)
        number_equations = int(input('\nHow many equations do you want to insert? (Up to 10 variables)\nInput your choice:\t\t'))
        if number_equations in range(1,10):
            makesure = False
        else:
            print('Please enter a valid input and try again')  
    if number_equations < 4: #it generates symbols as per demand of user, stores these symbolic symbols to variable_symbols to be used later (mostly cosmetic)
        variable_symbols = symbols('x y z')[:number_equations]
        print(f'\nYou may enter variables ({variable_symbols}) [e.g. 5*x + y - 2*z = 18]\n')
    else: #it creates w to f when the input is more than 3 for conventional usage.
        variable_symbols = symbols('w x y z a b c d e f')[:number_equations]
        print(f'\nYou may enter variables ({variable_symbols}) [e.g. 12*w - 5*x + 2*y - 3*z = -64]\n')
    return number_equations, variable_symbols #returns number_equations and variable_symbols to be used later.
    
def enter_equations(funcs, constants): #lets the user input equations in the same manner as previous methods. Uses parameters to fetch funcs and constants lists
    for i in range(number_equations): #starts a loop that will use the value returned from equation_and_variable()
        func = str(input(f'\tEnter Equation {i + 1}:\t'))
        lhs, rhs = func.replace(" ", "").split("=") #splits the equation into left- and right-side
        constants.append(sympify(rhs)) #add the elements from right-side (or the constant) to the respective list
        moved_const = sympify(lhs) - sympify(rhs) #equating the equation by moving the rhs to lhs
        funcs.append(moved_const) #add the elements from the equated equation to funcs list
    return funcs, constants #returns funcs and constants to be used later

def diagdom(coeff_matrix, number_equations): #checks if the equation is diagonally dominant, uses coeff_matrix and number_equations as parameters
    return all( #it gets the coeff_matrix extracted by numpy from the sympy equation
        abs(coeff_matrix[i, i]) >= sum(abs(coeff_matrix[i, j]) for j in range(number_equations) if j != i)
        for i in range(number_equations)
    )
#checks if the absolute value of the diagonal element of the coeff_matrix is 
#greater than or equal to the sum of the other elements in the same row
#returns True if all iterable elements are true

def make_guess(variable_symbols): #another user input, this function takes user input for
    makesureagain = True #respective variable
    varsint = [] #initialize a list to be converted later to matrix
    while makesureagain:
        print(f'\nGuess variables for the following:\n')
        try: #an error handler that make sures the right input of user
            for i in range(len(variable_symbols)):
                variables = float(input(f'\tInput value for {variable_symbols[i]}:\t'))
                varsint.append(variables)
            makesureagain = False
            return varsint
        except (ValueError, TypeError):
            print(f'There is an error with your input, try again.')

#the Jacobi and Gauss-Seidel method are almost the same in terms of its algorithm
#only difference is the Jacobi uses only the values from the previous iteration (guess_matrix)
#while the Gauss-Seidel uses the values of the unkowns as soon as available (newguess_matrix)
#This makes Gauss-Seidel converge faster than the Jacobi.

def jacobi_method(coeff_matrix, const_matrix, guess_matrix, tol):
    citer = 0; #initialize how many iterations are performed, needed for print report
    for iteration in range(1,10000): #starts a for loop from 1 to 9999
        newguess_matrix = guess_matrix.copy() #creates new matrix that stores the updated values from the unkowns each iters
        for i in range(len(const_matrix)): #will loop over each row of the const_matrix
            sumoterm = np.dot(coeff_matrix[i, :i], guess_matrix[:i]) + np.dot(coeff_matrix[i, i+1:], guess_matrix[i+1:])
            newguess_matrix[i] = (const_matrix[i] - sumoterm) / coeff_matrix[i, i]
            #This line calculates the sum of the products (dot matrix) of the coefficients and the
            #unknowns, except for the diagonal element.
            #For example, if we are updating x in the system 3x + 2y = 5 and
            #4x - y = 2, then this sumoterm line will calculate 2y - y = y.
            #the next line updates the value of the unkown in the newguess_matrix

        if np.max(np.abs(newguess_matrix - guess_matrix)) < tol:
            break #checks whether the difference between newguess and guess matrix are less than tolerance
        guess_matrix = newguess_matrix #if not yet converged, it assigns the newguess value to guess, updating it for next iter
        citer = iteration #keep track on how many iterations has been
    return citer, guess_matrix #returns citer and guess_matrix value to be used as answer

def gauss_seidel_method(coeff_matrix, const_matrix, guess_matrix, tol):
    citer = 0;
    for iteration in range(1,10000):
        newguess_matrix = guess_matrix.copy()
        for i in range(len(const_matrix)):
            #only difference of the Gauss-Seidel Method is it uses newguess_matrix[:i] instead of guess_matrix[:i]
            #this makes it kind of skip the old unkowns, thus making it faster
            sumoterm = np.dot(coeff_matrix[i, :i], newguess_matrix[:i]) + np.dot(coeff_matrix[i, i+1:], guess_matrix[i+1:])
            newguess_matrix[i] = (const_matrix[i] - sumoterm) / coeff_matrix[i, i]

        if np.max(np.abs(newguess_matrix - guess_matrix)) < tol:
            break
        guess_matrix = newguess_matrix
        citer = iteration
    return citer, guess_matrix

def main():
    method_choice = welcome() #initiates welcome() function and fetching the returned method_choice value
    tol = float(input('\nEnter tolerance:\t\t')) #input the tolerance for later use
    number_equations, variable_symbols = equation_and_variable() #initates equation number input and returns respective variable values
    
    funcs = [] #initiates func list to be used as container for equations
    constants = [] #initiates constants list to be used as container for constants
    funcs, constants = enter_equations(funcs, constants) #initiates equation input and uses both func and constants lists
    const_matrix = np.array(constants, dtype=float) #converts the constants[] into a matrix as well as the coeffs[] in the next line, also makes sure that it is float by converting the data
    coeff_matrix = np.array([[func.coeff(symbol) for symbol in variable_symbols] for func in funcs], dtype=float)
    #creates the coeff matrix from the following:
    #it extracts the funcs coefficients as per every symbol present in every equations
    #then it converts the new list into a matrix
    
    print("\nDiagonal Dominance Checker:")
    if diagdom(coeff_matrix, number_equations): #this checks if the returned value of the diagdom is True
        print("The coefficient matrix is diagonally dominant.")
    else: #if False, it will trigger else statement and terminates the program using sys.exit()
        print("The coefficient matrix is not diagonally dominant. Try another one or rearrange functions.\nThe program will be exited.")
        sys.exit()
    
    varsint = make_guess(variable_symbols) #initiates guess variable input at put it on varsint
    guess_matrix = np.array(varsint, dtype=float) #converts the array list into matrix as well
    
    
    if method_choice == 1: #the choice statement for jacobi and gauss-seidel
        citer, guess_matrix = jacobi_method(coeff_matrix, const_matrix, guess_matrix, tol)
        print(f'\nThe systems of linear equation values converged after {citer} iterations with a tolerance of {tol} using Jacobi Method.')
        print('\nHere are the results:\n') #prints the results for every symbol with up to 6 decimal places

        for i, symbol in enumerate(variable_symbols):
            print(f'\t{symbol} value:\t\t{guess_matrix[i]:.6f}')
    else:
        citer, guess_matrix = gauss_seidel_method(coeff_matrix, const_matrix, guess_matrix, tol)
        print(f'\nThe systems of linear equation values converged after {citer} iterations with a tolerance of {tol} using Gauss-Seidel Method.')
        print('\nHere are the results:\n') #prints the results for every symbol with up to 6 decimal places

        for i, symbol in enumerate(variable_symbols):
            print(f'\t{symbol} value:\t\t{guess_matrix[i]:.6f}')
        
if __name__ == "__main__": #calls the main function, executing only if run as a script.
    main()
