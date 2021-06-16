/*
Elements which have at-least two greater elements

Problem Description

You are given an array of distinct integers A, you have to find and return all elements in array which have at-least two greater elements than themselves.

NOTE: The result should have the order in which they are present in the original array.

Problem Constraints
3 <= |A| <= 105

-109 <= A[i] <= 109

Input Format
First and only argument is an integer array A.

Output Format
Return an integer array containing the elements of A which have at-least two greater elements than themselves in A.

Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [11, 17, 100, 5]

Example Output
Output 1:

 [1, 2, 3]
Output 2:

 [11, 5]

Example Explanation
Explanation 1:

 Number of elements greater than 1: 4
 Number of elements greater than 2: 3
 Number of elements greater than 3: 2
 Number of elements greater than 4: 1
 Number of elements greater than 5: 0
 Elements 1, 2 and 3 have atleast 2 elements strictly greater than themselves.
 
Explanation 2:

 Number of elements greater than 11: 2
 Number of elements greater than 17: 1
 Number of elements great
 */

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Integer max_1 = A.stream().mapToInt(value -> value).max().getAsInt();
        A.remove(max_1);
        Integer max_2 = A.stream().mapToInt(value -> value).max().getAsInt();
        A.remove(max_2);
       
       return A; 
     /*   ArrayList<Integer> output = new ArrayList<>();
        for(int i =0 ; i < A.size() ; i++){
            output.add(A.get(i));
        }
        return output;*/
    }
}
