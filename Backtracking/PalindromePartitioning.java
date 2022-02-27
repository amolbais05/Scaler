import java.util.ArrayList;

/**
 Problem Description:
 Given a string A, partition A such that every string of the partition is a palindrome.
 Return all possible palindrome partitioning of A.

 Ordering the results in the answer : Entry i will come before Entry j if :
 len(Entryi[0]) < len(Entryj[0]) OR
 (len(Entryi[0]) == len(Entryj[0]) AND len(Entryi[1]) < len(Entryj[1])) OR * * *
 (len(Entryi[0]) == len(Entryj[0]) AND ... len(Entryi[k] < len(Entryj[k]))

 Problem Constraints:
 1 <= len(A) <= 15

 Input Format:
 First argument is a string A of lowercase characters.

 Output Format:
 Return a list of all possible palindrome partitioning of s.

 Example Input:
 Input 1:
 A = "aab"

 Input 2:
 A = "a"

 Example Output:
 Output 1:
 [
 ["a","a","b"]
 ["aa","b"],
 ]

 Output 2:
 [
 ["a"]
 ]

 Example Explanation:
 Explanation 1:
 In the given example, ["a", "a", "b"] comes before ["aa", "b"] because len("a") < len("aa").

 Explanation 2:
 In the given example, only partition possible is "a" .
 **/
public class PalindromePartitioning {
    public ArrayList<ArrayList<String>> partition(String a) {
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        dfs(0, result, new ArrayList<String>(), a);
        return result;
    }
    void dfs(int start, ArrayList<ArrayList<String>> result, ArrayList<String> currentList, String a)
    {
        // base case
        if (start >= a.length())
        {
            result.add(new ArrayList<String>(currentList));
        }

        for (int end = start; end < a.length(); end++)
        {
            if (isPalindrome(a, start, end))
            {
                // adding current sub - string to currentList
                currentList.add(a.substring(start, end + 1));
                dfs(end + 1, result, currentList, a);
                // backtrack and remove substring from currentList
                currentList.remove(currentList.size() - 1);
            }
        }
    }

    boolean isPalindrome(String a, int low, int high)
    {
        while (low < high)
        {
            if (a.charAt(low++) != a.charAt(high--))
                return false;
        }
        return true;
    }
}
