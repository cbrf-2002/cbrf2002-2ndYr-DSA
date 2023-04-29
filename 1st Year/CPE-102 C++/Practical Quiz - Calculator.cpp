#include <iostream>

using namespace std;

int main()
{
    int a1, b1, c1, n1, m1, o1;
    a1 = b1 = c1 = 0;
    char inputwelcome, inputleave;
    cout << " _______________________________________________________________ \n"
	"|  _____________________________________________________________________  | \n"
	"| | 	 Welcome to the number Charles Fabian's calculator!              | | \n"
	"| |           Kindly Select your desired calculator here.               | | \n"
	"| |_____________________________________________________________________| | \n"
	"|_________________________________________________________________________| \n" << endl;
	selectorloop:
	cout << "\nSelect what type of calculator you want:" << endl <<
	"Type a for arithmetic sequence" << endl <<
	"Type b for geometric sequence" << endl <<
	"Type c for square number sequence" << endl <<
	"You can type small case or upper case letter for your choice.\n\n" << endl;
	cin >> inputwelcome;
	switch (inputwelcome) {
    case 'a':
    case'A':
        cout << "\n\nYou have selected arithmetic sequence calculator.\n" << endl;
        aritloop:
            n1 = 1;
        cout << "Input how many times we will calculate arithmetic sequence:\n" << endl;
        cin >> a1;
        while (cin.fail()) {
	    cout << "\nInvalid Input!\nPlease do it right...\n\n";
	    cin.clear();
	    cin.ignore(256,'\n');
	    goto aritloop; }
        cout << "\nThe sequence will repeat " << a1 <<" times." << endl;
        cout << "The sequence is: \n\n" << "1 " << endl;
        for (int i = 1; i < a1; ++i) {
            n1 = n1 + 3;
            cout << n1 << endl;
        }
        cout << endl;
        cout << "\nThank you for using our program! Would you like to try it again? Or go to main calculator selection? Or leave?\n" <<
        "Press e to try again\nPress w to go to main calculator selector\nOr press q to quit the program.\n\n";
        errorleaveloop:
        cin >> inputleave;
        switch (inputleave) {
    case 'E':
    case 'e':
        goto aritloop;
        break;
    case 'W':
    case 'w':
        goto selectorloop;
        break;
    case 'q':
    case 'Q':
        cout << "\n\nThank you for using Charles Fabian's calculator!\n";
        return 0;
    default:
        cout << "\nInvalid input!\nPlease enter a valid input again:\n\n";
        goto errorleaveloop;
        }
	break;
	case 'b':
    case'B':
	cout << "\n\nYou have selected geometric sequence calculator.\n" << endl;
	geoloop:
	    m1 = 1;
    cout << "Input how many times we will calculate geometric sequence:\n" << endl;
        cin >> b1;
        while (cin.fail()) {
	    cout << "\nInvalid Input!\nPlease do it right...\n\n";
	    cin.clear();
	    cin.ignore(256,'\n');
	    goto geoloop; }
        cout << "\nThe sequence will repeat " << b1 <<" times." << endl;
        cout << "The sequence is: \n\n" << "1" << endl;
        for (int i = 1; i < b1; ++i) {
            m1 = m1 * 3;
            cout << m1 << endl;
        }
        cout << endl;
        cout << "\nThank you for using our program! Would you like to try it again? Or go to main calculator selection? Or leave?\n" <<
        "Press e to try again\nPress w to go to main calculator selector\nOr press q to quit the program.\n\n";
        errorleaveloopgeo:
        cin >> inputleave;
        switch (inputleave) {
    case 'E':
    case 'e':
        goto geoloop;
        break;
    case 'W':
    case 'w':
        goto selectorloop;
        break;
    case 'q':
    case 'Q':
        cout << "\n\nThank you for using Charles Fabian's calculator!\n";
        return 0;
    default:
        cout << "\nInvalid input!\nPlease enter a valid input again:\n\n";
        goto errorleaveloopgeo;
        break;
        }
	break;
	case 'c':
    case'C':
	cout << "\n\nYou have selected square sequence calculator.\n" << endl;
	sqloop:
	    o1 = 1;
    cout << "Input how many times we will calculate square sequence:\n" << endl;
        cin >> c1;
        while (cin.fail()) {
	    cout << "\nInvalid Input!\nPlease do it right...\n\n";
	    cin.clear();
	    cin.ignore(256,'\n');
	    goto geoloop; }
        cout << "\nThe sequence will repeat " << c1 <<" times." << endl;
        cout << "The sequence is: \n\n" << endl;
        for (int i = 1; i <= c1; ++i) {
            o1 = i * i;
            cout << o1 << endl;
        }
        cout << endl;
        cout << "\nThank you for using our program! Would you like to try it again? Or go to main calculator selection? Or leave?\n" <<
        "Press e to try again\nPress w to go to main calculator selector\nOr press q to quit the program.\n\n";
        errorleaveloopsq:
        cin >> inputleave;
        switch (inputleave) {
    case 'E':
    case 'e':
        goto sqloop;
        break;
    case 'W':
    case 'w':
        goto selectorloop;
        break;
    case 'q':
    case 'Q':
        cout << "\n\nThank you for using Charles Fabian's calculator!\n";
        return 0;
    default:
        cout << "\nInvalid input!\nPlease enter a valid input again:\n\n";
        goto errorleaveloopsq;
        break;
        }
	break;
	default:
        cout << "\nInvalid input!\nPlease try again.\n\n";
        cin.clear();
        goto selectorloop;
        break;
	}
    return 0;
}
