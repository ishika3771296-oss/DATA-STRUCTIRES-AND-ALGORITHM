// public class Recursion {
//     public static void main(String[] args) {
//         print(1);
//     }
//     static void print(int n){
//         if(n==5){ //base condn to stop recursion 
//             System.out.println(5);
//             return;
//         }
//         System.out.println(n);
//         //recursive call
//         print(n+1);//this is called tail recursion
//         //this is the last function call
//     }
// }  


//binary search using recursion
public class Recursion {
    public static void main(String[] args) {
        int[] arr={1,2,34,55,66,78};
        int target=78;
        System.out.println(search(arr, target,0,arr.length-1));
    }
    static int search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2; 
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m+1, e);

    }
    
}  
