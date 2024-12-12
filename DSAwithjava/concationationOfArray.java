import java.util.*;
class concationationOfArray {
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length;
        int [] concat = new int[2 * n];

        for(int i = 0; i < nums.length; i++){
            concat[i] = nums[i];
            concat[i+n] = nums[i];
        }
        System.out.println(Arrays.toString(concat));
        return concat;
    }
    
}