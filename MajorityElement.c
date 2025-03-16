/*
 * 169. Majority Element
*/

int majorityElement(int* nums, int numsSize) {
    int i, res, count = 0;
    res = nums[0];
    for (i = 0; i < numsSize; i++) {
        if(res == nums[i]){
            count++;
        }else{
            count--;
        }
        if(count == 0){
            res = nums[i];
            count++;
        }
    }
    return res;
}
