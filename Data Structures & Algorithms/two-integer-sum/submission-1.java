class Solution {
    
   
    // public int[] twoSum(int[] nums, int target) {

    //     int[] indexOfSum = new int[2];
    //     for(int i=0; i<nums.length; i++){
    //         for(int j=i+1 ; j<nums.length; j++){
    //             if(nums[i] + nums[j]== target){
    //                 indexOfSum[0] = i;
    //                 indexOfSum[1] = j;
    //             }
    //         }


    //     }
    //     return indexOfSum;
        
    // } 

    //Solution 2 
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> mapOfArray =  new HashMap<>();
        int diff = 0;

        for(int i=0; i<nums.length; i++){

            diff = target - nums[i];
            if(mapOfArray.containsKey(diff)){

                return new int[]{mapOfArray.get(diff), i};
            }
            else{
                mapOfArray.put(nums[i], i);
            }
        }

        return null;

    }





}
