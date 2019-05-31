#include <bits/stdc++.h> 
using namespace std;

int main() {
    int n , s , temp;
    cin>>n>>s;
    bool impossible = false;
    bool reached = false;
    int ahead = 0;
    for(int i = 1 ; i <= n ; i++ ) {
        cin>>temp;
        if(i == 1 && temp == 0) {
            impossible = true;
            break;
        } else if(i == s && temp == 1) {
            reached = true;
            break;
        } else if(i > s && temp == 1){
            ahead = i;
            break;
        } 
    }
    if(reached){
        cout<<"YES";
    } else if(impossible || ahead == 0) {
        cout<<"NO";
    } else {
        for(int i = 1 ; i <= n ; i++ ) {
            cin>>temp;
            if(i == s || i <= ahead && temp == 0) {
                impossible = true;
                break;
            } else if(i == n && temp == 0) {
                impossible = true;
            }
        }

        if(impossible) {
            cout<<"NO";
        } else {
            cout<<"YES";
        }
    }

    return 0;
}