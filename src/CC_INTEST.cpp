#include <iostream>
using namespace std;

void solve() {
	int t , k , temp , ans = 0;
    cin>>t>>k;

    while(t--) {
       cin>>temp;
        if(temp % k == 0) {
            ans++;
        }
    }
    cout<<ans;
} 

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	solve();
	return 0;
}