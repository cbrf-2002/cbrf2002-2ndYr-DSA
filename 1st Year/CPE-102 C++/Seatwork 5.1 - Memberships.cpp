#include <iostream>
#include <string>
using namespace std;

void fee(string feecat, double fees, int month), menu(), bye(), byebye(), order();
int choice();

const double adult = 400.00, child = 500.00, senior = 600.00;

int main()
{
    int chc, month;
    do {
        menu();
        chc = choice();
        if (chc != 4) {
            cout << "For how many months? ";
            cin >> month;
            switch (chc) {
            case 1:
                fee("Standard Adult Membership", adult, month);
                break;
            case 2:
                fee("Child Membership", child, month);
                break;
            case 3:
                fee("Senior Citizen Membership", senior, month);
            }
        }
    }
    while (chc != 4);
    bye();
}
void menu() {
    cout << endl << "Welcome to Health Club Membership Menu\n" <<
    "----------------------------------------------------------\n" <<
    "\n1. Standard Adult Membership\n" <<
    "\n2. Child Membership\n" <<
	"\n3. Senior Citizen Membership\n" <<
	"\n4. End Program\n\n" <<
	"\n----------------------------------------------------------\n\n";
}
int choice() {
    int chc;
    looperchc:
    cout << "Please input your choice here: ";
    cin >> chc;
    if (4 < chc || chc < 1) {
        cout << "Invalid input! Please try again.\n";
        cin.clear();
        cin.ignore(50000, '\n');
        goto looperchc;
    }
    else if (chc == 4) {
        byebye();
    }
    else {
        return chc;
    }
    return chc;
}

void fee(string feecat, double fees, int month) {
    cout << "\n----------------------------------------------------------" << endl <<
    "\nYour order is:\n" <<
    "\nMembership Type\t\t: "  << feecat <<
    "\nNumber of months\t: "  << month <<
    "\nTotal charges\t\t: Php " << (fees * month) << endl << endl <<
    "----------------------------------------------------------";
    bye();
}
void bye() {
    looplastbye:
    cout << "\n\nDo you have other order/s? Press Y for yes and N for none.\n";
    char byechoice;
    cin >> byechoice;
    switch (byechoice) {
    case 'Y':
    case 'y':
        cout << "\nPress the Enter key to return to the menu.";
        cin.clear();
        cin.ignore(5000, '\n');
        cin.get();
        system("clear");
        main();
        break;
    case 'N':
    case 'n':
        cout << "\nThank you for using Health Club Membership program! Press Enter to quit.\n";
        cin.clear();
        cin.ignore(5000, '\n');
        cin.get();
        system("clear");
        terminate();
    default:
        cout << "\nInvalid input! Please try again.\n";
        cin.clear();
        cin.ignore(50000, '\n');
        goto looplastbye;
    }
}

void byebye() {
    cout << "\nThank you for using Health Club Membership program! Press Enter to quit.\n";
        cin.clear();
        cin.ignore(5000, '\n');
        cin.get();
        system("clear");
        terminate();
}

void terminate();
