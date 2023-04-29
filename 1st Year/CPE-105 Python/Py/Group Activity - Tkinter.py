from tkinter import *
from tkinter import messagebox
root = Tk()
root.title("Group 7")

def exiting(option):
    if option == "goback":
        root.withdraw() #hides window without closing it
        thanks.destroy()
        loopback = Toplevel()
        loopback.title("Group 7 | Exit Message")
        def back():
            loopback.destroy()
            root.deiconify()
        main = Button(loopback, text="Go back to Main Window", relief=GROOVE,bd=2, bg='#582630',fg="#F7EE7F", command=back)
        main.pack(padx=25, pady=25)
        
    else:
        root.destroy()

def confirm():
    global thanks
    dmsg.destroy()
    thanks = Toplevel()
    thanks.title("Group 7 | Thank you")
    label = Label(thanks, text="Thank you for using the program, do you want to exit the program or go back to menu?", justify=LEFT)
    label.pack(padx=20, pady=15)
    no = Button(thanks, text="Exit", width=8, relief=GROOVE,
                bd=3, command=lambda: exiting("exit"))
    no.pack(padx=5, pady=10, side=RIGHT)
    yes = Button(thanks, text="Go Back", width=8, relief=GROOVE,
                 bd=3, command=lambda: exiting("goback"))
    yes.pack(pady=10, side=RIGHT)

def diffMsg():
    global dmsg
    root.withdraw()
    dmsg = Toplevel()
    dmsg.title("Group 7 | Messages")
    difmsg = Label(dmsg, text="Click on buttons to show different message boxes.", justify=LEFT)
    difmsg.pack(padx=20,pady=20,side=TOP)
    
    def shin():
        messagebox.showinfo("Information","Information for user")
    def shwr():
        messagebox.showwarning("Warning","Warning message for user")
    def sher():
        messagebox.showerror("Error","Error message for user")
    def asqt():
        messagebox.askquestion("Confirm","Are you sure?")
    def ascl():
        messagebox.askokcancel("Joining...","Joining the server...")
    def ysno():
        messagebox.askyesno("Application","Got it?")
    def retcan():
        messagebox.askretrycancel("You died", "Do you want to retry again?")
    def ysnocan():
        messagebox.askyesnocancel("Save game", "Do you want to save your Data?")
        
    db1 = Button(dmsg, text="Show info message", relief=SUNKEN, bd=2, bg='#582630',fg="#F7EE7F", command = shin)
    db1.pack(padx=10,pady=5)
    db2 = Button(dmsg, text="Show warning message", relief=SUNKEN, bg='#582630',fg="#F7EE7F", bd=2, command = shwr)
    db2.pack(padx=10,pady=5)
    db3 = Button(dmsg, text="Show error message", relief=SUNKEN, bg='#582630',fg="#F7EE7F", bd=2, command = sher)
    db3.pack(padx=10,pady=5)
    db4 = Button(dmsg, text="Show question message", relief=SUNKEN, bg='#582630',fg="#F7EE7F", bd=2, command = asqt)
    db4.pack(padx=10,pady=5)
    db5 = Button(dmsg, text="Show cancel message", relief=SUNKEN, bg='#582630',fg="#F7EE7F", bd=2, command = ascl)
    db5.pack(padx=10,pady=5)
    db6 = Button(dmsg, text="Show ask yes/no message", relief=SUNKEN, bg='#582630',fg="#F7EE7F", bd=2, command = ysno)
    db6.pack(padx=10,pady=5)
    db7 = Button(dmsg, text="Show ask retry cancel", relief=SUNKEN, bg='#582630',fg="#F7EE7F", bd=2, command = retcan)
    db7.pack(padx=10,pady=5)
    db8 = Button(dmsg, text="Show ask yes,no,cancel message", relief=SUNKEN, bg='#582630',fg="#F7EE7F", bd=2, command = ysnocan)
    db8.pack(padx=10,pady=5)
    gotoloopback = Button(dmsg, text="Exit", pady=3, padx=20, relief=SUNKEN, bd=2, bg='#A54657',fg="#F1A66A", command = confirm)
    gotoloopback.pack(padx=10,pady=5)

text1 = Label(root, text="Group 7\nWelcome to Group 7 message box showcase")
text1.pack(padx=30, pady=5,side=TOP)
opened1 = Button(root, text="Proceed to message boxes", width=20, relief=GROOVE, bd=3, bg='#582630',fg="#F7EE7F", command=diffMsg)
opened1.pack(padx=30, pady=15)

root.mainloop()
