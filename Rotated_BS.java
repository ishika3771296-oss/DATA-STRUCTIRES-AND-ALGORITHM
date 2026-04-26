//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class Rotated_BS {
    public static void main(String[] args){
        int[] nums={4,5,6,7,0,1,2};
        int target=0;
        int ans=search(nums, target);
        System.out.println(ans);

    }
    public static int search(int[] nums, int target) {
        int pivot=FindPivot(nums);
        //if you did not find a pivot,it means the array is not rotated
        if(pivot==-1){
            //just do normal binary search
            return binarysearch(nums, target, 0,nums.length-1);
        }
        //if pivot is found,you have 2 asc sorted arrays
        // 
        if(nums[pivot]==target){
            return pivot;
        }
        else if(target>=nums[0]){
            return binarysearch(nums, target,0,pivot-1);
        }
        else{
            return binarysearch(nums, target, pivot+1,nums.length-1);

        }

    }
     static int binarysearch(int[] arr,int target,int start,int end){
        while(start<=end){
            //find the middle element
            //int mid=(start+end)/2 it can exceed range of int in java
            //integer has a range
            int mid=start+(end-start)/2 ;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }

        }
        return -1;
        
    }
    //this will not work for duplicate values
    // static int FindPivot(int[] arr){
    //     int start=0;
    //     int end=arr.length-1;
    //     while(start<=end){
    //         int mid=start+(end-start)/2;
    //         //4 cases over here
    //         if(mid<end && arr[mid]>arr[mid+1]){
    //             return mid;
    //         }
    //         if(mid>start && arr[mid]<arr[mid-1]){
    //             return mid-1;
    //         }
    //         if(arr[start]>=arr[mid]){
    //             end=mid-1;
    //         }
    //         else{   //start<mid element case
    //             start=mid+1;
    //         }
            
    //     }
    //     return -1;
 
     static int FindPivot(int[] arr){//with duplicate elements
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //4 cases over here
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
           //if elements at mid,start,end are equal skip the duplicates
           if(arr[mid]==arr[start] && arr[mid]==arr[end]){
            //just skip duplicates
            //but what if elements at start and end are pivots?
            //check if start is pivot
            if(arr[start]>arr[start+1]){
                return start;
            }
            start++;
            //check if end is pivot
            if(arr[end]<arr[end-1]){
                return end-1;
            }
            end--;
           }
           //left side is sorted so pivot should be at right
           else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end]) ){
            start=mid+1;
           }
           else{
            end=mid-1;
           }
            
        }
        return -1;
    }
}
