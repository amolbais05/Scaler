package geeksforgeeks.array;

import java.util.Arrays;

public class MinMaxInArray {
    public static void main(String[] args) {
        solve();
    }
    private static void solve(){
        int[] A = {89,45,12,10,40,20,70};

        // Method 1
        int max = Arrays.stream(A).max().getAsInt();
        int min = Arrays.stream(A).min().getAsInt();

        System.out.println("Max : "+max+" Min : "+min);

        // Method 2
        int max2 = 0, min2 = A[0];
        for(int i = 0 ; i < A.length ; i++){
            max2 = Math.max(max2,A[i]);
        }
        for(int i = 0 ; i < A.length ; i++){
            min2 = Math.min(min2,A[i]);
        }

        System.out.println("Max : "+max2+" Min : "+min2);
    }
}
