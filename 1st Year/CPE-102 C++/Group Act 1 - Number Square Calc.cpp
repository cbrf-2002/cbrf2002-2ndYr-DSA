#include <iostream>
using namespace std;
/*
CPE11S2
By:
Eusebio
Fabian
Lumasang
Kintanar
Roxas
*/

int main() {
	double i1, i2, i3, i4, i5, a1, a2, a3, a4, a5;
	char choice;
	mainloop:
	cout << " _______________________________________________________________ \n"
	"|  ____________________________________________________________  | \n"
	"| | 	 Welcome to the number square calculator!              | | \n"
	"| |  Kindly input your desired number here, now with decimals! | | \n"
	"| |____________________________________________________________| | \n"
	"|________________________________________________________________| \n" << endl;
	cout << "Enter 5 numbers to calculate square: \n" << endl;
	cout << "_____________________________________________________ \n" << endl;
	cin >> i1 >> i2 >> i3 >> i4 >> i5;
	cout << endl;
	while (cin.fail()) {
	    cout << "Invalid Input!\n";
	    cin.clear();
	    cin.ignore(256,'\n');
	    goto mainloop;
	    }
	cout << "_____________________________________________________ \n" << endl;
	if (i1 < 0) {
        a1 = i1 * -(i1);
	}
	else {
        a1 = i1 * i1;
	}
	if (i2 < 0) {
        a2 = i2 * -(i2);
	}
	else {
        a2 = i2 * i2;
	}
	if (i3 < 0) {
        a3 = i3 * -(i3);
	}
	else {
        a3 = i3 * i3;
	}
	if (i4< 0) {
        a4 = i4 * -(i4);
	}
	else {
        a4 = i4 * i4;
	}
	if (i5 < 0) {
        a5 = i5 * -(i5);
	}
	else {
        a5 = i5 * i5;
	}
	cout  <<
	"Program Output \t\t Number Squared\n" <<
	"********************************************\n" <<
    i1 << "\t\t\t" << a1  << endl <<
	i2 << "\t\t\t" << a2  << endl <<
	i3 << "\t\t\t" << a3  << endl <<
	i4 << "\t\t\t" << a4  << endl <<
	i5 << "\t\t\t" << a5  << endl <<
	"********************************************\n" << endl;
	ininloop:
	cout << "Do you want to do it again? Enter Y for yes and N to exit program." <<endl;
	cin >> choice;
	switch (choice) {
	    case 'Y':
	    goto mainloop;
	    break;
	    case 'N':
	    cout << endl <<
	    " ^ ^                                       \n"
        "(O,O)                                      \n"
        "(   ) Thank you for using this program!    \n"
        "-v-v---------------------------------------\n"
        << endl;
	    return 0;
	    break;
	    default:
	    cout << "Invalid input!"<<endl;
	    goto ininloop;
	    break;
	    }

}