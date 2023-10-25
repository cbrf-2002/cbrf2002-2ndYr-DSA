import math

fsmp = input("Enter function:\t")
f = lambda x: eval(fsmp)

a = float(input("Enter lower limit:\t"))
b = float(input("Enter upper limit:\t"))
tol = float(input("Enter tolerance:\t"))
etol = 100;

def trapezoidal(f, a, b, tol, etol):
    n = 1; old = 0
    while etol > tol:
        h = (b-a)/n
        sums = 0
        for i in range(1, n):
            sums += 2 * f(a + i * h)

        traps = round((h/2)*(f(a)+sums+f(b)),6)
        etol = abs((traps - old)/traps)

        old = traps
        n += 1

    print(f'The area for \'{fsmp}\' is {traps} sq. units using Trapezoidal Rule at {n} slices.')

def simpsons(f, a, b, tol, etol):
    n = 2; old = 0
    while etol > tol:
        h = (b-a)/n
        sums = 0
        for i in range(1, n):
            if i % 2 == 0:
                sums += 2 * f(a + i * h)
            else:
                sums += 4 * f(a + i * h)

        simps = round((h/3)*(f(a)+sums+f(b)),6)
        etol = abs((simps - old)/simps)

        old = simps
        n += 2

    print(f'The area for \'{fsmp}\' is {simps} sq. units using Simpsons Rule at {n} slices.')

trapezoidal(f, a, b, tol, etol)
simpsons(f, a, b, tol, etol)
