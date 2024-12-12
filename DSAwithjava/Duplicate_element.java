import java.util.*;
public class Duplicate_element{
    public static void main(String[] args) {
        int nums[] = {1,2,1,2,3,7,4};

        for(int i = 0; i < nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                System.out.println(Arrays.toString(nums));
            }
        }
    }
}