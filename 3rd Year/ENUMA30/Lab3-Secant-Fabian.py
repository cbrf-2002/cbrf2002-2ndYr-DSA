import sympy as s

print('Welcome to the Secant Method \n\n')
x = s.Symbol ('x')

func = input('Enter Function:  ')
xi = float(input('Enter value of the first x:   '))
xii = float(input('Enter value of the second x:   '))
#tol = float(input('Enter Tolerance:   '))
tol = 0.0000000001

f = s.sympify (func)
xo = float(0)

for i in range(1,10000):
    fx = f.subs(x,xi).evalf()
    fxx = f.subs(x,xii).evalf()
    xiii = xii - (((fxx)*(xii-xi))/((fxx)-(fx)))
    etol = abs(xiii - xo)
    if etol < tol:
        print(f'\nThe root of the function \'{func}\' is {xii} after {i} iterations using Secant Method. Initial x1 is {xi}, and x2 is {xii} with a tolerance of Et < {tol}')
        break
    else:
        xi = xii
        xii = xiii
        xo = xiii
