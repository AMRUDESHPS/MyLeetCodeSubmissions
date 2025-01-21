/*
 * 13. Roman to Integer
*/

int romanToInt(char* s) {
    int num = 0;
    for(int i=0; i<strlen(s); i++) {
        if(s[i]=='M') {
            num = num + 1000;
        }
        if(s[i]=='D') {
            num = num + 500;
        }
        if(s[i]=='C') {
            if(s[i+1]=='D') {
                num = num + 400;
                 i++;
            }
            else if(s[i+1]=='M') {
                num = num + 900;
                 i++;
            }
            else {
                num = num + 100;
            }
        }
        if(s[i]=='L') {
            num = num + 50;
        }
        if(s[i]=='X') {
            if(s[i+1]=='L') {
                num = num + 40;
                 i++;
            }
            else if (s[i+1]=='C') {
                num = num + 90;
                 i++;
            }
            else {
                num = num + 10;
            }
        }
        if(s[i]=='V') {
            num = num + 5;
        }
        if(s[i]=='I') {
            if(s[i+1]=='V') {
                num = num + 4;
                i++;
            }
            else if(s[i+1]=='X') {
                num = num + 9;
                 i++;
            }
            else {
                num++;
            }
        }
    }
    return num;
}
