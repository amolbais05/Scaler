public class Solution {
    public int candy(int[] A) {
        int[] candies = new int[A.length];
        //Give each child 1 candy
        Arrays.fill(candies, 1);

        //From Left to right :  if child to right has higher rating—>give right child 1 candy extra than no. of candies to left child
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }
       
        //From right to left :  if child to left has higher rating—>give left child 1 candy extra than no. of candies to right child
        for (int i = A.length - 2; i >= 0; i--) {
            if (A[i] > A[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        int maxSum=0;
        for(int val:candies) maxSum += val;

        return maxSum;
    }
}
