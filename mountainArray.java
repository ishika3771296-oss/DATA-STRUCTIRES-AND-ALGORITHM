public class mountainArray{
    public static void main(String[] args) {
        int[] arr={1,2,3,5,7,6,4};
        int ans=peakIndexInMountainArray(arr);
        System.out.println(ans);
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

}