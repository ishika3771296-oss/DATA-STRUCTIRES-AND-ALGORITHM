//https://leetcode.com/problems/find-in-mountain-array/description/
public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int target=3;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
        int peak=peakIndexInMountainArray(arr);
        int firstTry=orderAgnosticBS(arr, target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        //try to search in second half
         return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
             int mid=start+(end-start)/2 ;
             if(arr[mid]>arr[mid+1]){
                //you are in the dec part of array
                //this may be the ans,but look at left
                //this is why end!=mid-1
                end=mid;
             }
             else{
                //you are in the asc part of array
                start=mid+1;//mid+1>mid 
            }
        }
        //in the end,start==end and pointing to largest number because of 2 checks above
        //start and end are always trying to find max element in the above 2 checks
        //hence,when they are pointing to just one element,that is the max one because that is what check says

        return end;//return start
    }
   
    static int orderAgnosticBS(int[] arr, int target,int start,int end){
    
    //find whether the array is sorted in ascending or descending
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
//             //find the middle element
//             //int mid=(start+end)/2 it can exceed range of int in java
//             //integer has a range
            int mid=start+(end-start)/2 ;
            if (arr[mid]==target){
                return mid;
            }
            if(isAsc) {
                if(target<arr[mid]){
                    end=mid-1;
                }else if(target>arr[mid]){
                    start=mid+1;
                }
            }else {
                 if(target<arr[mid]){
                start=mid+1;
            }
            else if(target>arr[mid]){
                end=mid-1;
            }
                
            }
        }        

    
        return -1;
    }
}

