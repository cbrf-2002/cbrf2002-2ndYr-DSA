l1 = list(map(int, input("Enter first list of integers separated by space: ").split()))
l2 = list(map(int, input("Enter second list of integers separated by space: ").split()))
l3 = []
for x in l1:
    if x in l2:
        l3.append(x)
        l2.remove(x)

print(f'Common elements:  {l3}')
