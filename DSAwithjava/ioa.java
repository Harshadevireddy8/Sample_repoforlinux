import java.util.*;

public class ioa {
    public static void main(String[] args) {
        int[] nums1 = {1,2,1};
        int[] nums2 = {2,4};

        for(int i = 0; i <= nums1.length-1;i++){
            for(int j = 0; j <= nums2.length-1;j++){
                if(nums1[i] == nums2[j]){
                    System.out.println(nums1[i]);
                }
            }
        }       
    }
}
   
