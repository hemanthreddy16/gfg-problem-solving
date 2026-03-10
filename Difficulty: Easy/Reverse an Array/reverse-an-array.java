class Solution {
    public void reverseArray(int arr[]) {
      int temp=0;
        if(arr.length%2==0){
            for(int i=0;i<arr.length/2;i++){
                temp=arr[i];
                arr[i]=arr[arr.length-i-1];
                arr[arr.length-i-1]=temp;
            }
        }
        if(arr.length%2==1){
            for(int i=0;i<(arr.length-1)/2;i++){
                temp=arr[i];
                arr[i]=arr[arr.length-i-1];
                arr[arr.length-i-1]=temp;
            }
        }
       
    }
}
