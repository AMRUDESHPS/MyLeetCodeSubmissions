/*
 * 349. Intersection of Two Arrays
*/

import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int index = 0;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resHashSet = new HashSet<>();

        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            if(set1.contains(num)){
                resHashSet.add(num);
            }
        }
        int[] res = new int[resHashSet.size()];
        for (int num : resHashSet) {
            res[index++] = num;
        }

        return res;
    }
}
