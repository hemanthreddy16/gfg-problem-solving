class Solution {
    public  ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
     Set<Integer> set = new TreeSet<>();
        int n1=a.length;
        int n2=b.length;
       for(int num:a){
           set.add(num);
       } for(int num:b){
           set.add(num);
       }return new ArrayList<>(set);
            }
        }