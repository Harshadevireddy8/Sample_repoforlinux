import java.util.*;

public class concex {
    int nums[] ={1,2,3,3,4,2,4,5};
    int nums1[] ={9,8,7,6};

    

    int n = nums.length;
    int [] concat = new int [2 * n];

    for(int i = 0; i < nums.length; i++){
        concat[i] = nums[i];
        concat[i+n] = nums1[i];
    }
    System.out.println(concat);
    return concat;
}
