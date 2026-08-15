class Solution {
    public int longestConsecutive(int[] arr) {
        // code here
        int n=arr.length;
        int longest=1;

        HashSet<Integer> map=new HashSet<>();
        for(int i=0;i<n;i++){
            map.add(arr[i]);
        }
        for(int item:map){
            if (!map.contains(item - 1)) {
                int c=1;
                int x=item;
                while(map.contains(x+1)){
                    c=c+1;;
                    x=x+1;
                }

                longest=Math.max(longest,c);

            }
        }return longest;
    }
}