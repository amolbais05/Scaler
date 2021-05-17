package geeksforgeeks.array;

public class CheckKeyIsPresent {
    public static void main(String[] args) {

        System.out.println(solve(new int[]{3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3},5,25));
    }
    private static boolean solve(final int[] A, int K, int X) {

        int N = A.length;

        for(int i = 0; i < N ; i = i + K){
			
			for(int j = 0 ; j < K ; j++){
				
				if(i+j < N && A[i+j]==X)
					return true;
				
			}
		}
		return false;
    }
}
