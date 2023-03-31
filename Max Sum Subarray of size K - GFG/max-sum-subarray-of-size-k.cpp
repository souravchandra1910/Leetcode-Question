//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends

#define ll long long;
class Solution{  
public:
    long maximumSumSubarray(int k, vector<int>&arr , int N){
        long  sum=0;
        int i=0;
        int j=0;
        for(;i<k;i++){
            sum+=arr[i];
        }
        long maxi=sum;
        for(i=k;i<N;i++){
            sum-=arr[j];
            j++;
            sum+=arr[i];
            maxi=max(sum,maxi);
        }
        return maxi;
    }
};

//{ Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int N,K;
        cin >> N >> K;;
        vector<int>Arr;
        for(int i=0;i<N;++i){
            int x;
            cin>>x;
            Arr.push_back(x);
        }
        Solution ob;
        cout << ob.maximumSumSubarray(K,Arr,N) << endl;
    }
    return 0; 
} 
// } Driver Code Ends