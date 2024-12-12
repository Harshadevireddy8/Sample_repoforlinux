class sortColors {
    public void sortColors(int[] nums) {
        
        Sort(nums);
    }
    public static void Sort(int[] nums){
        //Using InsertionSort
        for(int i = 1;i < nums.length; i++){
            int curr = nums[i];
            int prev = i-1;
        while(prev>= 0 && nums[prev] > curr){
            nums[prev +1] = nums[prev];
            prev--;
        }
        nums[prev+1]= curr;
        }
            
    }
}