class Solution {
    public int visibleBuildings(int arr[]) {
        // code here
        int c=1;
        int num=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=num){
                num=arr[i];
                
                c++;
            }
        }return c;
    }
}