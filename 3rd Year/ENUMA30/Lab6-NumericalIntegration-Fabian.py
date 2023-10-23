import sympy as s
import numpy as np

print('Welcome to the Numerical Integration\n\n')
x = s.Symbol('x')

func = input('Enter function:\t\t\t')
hval = int(input('Enter upper limit:\t\t'))
lval = int(input('Enter lower limit:\t\t'))
tol = float(input('Enter tolerance:\t\t'))
f = s.sympify(func)

old_trapezoidal = 0
for n in range(1,10000):
    h = (hval - lval) / n
    xi = [lval + i * h for i in range(n + 1)]
    tfxi = [f.subs(x, xi[i]).evalf() for i in range (n + 1)]
    trapezoidal = (h / 2) * (tfxi[0] + (2 * np.sum(tfxi[1:-1])) + tfxi[-1])
    ttol = abs(trapezoidal - old_trapezoidal)
    if ttol < tol:
        print(f'The area for {func} is {trapezoidal} sq. units using Trapezoidal Rule at {n} slices.')
        break
    else:
        old_trapezoidal = trapezoidal

old_simpsons = 0
for n in range(1,10000,2):
    h = (hval - lval) / n
    xi = [lval + i * h for i in range(n + 1)]
    sfxi = [f.subs(x, xi[i]).evalf() for i in range (n + 1)]
    simpsons = (h / 3) * (sfxi[0] + (4 * np.sum(sfxi[2:-1:2])) + (2 * np.sum(sfxi[1:-1:2])) + sfxi[-1])
    stol = abs(simpsons - old_simpsons)
    if stol < tol:
        print(f'The area for {func} is {simpsons} sq. units using Simpsons Rule at {n} slices.')
        break
    else:
        old_simpsons = simpsons
