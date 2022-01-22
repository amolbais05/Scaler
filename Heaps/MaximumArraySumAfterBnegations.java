public class MaximumArraySumAfterBnegations {
    public int solve(int[] A, int B) {
        PriorityQueue < Integer > pq = new PriorityQueue();

        // insert all elements into the queue
        for (int x: A) pq.offer(x);

        // perform B modifications

        while (B > 0) {
            // pop minimum lement from the queue
            int x = pq.poll();

            // if minimum element is 0, we will use all remaining opeations on this and the result will be same
            if (x == 0) {
                B = 0;
            }
            // if minimum element is negative, modify the element to -x and push -x to queue.
            else if (x < 0) {
                pq.offer(-x);
            } else {
                //if remaining operations are even, then in one operation we convert x to -x and in another -x to x. So, no change
                //if operations are odd, we will change the number to -x. Set B = 0.
                if (B % 2 == 0) {
                    pq.offer(x);
                } else {
                    pq.offer(-x);
                }

                B = 0;
                break;
            }

            B--;
        }

        int ans = 0;

        // add all the elements in the queue to the answer
        while (pq.size() > 0) {
            ans += pq.poll();
        }

        return ans;
    }
}