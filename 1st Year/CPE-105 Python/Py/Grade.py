print("---------------------------------------------------------------")
print("Welcome to Charles Bryan R. Fabian's Student Grade Calculator!")
print("---------------------------------------------------------------\n")
quiz1 = float(input("Input student's Quiz 1 grade: "))
quiz2 = float(input("Input student's Quiz 2 grade: "))
quiz3 = float(input("Input student's Quiz 3 grade: "))
proj1 = float(input("Input student's Project 1 grade: "))
proj2 = float(input("Input student's Project 2 grade: "))
proj3 = float(input("Input student's Project 3 grade: "))
finexam = float(input("Input student's Final exam grade: "))
ass = float(input("Input student's Assignment grade: "))
clast = float(input("Input student's Class Standing: "))
print("\n---------------------------------------------------------------\n")
cquiz = ((quiz1 + quiz2 + quiz3)/3) * .3
cproj = ((proj1 + proj2 + proj3)/3) * .2
cexam = finexam * .3
cass = ass * .1
cclast = clast * .1
fg = (cquiz + cproj + cexam + cass + cclast)
print("Quiz average grade: {0:.2f}\nProject average grade: {1:.2f}\nFinal exam grade: {2:.2f}\nAssignment grade: {3:.2f}\nClass standing: {4:.2f}\n".format(cquiz,cproj,cexam,cass,cclast))
print("---------------------------------------------------------------\n")
print("Student's Final Grade: {0:.2f}".format(fg))
print("\n---------------------------------------------------------------")
