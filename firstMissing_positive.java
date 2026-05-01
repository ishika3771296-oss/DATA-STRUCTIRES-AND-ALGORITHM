//https://leetcode.com/problems/first-missing-positive/
public class firstMissing_positive {
    public static void main(String[] args) {
        int[] nums={7,8,9,11,12};
        int result = firstMissingPositive(nums);
        System.out.println(result);
    }
     public static int firstMissingPositive(int[] nums) {
         int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]>=1 && nums[i]<= nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        //just find missing numbers;
        //return 1st positive missing number
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return nums.length + 1;
    }
    
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
