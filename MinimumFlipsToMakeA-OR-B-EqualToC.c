/*
 * 1318. Minimum Flips to Make a OR b Equal to c
*/

int minFlips(int a, int b, int c) {
    int flip = 0;

    while (a || b || c) {
        bool a_bit = a & 1;
        bool b_bit = b & 1;
        bool c_bit = c & 1;
        if ((a_bit | b_bit) != c_bit) {
            if (a_bit && b_bit) {
                flip += 2;
            } else {
                flip++;
            }
        }
        a = a >> 1;
        b = b >> 1;
        c = c >> 1;
    }
    return flip;
}
