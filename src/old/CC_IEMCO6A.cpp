#include <bits/stdc++.h>
using namespace std;
int main() {
	int t;
	cin>>t;
	while(t--) {
		long n , k , m , temp;
		cin>>n>>k>>m;
		vector<long> likes;
		vector<long> others;
		vector<long> hates;
		for(long i = 0 ; i < n ; i++ ) {
			cin>>temp;
			if(temp == k) {
				//likes.insert(likes.begin(), temp); // too slow.. time limit exceeded bcoz of this
				likes.push_back(temp);
			} else if(temp == m) {
				hates.push_back(temp);
			} else {
				others.push_back(temp);
			}
		}
		long no_of_likes = likes.size();
		long no_of_others = others.size();
		long no_of_hates = hates.size();
		for(long i = no_of_likes -1 ; i >= 0; i--) {
			cout<<likes[i];
			if(i != no_of_likes - 1) 
				cout<<" ";
		}

		if(no_of_others > 0) {
			cout<<" ";
			for(long i = 0 ; i < no_of_others; i++) {
				cout<<others[i];
				if(i != no_of_others - 1) 
						cout<<" ";
			}	
		}

		if(no_of_hates > 0) {
			cout<<" ";
			for(long i = 0 ; i < no_of_hates; i++) {
				cout<<hates[i];
				if(i != no_of_hates - 1) 
					cout<<" ";
			}	
		}
	} 
	return 0;
}