class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int a=-1;
        int b=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>a){
                b=a;
               a=arr[i];
                
                
            }else if(arr[i]>b && arr[i]!=a){
                b=arr[i];
                
            }
            
        }
        return b;
    }
}