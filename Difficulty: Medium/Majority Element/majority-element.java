class Solution {
    int majorityElement(int arr[]) {
        // code here
       int n=arr.length;
       int max=0;
       for(int num:arr){
           max=Math.max(max,num);
           
       }
        
        
       
        
        
        
        int hash[]=new int[max+1];
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;

        if(hash[arr[i]]>n/2){
            return arr[i];
        }
        }return -1;
    }
}