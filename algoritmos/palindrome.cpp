#include <iostream>
using namespace std;



int main() {
int x = 0;
cin >> x;
bool is_p = false;

string num = to_string(x);

string y = "";
for(int i = num.size() - 1; i >= 0; i--) {
    y.push_back(num[i]);
}

// int i = stol(y);

if(num == y) {
    is_p = true;
} else {
    is_p = false;
}

cout << (is_p == true ? "True" : "False") << endl;

}