print("---------------------------------------------------------------")
print("Charles Bryan R. Fabian's Customer Bill Calculator")
print("---------------------------------------------------------------\n")
## input
grossbill = float(input("Input gross bill: "))
tendered = float(input("Input amount tendered: "))
## charges
servicecharge = grossbill * .15
salestax = grossbill * .1
chargedbill = grossbill + servicecharge + salestax
change = tendered - chargedbill
## output
print("Gross bill: {0:.2f}\nService charge: {1:.2f}\nSales tax: {2:.2f}\n".format(grossbill,servicecharge,salestax))
print("---------------------------------------------------------------\n")
print("Total charge: {0:.2f}\nTendered: {1:.2f}\nChange: {2:.2f}\n".format(chargedbill,tendered,change))
print("---------------------------------------------------------------")
