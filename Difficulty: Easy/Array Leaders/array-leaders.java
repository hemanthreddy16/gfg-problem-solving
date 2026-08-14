class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> a=new ArrayList<>();
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=maxi){
                a.add(arr[i]);
            
            maxi=arr[i];
        }
        }
        Collections.reverse(a);
        return a;
    }
}
    