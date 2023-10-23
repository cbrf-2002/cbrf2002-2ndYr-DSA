import sympy as s

print('Welcome to the Numerical Differentiation (Finite Difference Method)\n\n')
x = s.Symbol ('x')

func = "E**(6*x**3 - 5*x**2 + 11)"
xval = 0.9
hval = float(input('Enter value of your h:\t\t'))
tol = 0.0000000001

f = s.sympify (func)
fx = f.subs(x,xval).evalf()
init = float(0)
hhval = hval
for i in range(1,10000):
    xh = xval + hval
    fxh = f.subs(x,xh).evalf()
    fpx = ((fxh - fx)/hval)
    etol = abs(fpx - init)
    if etol < tol:
        print(f'\nForward: f\'({xval}) = {fpx} after {i} iterations.')
        break
    else:
        init = fpx
        hval = hval/2

init = float(0)
hval = hhval

for i in range(1,10000):
    xh = xval - hval
    fxh = f.subs(x,xh).evalf()
    fpx = ((fx - fxh)/hval)
    etol = abs(fpx - init)
    if etol < tol:
        print(f'\nBackward: f\'({xval}) = {fpx} after {i} iterations.')
        break
    else:
        init = fpx
        hval = hval/2

init = float(0)
hval = hhval

for i in range(1,10000):
    xhp = xval + hval
    xhm = xval - hval
    fxhp = f.subs(x,xhp).evalf()
    fxhm = f.subs(x,xhm).evalf()
    fpx = ((fxhp - fxhm)/(2*hval))
    etol = abs(fpx - init)
    if etol < tol:
        print(f'\nCenter: f\'({xval}) = {fpx} after {i} iterations.')
        break
    else:
        init = fpx
        hval = hval/2
