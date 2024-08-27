class Solution {
public:
    bool isPalindrome(int x) {
    if (x < 0 || (x % 10 == 0 && x != 0)) {
        return false;
    }

    long long original = x; 
    long long reversed = 0;

    while (x > 0) {
        int digit = x % 10;
        if (reversed > (numeric_limits<long long>::max() - digit) / 10) {
            return false; 
        }
        reversed = reversed * 10 + digit;
        x /= 10;
    }

    return original == reversed;
  }
};