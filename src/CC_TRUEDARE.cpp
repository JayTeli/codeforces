#include <iostream>
#include <set>
using namespace std;

void solve() {
	int t , temp , temp2;
	cin>>t;
	
	while(t--) {
		set<int> truth;
		set<int> dare;
		bool shyamwins = false;

		cin>>temp;
		while(temp--) {
			cin>>temp2;
			truth.insert(temp2);
		}
		cin>>temp;
		while(temp--) {
			cin>>temp2;
			dare.insert(temp2);
		}
		cin>>temp;
		while(temp--) {
			cin>>temp2;
			if(truth.count(temp2) == 0) {
				shyamwins = true;
			}
		}
		cin>>temp;
		while(temp--) {
			cin>>temp2;
			if(dare.count(temp2) == 0) {
				shyamwins = true;
			}
		}

		if(shyamwins) {
			cout<<"no"<<"\n";
		} else {
			cout<<"yes"<<"\n";
		}
	}
} 

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	solve();
	return 0;
}