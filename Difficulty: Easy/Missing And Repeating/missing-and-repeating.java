class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n=arr.length;
        long sn1=(long)n*(n+1)/2;
        long sn2=(long)n*(n+1)*(2*n+1)/6;
        long s1=0;
        long s2=0;
        for(int i=0;i<n;i++){
            s1+=(long)arr[i];
            s2+=(long)arr[i]*arr[i];
            
            
        }long val1=s1-sn1;
        long val2=s2-sn2;
        val2=val2/val1;
        long x=(val1+val2)/2;
        long y=x-val1;
        return new ArrayList<>(Arrays.asList((int)x, (int)y));
       
      }
    }

