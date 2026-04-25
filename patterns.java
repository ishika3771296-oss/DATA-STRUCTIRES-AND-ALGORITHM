//PATTERN 1(solid rectangle)
// public class patterns{
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=5;j++){
//                 System.out.print("*");
//             }
//              System.out.println("");
//         }
//     }
// }

//PATTERN-2(HOLLOW RECTANGLE)
// public class patterns{
//     public static void main(String[] args) {
//         int n=4;
//         int m=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 if(i==1 || i==n || j==1 || j==m){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//              System.out.println(" ");
//         }
//     }
// }

//PATTERN-3(HALF PYRAMID)
// public class patterns{
//     public static void main(String[] args) {
//         int n=4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                  System.out.print("*");
//             }
//              System.out.println("");
//         }
//     }
// }

//PATTERN-4(INVERT 3RD)
// public class patterns{
//     public static void main(String[] args) {
//         int n=4;
//         for(int i=4;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                  System.out.print("*");
//             }
//              System.out.println("");
//         }
//     }
// }

//PATTERN-5
// public class patterns{
//     public static void main(String[] args) {
//         int n=4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                  System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//              System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }

//PATTERN-6(HALF-PYRAMID WITH NUMBERS)
// public class patterns{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 //  System.out.print(j);
//                 System.out.print(j+" ");
//             }
//              System.out.println("");
//         }
//     }
// }

//PATTERN-7(INVERTED HALF-PYRAMID WITH NUMBERS)
// public class patterns{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                  System.out.print(j+" ");
//             }
//              System.out.println("");
//         }
//     }
// }

//PATTERN-8(FLOYD'S TRIANGLE)
// public class patterns{
//     public static void main(String[] args) {
//         int n=5;
//         int number=1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(number+" ");
//                 number++;
//             }
//             System.out.println(" ");
//         }
//     }
// }

//PATTERN-9(0-1 TRIANGLE)
// public class patterns{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 int sum=i+j;
//                 if(sum%2==0){
//                     System.out.print("1 ");
//                 }else{
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }


//HOMEWORK PROBLEMS
//PROBLEM-1(SOLID RHOMBUS)
// public class patterns{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=n;j++){
//                 System.out.print("*");

//             }
//             System.out.println("");
//         }
//     }
// }

//PROBLEM-2(CENTERED PYRAMID)
// public class patterns{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }
