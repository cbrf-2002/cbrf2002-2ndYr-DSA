#include <iostream>
#include <string>
using namespace std;

void PrelimGradeInput(double &pq, double &ps, double &ple, double &pe, double &prelimg) {
    cout << "\nEnter your prelim quiz, seatwork, lab exercise, exam\n";
    loopinputprelimq:
    cout << "Prelim Quiz: ";
    cin >> pq;
    if(!cin || pq < 0 || pq > 100){
        cout << "Invalid input, try again." << endl;
        cin.clear();
        cin.ignore(500000, '\n');
        goto loopinputprelimq;
    }
    loopinputprelims:
    cout << "Seatwork: ";
    cin >> ps;
    if(!cin || ps < 0 || ps > 100){
        cout << "Invalid input, try again." << endl;
        cin.clear();
        cin.ignore(500000, '\n');
        goto loopinputprelims;
    }
    loopinputprelimle:
    cout << "Lab Exercise: ";
    cin >> ple;
    if(!cin || ple < 0 || ple > 100){
        cout << "Invalid input, try again." << endl;
        cin.clear();
        cin.ignore(200, '\n');
        goto loopinputprelimle;
    }
    loopinputprelime:
    cout << "Exam: ";
    cin >> pe;
    if (!cin || pe < 0 || pe > 100){
        cout << "Invalid input, try again." << endl;
        cin.clear();
        cin.ignore(500000, '\n');
        goto loopinputprelime;
    }
    else {
    prelimg = (pq*.2) + (ps*.1) + (ple*.2) + (pe*.5);
    }
}

void MidtermGradeInput(double &mq, double &ms, double &mle, double &me, double &midtermg) {
    cout << "\nEnter your midterm quiz, seatwork, lab exercise, exam\n";
    loopinputmidtermq:
    cout << "Midterm Quiz: ";
    cin >> mq;
    if(!cin || mq < 0 || mq > 100){
        cout << "Invalid input, try again." << endl;
        cin.clear();
        cin.ignore(500000, '\n');
        goto loopinputmidtermq;
    }
    loopinputmidterms:
    cout << "Seatwork: ";
    cin >> ms;
    if(!cin || ms < 0 || ms > 100){
        cout << "Invalid input, try again." << endl;
        cin.clear();
        cin.ignore(500000, '\n');
        goto loopinputmidterms;
    }
    loopinputmidtermle:
    cout << "Lab Exercise: ";
    cin >> mle;
    if(!cin || mle < 0 || mle > 100){
        cout << "Invalid input, try again." << endl;
        cin.clear();
        cin.ignore(500000, '\n');
        goto loopinputmidtermle;
    }
    loopinputmidterme:
    cout << "Exam: ";
    cin >> me;
    if (!cin || me < 0 || me > 100){
        cout << "Invalid input, try again." << endl;
        cin.clear();
        cin.ignore(500000, '\n');
        goto loopinputmidterme;
    }
    else {
    midtermg = (mq*.2) + (ms*.1) + (mle*.2) + (me*.5);
    }
}

void FinalGradeInput(double &fq, double &fs, double &fle, double &fe, double &finalg) {
    cout << "\nEnter your final quiz, seatwork, lab exercise, exam\n";
    loopinputfinalq:
    cout << "Final Quiz: ";
    cin >> fq;
    if(!cin || fq < 0 || fq > 100){
        cout << "Invalid input, try again." << endl;
        cin.clear();
        cin.ignore(500000, '\n');
        goto loopinputfinalq;
    }
    loopinputfinals:
    cout << "Seatwork: ";
    cin >> fs;
    if(!cin || fs < 0 || fs > 100){
        cout << "Invalid input, try again." << endl;
        cin.clear();
        cin.ignore(500000, '\n');
        goto loopinputfinals;
    }
    loopinputfinalle:
    cout << "Lab Exercise: ";
    cin >> fle;
    if(!cin || fle < 0 || fle > 100){
        cout << "Invalid input, try again." << endl;
        cin.clear();
        cin.ignore(500000, '\n');
        goto loopinputfinalle;
    }
    loopinputfinale:
    cout << "Exam: ";
    cin >> fe;
    if (!cin || fe < 0 || fe > 100){
        cout << "Invalid input, try again." << endl;
        cin.clear();
        cin.ignore(500000, '\n');
        goto loopinputfinale;
    }
    else {
    finalg = (fq*.2) + (fs*.1) + (fle*.2) + (fe*.5);
    }
}

