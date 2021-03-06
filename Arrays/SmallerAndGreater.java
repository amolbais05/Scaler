import java.util.Arrays;

/*
Smaller and Greater
You are given an Array A of size N.

Find for how many elements, there is a strictly smaller element and a strictly greater element.

Input Format

Given only argument A an Array of Integers.
Output Format

Return an Integer X, i.e number of elements.
Constraints

1 <= N <= 1e5
1 <= A[i] <= 1e6
For Example

Example Input:
    A = [1, 2, 3]

Example Output:
    1

Explanation:
    only 2 have a strictly smaller and strictly greater element, 1 and 3 respectively.


*/
public class SmallerAndGreater {
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
