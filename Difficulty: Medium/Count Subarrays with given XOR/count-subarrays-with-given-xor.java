import java.util.HashMap;
class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
          int xor=0;
        int n=arr.length;
        HashMap<Integer,Integer> m=new HashMap<>();
      
        int c=0;
       m.put(0,1);
        for(int i=0;i<n;i++){
            xor=xor^arr[i];
            
            int x=xor^k;
            c+=m.getOrDefault(x,0);
        m.put(xor, m.getOrDefault(xor, 0) + 1);
            
            
        }
        return c;
    }
}