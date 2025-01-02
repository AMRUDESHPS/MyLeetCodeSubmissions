/*
 * 58. Length of Last Word
*/

int lengthOfLastWord(char* s) {
    int i = strlen(s) - 1;
    int count = 0;

    while (i >= 0 && s[i] == ' ') {
        --i;
    }
    while (i >= 0 && s[i] != ' ') {
        --i;
        ++count;
    }

    return count;
}
