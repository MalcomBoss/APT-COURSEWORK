#include <iostream>
#include <string>

using namespace std;

int main() {
    string officialUser = "adminKE";
    string officialPass = "254Secure";

    string userTry, passTry;

    cout << "--- eCitizen Portal Login ---" << endl;
    cout << "Username: ";
    cin >> userTry;
    cout << "Password: ";
    cin >> passTry;

    if (userTry == officialUser && passTry == officialPass) {
        cout << "Access Granted" << endl;
    } else {
        cout << "Invalid Credentials" << endl;
    }

    return 0;
}