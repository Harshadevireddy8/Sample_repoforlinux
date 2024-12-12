public class SmallerthanCurrent {

        public int[] smallerNumbersThanCurrent(int[] nums) {
            
            int curr = nums[0];
            //Array to store the elements that are smaller than the current element.
            int[] smaller = new int[nums.length];
            for(int i = 0; i < nums.length; i++){
               int count = 0;
                for(int j = 0 ; j < nums.length; j++){
                if(nums[i] > nums[0]){
                   count ++;
                }
                smaller[i] = count;
                System.out.print(count);
                }
            }
        return smaller;
        }
    }
    

