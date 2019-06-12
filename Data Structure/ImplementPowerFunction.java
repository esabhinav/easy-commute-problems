public class Solution {
    public int pow(int x, int n, int d) {
    long p=1, q=x; 
    while (n > 0) {
        if (n%2 == 1) {
            p = (p*q) % d;
        }
        q = (q*q) % d;
        n /= 2;
    }
    int value = (int)p % d;
    if(value>=0)
        return value; 
    else 
        return d+value; // negative values not returned
    }
}
