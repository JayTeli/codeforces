#include <bits/stdc++.h>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--) {
		long n;
		cin>>n;
		char c[100000];
		int temp[100000];
		for(long i = 0 ; i < n ; i++) {
			cin>>c[i];
			temp[i] = (int)(c[i] - '0') ^ 1; // interchange 0 with 1 and viceversa
		}

		//  Largest subarray problem
		long max_so_far = 0 , max_ending_here = 0; 
	    for (long i = 0; i < n; i++)  {
	    	max_ending_here += temp[i];
	        max_so_far = (max_so_far < max_ending_here) ? max_ending_here : max_so_far;
	        max_ending_here = (temp[i] == 0) ? 0 : max_ending_here;
	    } 

		if(max_so_far == 0) {
			cout<<"-1"<<endl;
		} else {
			cout<<max_so_far<<endl;
		}
	}

	return 0;
}