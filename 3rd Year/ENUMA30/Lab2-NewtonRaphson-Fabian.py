import sympy as s

print('Welcome to the Newton-Raphson Method\n\n')
x = s.Symbol ('x')

func = input('Enter Function:  ')
xv = float(input('Enter value of x:   '))
#tol = float(input('Enter Tolerance:   '))
tol = 0.0000000001

f = s.sympify (func)
df = f.diff(x)
oxx = float(0)

for i in range(1,10000):
    fx = f.subs(x,xv).evalf()
    dfx = df.subs(x,xv).evalf()
    xx = xv - (fx/dfx)
    etol = abs(xx - oxx)
    if etol < tol:
        print(f'\nThe root of the function \'{func}\' is {xx} after {i} iterations using Newton-Raphson Method. Initial x1 is {xv} with a tolerance of Et < {tol}')
        break
    else:
        oxx = xx
        xv = xx
