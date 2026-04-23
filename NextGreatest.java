//(LEETCODE PROBLEM-744)
public class NextGreatest{
    public static void main(String[] args){
        char[] letters={'c','f','g'};
         char target='m';
        char ans=nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;

        while(start<=end){
            //find the middle element
            //int mid=(start+end)/2 it can exceed range of int in java
            //integer has a range
            int mid=start+(end-start)/2 ;
           
            if(target<letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
         return letters[start% letters.length] ;
    }
}   