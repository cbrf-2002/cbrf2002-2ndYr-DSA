class Atm:
    ownerName = ""
    __money = ""
    def __init__(self):
        self.ownerName = "Unknown"
        self.__money = "500"
    def getBalance(self):
        return(self.__money)
    def setBalance(self, money):
        self.__money = money
    def getOwner(self):
        return(self.ownerName)
    def setOwner(self, name):
        self.ownerName = name
        
owner1 = Atm()
owner1.setOwner("Adam")
owner1.setBalance("7000")
print(owner1.getOwner() + " money balance is: "+ owner1.getBalance())

owner2 = Atm()
owner2.setOwner("Ben")
owner2.setBalance("10000")
print(owner2.getOwner() + " money balance is: "+ owner2.getBalance())
