class Solution {

    void printTriangle(int n) {
        // code here
        
        for(int i = 1; i <= n; i++) {
            
            int start = i % 2; 
            
            for(int j = 1; j <= i; j++) {
                System.out.print(start+" ");
                start = 1 - start; 
            }
            System.out.println();
        }
    }
}
