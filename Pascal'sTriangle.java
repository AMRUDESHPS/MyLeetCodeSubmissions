/*
 * 118. Pascal's Triangle
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            int coef = 1;
            row.add(coef);
            for (int j = 1; j <= i; j++) {
                coef = coef * (i - j + 1) / j;
                row.add(coef);
            }
            res.add(row);
        }
        return res;
    }
}