int main() {
    string sname, course, remarks;
    double pq, ps, ple, pe, prelimg, mq, ms, mle, me, midtermg, fq, fs, fle, fe, finalg, tmidtermg, tfinalg;
    loopnaming:
    cout << "Welcome to grading program!\nPlease enter your name:\n";
    getline(cin, sname, '\n');
    while (cin.fail()) {
	    cout << "\nInvalid Input!\nPlease do it right...\n\n";
	    cin.clear();
	    cin.ignore(50000,'\n');
	    goto loopnaming;
    }
    cout << "\nThen enter your course:\n";
    loopcourse:
    getline(cin, course, '\n');
    while (cin.fail()) {
	    cout << "\nInvalid Input!\nPlease do it right...\n\n";
	    cin.clear();
	    cin.ignore(50000,'\n');
	    goto loopcourse;
    }
    PrelimGradeInput(pq, ps, ple, pe, prelimg);
    MidtermGradeInput(mq, ms, mle, me, midtermg);
    FinalGradeInput(fq, fs, fle, fe, finalg);
    tmidtermg = (prelimg/3) + ((2*midtermg)/3);
    tfinalg = (tmidtermg/3) + ((2*finalg)/3);
    if (tfinalg >= 75) {
        remarks = "PASSED";
    }
    else {
        remarks = "FAILED";
    }
    system("clear");
    cout << endl << "-------------------------------------------------------------" << endl;
    cout << "Student Name\t: " << sname << endl << "Course\t\t: " << course << endl << "\nGrades:";
    cout << "\nPrelims\n" << endl <<
            "\tQuiz\t\t\t: " << pq << endl <<
            "\tSeatwork\t\t: " << ps << endl <<
            "\tLab. Exercises\t\t: " << ple << endl <<
            "\tPrelim Exam\t\t: " << pe << endl <<
            "\tPrelim Grade\t\t: " << prelimg << endl;
    cout << "\nMidterms\n" << endl <<
            "\tQuiz\t\t\t: " << mq << endl <<
            "\tSeatwork\t\t: " << ms << endl <<
            "\tLab. Exercises\t\t: " << mle << endl <<
            "\tMidterm Exam\t\t: " << me << endl <<
            "\tTotal Midterm Grade\t: " << tmidtermg << endl;
    cout << "\nFinals\n" << endl <<
            "\tQuiz\t\t\t: " << fq << endl <<
            "\tSeatwork\t\t: " << fs << endl <<
            "\tLab. Exercises\t\t: " << fle << endl <<
            "\tMidterm Exam\t\t: " << fe << endl <<
            "\tTotal Final Grade\t: " << tfinalg << endl;
    cout << "\nRemarks\t\t\t\t: " << remarks << endl;
    cout << "-------------------------------------------------------------" << endl << endl;
    char finalchoice;
    finalchoiceloop:
    cout << "Do you want to restart the program? Select Y for yes and N for no.\n";
    cin >> finalchoice;
    switch (finalchoice) {
        case 'Y':
        case 'y':
            cin.clear();
            cin.ignore(50000,'\n');
            goto loopnaming;
            break;
        case 'N':
        case 'n':
            cout << "\nThank you for using this program!";
            break;
        default:
            cout << "\nInvalid input! Please try again.\n";
            goto finalchoiceloop;
    }
    return 0;
}
