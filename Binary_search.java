
public class Binary_search{
    public static void main(String[] args){
        int[] arr={2,4,6,9,11,12,14,20,36,48};
        int target=36;
        int ans=binarysearch(arr,target);
        System.out.println(ans);
    }

    //return the index
    static int binarysearch(int[] arr,int target){
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
        return -1;
        
    }
         
            
}


//ORDER AGNOSTIC BINARY SEARCH
// public class Binary_search{
//     public static void main(String[] args){
//         int[] arr={48,46,38,36,22,17,11,9,3,1};
//         int target=36;
//         int ans=orderAgnosticBS(arr,target);
//         System.out.println(ans);
        
//     }
//     static int orderAgnosticBS(int[] arr, int target){
//         int start=0;
//         int end=arr.length-1;
//         //find whether the array is sorted in ascending or descending
//         boolean isAsc=arr[start]<arr[end];
        

//         while(start<=end){
// //             //find the middle element
// //             //int mid=(start+end)/2 it can exceed range of int in java
// //             //integer has a range
//             int mid=start+(end-start)/2 ;
//             if (arr[mid]==target){
//                 return mid;
//             }
//             if(isAsc) {
//                 if(target<arr[mid]){
//                     end=mid-1;
//                 }else if(target>arr[mid]){
//                     start=mid+1;
//                 }
//             }else {
//                  if(target<arr[mid]){
//                 start=mid+1;
//             }
//             else if(target>arr[mid]){
//                 end=mid-1;
//             }
                
//             }
//         }        

    
//         return -1;
//     }
// }

