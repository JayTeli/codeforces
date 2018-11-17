#include<stdio.h>
#include<math.h>
#include<iostream>
using namespace std;

int main() {

	unsigned long long t , n , s , k , sum , temp;
	cin>>t;

	while(t--) {
		cin>>n>>s>>k;
		sum = 0;
		for(long long i = 0 ; (sum < s) && (i < n) ; i++) {
			cin>>temp;
			sum += temp;
		}
		if(sum < s) {
			cout<<fixed<<(unsigned long long)ceill((long double)(s-sum)/k);
		} else {
			cout<<"0";
		}
		if(t > 0) cout<<endl;
	}

	return 0;
}
