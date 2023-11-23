import random

checker = True

def bingenerator(number):
    generated = []
    for i in range(0, number):
        gen = random.randint(0,1)
        generated.append(gen) #[0,1,1,0,1,0]
        half = len(generated)//2
    return generated, generated[:half], generated[half:]

def bincalc(lhs, rhs):
    a = 0
    b = 0
    for i in range(len(lhs)):
        a += lhs[i]
        
    for i in range(len(lhs)):
        b += rhs[i]

    return a, b

while checker != False:
    number = int(input("Enter even number: "))
    if number % 2 == 0:
        checker = True
        break
    print("Try again")

generated, lhs, rhs = bingenerator(number)
lhsoln, rhsoln = bincalc(lhs, rhs)
print(generated)
print(f'{lhs} and {rhs}')
print(f'{lhsoln} and {rhsoln}')

if lhsoln > rhsoln:
    print("Left Won!")
elif lhsoln < rhsoln:
    print("Right Won!")
else:
    print("It\'s a tie!")
