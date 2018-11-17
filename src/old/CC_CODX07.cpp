#include <bits/stdc++.h> 
using namespace std;
#define MAX_NUM 10000000

int spf[MAX_NUM];  //  spf[i] is "smallest prime factor" of i
   
// O(nloglogn)
void sieve() { 
    spf[1] = 1; 

    // Mark i divides i for all i
    // Reason : After reaching index=2 to index=i , if spf[i] = i then i is prime
    for (int i = 2 ; i < MAX_NUM ; i++) {
        spf[i] = i; 
    }
  
    // Set 2 as smallest prime factor of all even nos > 2
    for (int i = 4 ; i < MAX_NUM ; i += 2) {
        spf[i] = 2; 
    }
    
    // i*i coz while checking prime or no we check upto sqrt , this is reverse of it.
    for (int i = 3 ; i*i < MAX_NUM ; i++) { 
        // checking if i is prime 
        if (spf[i] == i) 
        { 
            // marking SPF for all numbers divisible by i 
            // j=i*i and not 2*i coz for 2i , spf is 2 , and so on
            for (int j = i*i ; j < MAX_NUM ; j += i) {
                if (spf[j] == j) {
                    spf[j] = i; 
                }
            }
        } 
    } 
} 
  
// returns primefactorization of x by dividing by smallest prime factor of x at every step.
// O(log n)
vector<int> getFactorization(int x) { 
    vector<int> ret; 
    while (x != 1) { 
        ret.push_back(spf[x]); 
        x = x / spf[x];
        
    } 
    return ret; 
} 
  
// driver program for above function 
int main() { 

    int t;
    cin>>t;

    // precalculating Smallest Prime Factor of all nos
    sieve();

    long x , y;
    while(t--) {
        cin>>x>>y;
        long ans = 0; 
        if(x % y == 0) {
            vector <int> p = getFactorization(x / y);
            int prev_factor = 0;
            int freq = 0;
            ans = 1;
            for (int i = 0; i < p.size() ; i++) {
                if(p[i] == prev_factor) {
                    freq++;
                } else {
                    ans *= (freq + 1);
                    prev_factor = p[i];
                    freq = 1;
                }
            }
            ans *= (freq + 1);
        } 
        cout<<ans;
        if(t > 0) cout<<endl;
    }

    return 0; 
} 