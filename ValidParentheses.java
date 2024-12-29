/*
 * 20. Valid Parentheses
*/

bool isValid(char* s) {
    int i = 0, j = 0;
    char stack[10000];

    while (s[i] != '\0') {

        if (s[i] == '{' || s[i] == '(' || s[i] == '[') {
            stack[j++] = s[i];
        }

        else if ((s[i] == ')' && j > 0 && stack[j - 1] == '(') ||
                 (s[i] == '}' && j > 0 && stack[j - 1] == '{') ||
                 (s[i] == ']' && j > 0 && stack[j - 1] == '[')) {
            j--;
        } else {
            return false;
        }
        i++;
    }

    return j == 0;
}
