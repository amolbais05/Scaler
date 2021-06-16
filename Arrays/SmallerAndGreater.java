public class Solution {
    public int solve(int[] A) {
        int N = A.length;      
        int min = Arrays.stream(A).min().getAsInt();
        int max = Arrays.stream(A).max().getAsInt();
        int count = 0;
        
        for(int i = 0 ; i < N ; i++){
            if(min < A[i] && A[i] < max){
                count++;
            }
        }
        return count;
    }
    
}
