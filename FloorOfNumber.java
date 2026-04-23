public class FloorOfNumber{
    public static void main(String[] args){
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        int ans=floorOfNumber(arr,target);
        System.out.println(ans);
    }

    //return the index
    static int floorOfNumber(int[] arr,int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            //find the middle element
            //int mid=(start+end)/2 it can exceed range of int in java
            //integer has a range
            int mid=start+(end-start)/2 ;
            if(target==arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;
                }
            else{
                start=mid+1;
            }

        }
        return end;
        
    }
         
            
}