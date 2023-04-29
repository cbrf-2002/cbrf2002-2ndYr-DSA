## FABIAN, CHARLES BRYAN R. - CPE12S1 - FINAL PRACTICAL EXAMINATION
from tkinter import *
from tkinter import messagebox as m
from tkinter import ttk

root = Tk()
root.geometry('600x300')
root.title("Fabian, Charles Bryan R. | Final Practical Examination")

#DEFS
def submitted():
    if nameentry.index("end") == 0:
        m.showwarning("Error", "Please enter your name.")
    elif civselect.get() == "":
        m.showwarning("Error", "Please select your civil status.")
    elif gendselect.get() == "":
        m.showwarning("Error", "Please select your gender.")
    elif jobworkentry.index("end") == 0:
        m.showwarning("Error", "Please enter your job/work.")
    else:
        m.showinfo("Success", "Details successfully submitted, you can now click \"VIEW ALL\" button.")
        
def terminated():
    root.destroy()

def viewAll():
    dInsert = nameentry.get() + "-" + civselect.get() + "-" + gendselect.get() + "-" + jobworkentry.get()
    textboxMain.insert(END,dInsert)

xmargin = .1

#NAME
namelabel = Label(root, text = "Name")
nameentry = Entry(root, width = 25)
namelabel.place(anchor = W, relx = xmargin, rely = .2)
nameentry.place(anchor = W, relx = (xmargin + .15), rely = .2)

#CIVIL STATUS
civlabel = Label(root, text = "Civil Status")
civselect = StringVar()
civdropdown = ttk.Combobox(root, width = 12, textvariable = civselect, state = "readonly")
civdropdown["values"] = ("Single", "Married", "Widow", "Other")
civlabel.place(anchor = W, relx = xmargin, rely = .3)
civdropdown.place(anchor = W, relx = (xmargin + .1509), rely = .3)

#GENDER
gendlabel = Label(root, text = "Gender")
gendselect = StringVar()
malerad = Radiobutton(root, text = "Male", variable = gendselect, value = "Male")
femalerad = Radiobutton(root, text = "Female", variable = gendselect, value = "Female")
gendlabel.place(anchor = W, relx = xmargin, rely = .4)
malerad.place(anchor = W, relx = (xmargin + .15), rely = .4)
femalerad.place(anchor = W, relx = (xmargin + .15), rely = .48)

#JOBWORK
jobworklabel = Label(root, text = "Job/Work")
jobworkentry = Entry(root, width = 25)
jobworklabel.place(anchor = W, relx = xmargin, rely = .6)
jobworkentry.place(anchor = W, relx = (xmargin + .15), rely = .6)

#BUTTONS
submitButton = Button(root, text = "Submit", height = 1, command = submitted)
submitButton.place(anchor = W, relx = (xmargin + .15), rely = .75)
backButton = Button(root, text = "Back", height = 1, command = terminated)
backButton.place(anchor = W, relx = (xmargin + .35), rely = .75)

#TEXTBOX
textboxMain = Text(root, height = 10, width = 30)
textboxMain.place(anchor = E, relx = (xmargin + .88), rely = .4)

#TEXTBOX BUTTON
textboxButton = Button(root, text = "VIEW ALL", command = viewAll)
textboxButton.place(anchor = E, relx = (xmargin + .76), rely = .72)

root.mainloop()
