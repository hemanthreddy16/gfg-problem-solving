// User function Template for Java

class Solution {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) {
    int start=-1;
    int end=-1;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
            start=i;break;
        }
    }for(int i=arr.length-1;i>=0;i--){
        if(arr[i]==key){
            end=i;break;
        }
    } return new int[] {start,end};
        // code here.
    }
}