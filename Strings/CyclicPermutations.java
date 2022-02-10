public class CyclicPermutations {
    public static int solve(String A, String B) {
        int n=A.length();
        // append the same string so that
        // we can use sliding window to find the cyclic permutation
        B += B;
        int count = 0;

        for(int i=0; i<A.length(); i++) {
            // slide through B and compare with A
            if(B.substring(i,i+n).equals(A)) count++;
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(solve("ABA","ABA"));
    }
}
