/*
 * 8. String to Integer (atoi)
*/

class Solution {
    public int myAtoi(String s) {
        int INT_MAX = 2147483647, INT_MIN = -2147483648;
        int n=s.length(), i=0, result = 0, sign = 1, digit;
        char ch;

        while(i < n && s.charAt(i)== ' ') {
            i++;
        }
        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }
        while(i < n && Character.isDigit(s.charAt(i))){
            ch = s.charAt(i);
	        digit = (int)ch - (int)'0';
            if (result > (INT_MAX - digit) / 10) {
                return sign == 1 ? INT_MAX : INT_MIN;
            }
            result = result * 10 + digit;
            i++;
        }
        return (sign * result);
    }
}
