/*
 *136. Single Number
*/

int singleNumber(int* nums, int numsSize) {
    int res = 0, n;
    for (int i = 0; i < numsSize; i++) {
        n = nums[i];
        res = res ^ n;
    }
    return res;
}
