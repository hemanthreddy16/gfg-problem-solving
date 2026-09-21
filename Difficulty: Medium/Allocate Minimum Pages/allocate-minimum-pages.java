class Solution {
    public int findPages(int[] arr, int k) {
        if(arr.length<k){
            return -1;
        }
        long low=0;
        long high=0;
        for(int a:arr){
            low=Math.max(low,a);
            high+=a;
        }
        long ans=high;
        while(low<=high){
            long mid=(low+high)/2;
            if(canreceive(arr,k,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
       return (int)ans; 
    }
    
    public boolean canreceive(int[]arr,int k,long maxi){
        int student=1;
        int m=0;
        for(int a:arr){
            if(a+m<=maxi){
                m+=a;
            }else{
                student++;
                m=a;
            }
        }return student<=k;
    }
}

