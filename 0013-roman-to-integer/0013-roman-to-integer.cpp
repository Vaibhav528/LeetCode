class Solution {
public:
    int romanToInt(string s) {
        unordered_map<char, int> roman_to_int_map = {
        {'I', 1},
        {'V', 5},
        {'X', 10},
        {'L', 50},
        {'C', 100},
        {'D', 500},
        {'M', 1000}
    };
    int total = 0;
    int prev_value = 0;
    for (char c : s) {
        int value = roman_to_int_map[c];
        if (prev_value < value) {
            total += value - 2 * prev_value;
        } else {
            total += value;
        }
        prev_value = value;
    }
    return total;
    }
};