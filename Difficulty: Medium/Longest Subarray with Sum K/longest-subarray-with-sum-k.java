class Solution {
    public int longestSubarray(int[] arr, int k) {
        HashMap <Integer, Integer> map=new HashMap<>();
        int n=arr.length;
        int m=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum==k){
                m=i+1;
            }
            if(map.containsKey(sum-k)){
                int len=i-map.get(sum-k);
                m=Math.max(m,len);
                
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }return m;
        
    }
}
