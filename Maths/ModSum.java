import java.util.ArrayList;

/**
 Problem Description:
 Given an array of integers A, calculate the sum of A [ i ] % A [ j ] for all possible i, j pairs.
 Return sum % (109 + 7) as an output.

 Problem Constraints:
 1 <= length of the array A <= 105
 1 <= A[i] <= 103

 Input Format:
 The only argument given is the integer array A.

 Output Format:
 Return a single integer denoting sum % (109 + 7).

 Example Input:
 Input 1:
 A = [1, 2, 3]

 Input 2:
 A = [17, 100, 11]

 Example Output:
 Output 1:
 5

 Output 2:
 61

 Example Explanation
 Explanation 1:
 (1 % 1) + (1 % 2) + (1 % 3) + (2 % 1) + (2 % 2) + (2 % 3) + (3 % 1) + (3 % 2) + (3 % 3) = 5

 **/

public class ModSum {

    public int solve(ArrayList<Integer> A) {
        int n = A.size(), mod = 1000 * 1000 * 1000 + 7;

        int[] cnt = new int[1009];
        for(int a: A)    cnt[a]++;
        int ans = 0;

        for(int i = 1; i <= 1000; i++)
        {
            int a = cnt[i];
            if(cnt[i] == 0)    continue;
            for(int j = 1; j <= 1000; j++)
            {
                if(cnt[j] == 0)    continue;
                int b = cnt[j];
                int val = j % i;

                int temp = cnt[i] * cnt[j] * val;
                ans = ((ans % mod) + (temp % mod)) % mod;
            }
        }
        return ans;
    }

}
