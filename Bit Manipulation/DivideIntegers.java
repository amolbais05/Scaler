/**
 Problem Description:
 Divide two integers without using multiplication, division and mod operator.
 Return the floor of the result of the division.
 Also, consider if there can be overflow cases i.e output is greater than INT_MAX, return INT_MAX.

 NOTE: INT_MAX = 2^31 - 1

 Problem Constraints
 -231 <= A, B <= 231-1
 B!= 0

 Input Format:
 First argument is an integer A denoting the dividend.
 Second argument is an integer B denoting the divisor.

 Output Format:
 Return an integer denoting the floor value of the division.

 Example Input:
 Input 1:
 A = 5
 B = 2

 Input 2:
 A = 7
 B = 1

 Example Output
 Output 1:
 2

 Output 2:
 7

 Example Explanation
 Explanation 1:
 floor(5/2) = 2
 **/

public class DivideIntegers {
    public int divide(int A, int B) {
        if(A == (1<<31) && B == -1)
            return (1<<31)-1;
        int sign = (A<0)^(B<0) ? -1 : 1;
        long a = Math.abs(1L*A);
        long b = Math.abs(1L*B);
        int res = 0;
        for(int i=31; i>=0; i--)
        {
            if( a-(b<<i) >= 0)
            {
                res += 1<<i;
                a -= b<<i;
            }
        }
        return res*sign;
    }
}
