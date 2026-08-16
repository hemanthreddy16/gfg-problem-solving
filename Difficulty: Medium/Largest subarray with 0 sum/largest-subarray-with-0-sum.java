class Solution {
    int maxLength(int arr[]) {
      
        // code here
        HashMap<Integer,Integer> a=new HashMap<>();
      int n=arr.length;
        int maxi=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum==0){
                maxi=i+1;
            }else if(a.containsKey(sum)){
                int len=i-a.get(sum);
                maxi=Math.max(len,maxi);
            }else{
                a.put(sum,i);
            }
        }
        return maxi;
    }
}