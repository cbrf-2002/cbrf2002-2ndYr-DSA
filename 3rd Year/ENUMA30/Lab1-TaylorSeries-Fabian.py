import sympy as s

x = s.Symbol ('x')

input_func = input('Enter Function:  ')
xval = float(input('Enter value of x:   '))
aval = float(input('Enter center a of Taylor Series:   '))
tol = float(input('Enter Tolerance:   '))

func = s.sympify (input_func)
otvalue = func.subs(x,aval).evalf()

for n in range(1,10000):
    dfunc = func.diff(x)
    ntvalue = otvalue + ((dfunc.subs(x,aval).evalf()/s.factorial(n))*((xval - aval)**(n)))
    ctol = abs(ntvalue - otvalue)
    if ctol < tol:
        print(f'\nThe new value of the function {input_func} at x = {xval} after {n} polynomials is {ntvalue} using Taylor Series Method. The center a value is {aval} with the tolerance of Et < {tol}')
        break
    else:
        func = dfunc
        otvalue = ntvalue
