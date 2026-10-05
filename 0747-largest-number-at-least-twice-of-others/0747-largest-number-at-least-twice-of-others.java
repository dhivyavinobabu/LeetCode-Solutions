class Solution {
    public int dominantIndex(int[] nums) {
    if(nums == null || nums.length==0){
        return -1;
    }
    if(nums.length==1){
        return 0;
    }
    int largest =Integer.MIN_VALUE;
    int seclargest=Integer.MIN_VALUE;
    int largestindex =-1;
    for (int i= 0;i<nums.length;i++){
        if(nums[i]>largest){
            seclargest=largest;
            largest=nums[i];
            largestindex=i;
        }
        else if(nums[i]>seclargest){
            seclargest=nums[i];
        }
    }
        if((long)largest>=2*(long)seclargest){
            return largestindex;
        }
        else{
            return -1;
        }
    }
}
// class Solution {
//     public int dominantIndex(int[] nums) {
//         int max = 0;
//         for (int i = 0; i < nums.length; ++i) {
//             if (nums[i] > nums[max])
//                 max = i;
//         }
//         for (int i = 0; i < nums.length; ++i) {
//             if (max != i && nums[max] < 2 * nums[i])
//                 return -1;
//         }
//         return max;
//     }
// }