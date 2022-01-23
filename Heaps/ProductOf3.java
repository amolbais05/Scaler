import java.util.ArrayList;
import java.util.PriorityQueue;

public class ProductOf3 {

    public ArrayList<Integer> solve(ArrayList<Integer> A)
    {

        int N = A.size();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i < N ; i++)
        {
            pq.add(A.get(i));
            if(i < 2)
            {
                ans.add(-1);
            }
            else
            {
                int a = pq.peek();
                pq.poll();
                int b = pq.peek();
                pq.poll();
                int c = pq.peek();
                pq.poll();
                pq.add(a);
                pq.add(b);
                pq.add(c);
                ans.add(a*b*c);
            }
        }
        return ans;
    }
}
