#include <bits/stdc++.h> 
using namespace std;

int main() {
    long  n , m , l , temp , p , d;
    vector<long> a;
    cin>>n>>m>>l;
    int segment = 0;
    for(long i = 0 ; i < n ; i++) {
        cin>>temp;
        if(temp >= l) {
            if(i == 0 || a[i-1] != -1) {
                segment++;
            }
            a.push_back(-1);
        } else {
            a.push_back(temp);
        } 
    }
    for(long i = 0 ; i < m ; i++) {
        cin>>temp;
        if(temp == 0) {
            cout<<segment<<endl;
        } else {
            cin>>p>>d;
            p = p-1;
            a[p] += d;
            if(a[p] >= l) {
                a[p] = -1;
                bool leftSegment = (p-1 < 0) || (a.at(p-1) == -1) ? true : false;
                bool rightSegment = (p+1 == n ) || (a.at(p+1) == -1) ? true : false;                
                if(leftSegment && rightSegment) {
                    segment--;
                } else if(!leftSegment && !rightSegment) {
                    segment++;
                }
            }
        }
    }
    
    return 0;
}