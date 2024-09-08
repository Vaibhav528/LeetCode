class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;  // Pointer for string a
        int j = b.length() - 1;  // Pointer for string b
        int carry = 0;

        // Iterate over both strings from the end to the beginning
        while (i >= 0 || j >= 0) {
            int sum = carry;  // Initialize the sum with the carry
            
            // Add the binary digits from string a and b if available
            if (i >= 0) {
                sum += a.charAt(i) - '0';  // Convert char to int
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';  // Convert char to int
                j--;
            }

            // Compute the current digit (sum % 2) and the carry (sum / 2)
            result.append(sum % 2);
            carry = sum / 2;
        }

        // If there's a remaining carry, append it to the result
        if (carry != 0) {
            result.append(carry);
        }

        // Reverse the result to get the correct order
        return result.reverse().toString();
    }
}