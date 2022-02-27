/**
 Problem Description:
 Given an array of integers A and an integer B,
 find and return the maximum value K such that there is no subarray in A of size K
 with sum of elements greater than B.

 Problem Constraints:
 1 <= |A| <= 100000
 1 <= A[i] <= 10^9
 1 <= B <= 10^9

 Input Format:
 The first argument given is the integer array A.
 The second argument given is integer B.

 Output Format:
 Return the maximum value of K (sub array length).

 Example Input:
 Input 1:
 A = [1, 2, 3, 4, 5]
 B = 10

 Input 2:
 A = [5, 17, 100, 11]
 B = 130

 Example Output:
 Output 1:
 2

 Output 2:
 3

 Example Explanation:
 Explanation 1:
 Constraints are satisfied for maximal value of 2.

 Explanation 2:
 Constraints are satisfied for maximal value of 3.
 **/
public class SpecialInteger {

    public int solve(int[] A, int B) {

        long[] prefix = new long[A.length];
        for (int i = 0; i < A.length; ++i) {
            prefix[i] = A[i];
        }

        //calculating the prefix sum;
        for (int i = 1; i < A.length; ++i)
            prefix[i] += prefix[i - 1];

        //Binary search for the for the length
        int lo = 1;
        int hi = A.length, ans = 0;
        while (lo <= hi) {
            int mid = (hi - lo) / 2 + lo; // to keep our mid towards the right
            if (check(mid, prefix, (long) B) == 1) {
                hi = mid - 1;
            } else {
                ans = mid;
                lo = mid + 1;
            }
        }
        return ans;

    }

    //tells if there is a subarray of size s
    //whose sum is greater than sm in linear time;
    int check(int s, long[] arr, long sm) {
        int flag = 0;
        for (int i = s - 1; i < arr.length; ++i) {
            if (i == s - 1) {
                if (arr[i] > sm)
                    return 1;
            } else if (arr[i] - arr[i - s] > sm) {
                return 1;
            }
        }
        return 0;
    }
}
