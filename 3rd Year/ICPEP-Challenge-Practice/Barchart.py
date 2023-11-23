def barchart_values(barval):
    print("Enter BarChart Values: ")
    values = list(map(int, input().split()))
    vals = values[:barval]
    return vals
    
def barchart_generator(barval,valss):
    max = valss[0]
    for i in range(len(valss)): #find bound max
        if(valss[i] > max):
            max = valss[i]

    rows = max+1
    cols = len(valss)+4

    #top
    print(" ".join(["0"] * cols))
    #content
    for i in range(rows, 0, -1):
        bar = ""
        for v in valss:
            if v >= i:
                bar += "# "
            else:
                bar += "  "
        print(f'0   {bar}  0')
    #bottom
    print(" ".join(["0"] * cols))

barval = int(input("Enter number of BarChart Values: "))
valss = barchart_values(barval)
print("\n")
barchart_generator(barval, valss)
