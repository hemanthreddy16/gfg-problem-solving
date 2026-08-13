class Solution {
    int stockBuySell(int arr[]) {
        // code here
        int n=arr.length;
        
        int p=0;
        for(int i=1;i<n;i++){
           if(arr[i]>arr[i-1]){
               p+=arr[i]-arr[i-1];
           }
        }
        return p;
    }
}
