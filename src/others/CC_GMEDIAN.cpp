#include <bits/stdc++.h>
using namespace std;

int main() {
	long t , n;
	vector<long> a;
	cin>>t; 
	while(t--) {
		cin>>n;
		long long good;
		for(int i = 0 ; i < n ; i++) {
			cin>>a[i];
		}

		// Odd Length Good Sequences
		good += n;	// all length 1 subsequences are good
		for(int i = 0 ; i < n ; i++) {
			if((i - 1) > 0 &&  (i + 1) < n) {
				if(a[i - 1] == a[i] || a[i + 1] == a[i]) {
					
				}
			}
		}
	}

	return 0;
}