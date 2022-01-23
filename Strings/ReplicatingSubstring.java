import java.util.HashMap;

public class ReplicatingSubstring {
    public int solve(int A, String B) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        B.chars().forEach(a -> freq.put(a, freq.getOrDefault(a, 0) + 1));
        return freq.values().stream().anyMatch(v -> v % A != 0) ? -1 : 1;
    }
}
