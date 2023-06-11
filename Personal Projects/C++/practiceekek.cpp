//Fibonacci
#include <iostream>
#include <string>
using namespace std;

int sol(int k, int j) {
    return k + j;
}

int main() {
    cout << "0, 1, ";
    for (int i=2; i < 10; i++) {
        int nol = i - 1;
        int lol = i - 2;
        cout << sol(nol,lol) << ", ";
    }
    return 0;
}