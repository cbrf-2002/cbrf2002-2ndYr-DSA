print ("Welcome to blah blah blah grade ekek program! Kindly type respective grades here (Up to 100 points)")
#input
while True:
        try:
            inp = float(input("\nInput prelims grade:\n"))
            if inp < 0 or inp > 100:
                raise ValueError
            break
        except ValueError:
            print("\nPlease enter a valid number within 0 to 100. (e.g. 10, 28.3, 79.87, 92\n")
while True:
        try:
            inm = float(input("\nInput midterms grade:\n"))
            if inm < 0 or inm > 100:
                raise ValueError
            break
        except ValueError:
            print("\nPlease enter a valid number within 0 to 100. (e.g. 10, 28.3, 79.87, 92\n")
while True:
        try:
            inpf = float(input("\nInput prefinals grade:\n"))
            if inpf < 0 or inpf > 100:
                raise ValueError
            break
        except ValueError:
            print("\nPlease enter a valid number within 0 to 100. (e.g. 10, 28.3, 79.87, 92\n")
while True:
        try:
            inf = float(input("\nInput finals grade:\n"))
            if inf < 0 or inf > 100:
                raise ValueError
            break
        except ValueError:
            print("\nPlease enter a valid number within 0 to 100. (e.g. 10, 28.3, 79.87, 92\n")

#computation
op = inp * 0.3
om = inm * 0.2
opf = inpf * 0.25
of = inf * 0.25
avg = (op + om + opf + of)
#output
print(f'\nThe prelim grade is: {inp:0.2f}\n')
print(f'The midterm grade is: {inm:0.2f}\n')
print(f'The prefinals grade is: {inpf:0.2f}\n')
print(f'The finals grade is: {inf:0.2f}\n')
print(f'The average grade is: {avg:0.2f}\n')
if avg >= 75:
    print("You have passed this subject, congratulations!")
else:
    avgfailed = 75 - avg
    print(f'You have failed this subject, you need atleast {avgfailed:0.2f} points to pass this subject.')
