
// REVERSING A ARRAY

// public class ReversingString {
//     public static void RevString(int arr[],int Index){
//         if(Index==arr.length-1){
//             System.out.print("array is Strick Increase");
//             // System.out.print(" ]");
//             return;
//         }if(arr[Index]>arr[Index+1]){
//             System.out.println("Array is not Strick increases");
//             System.out.println(arr);
//         }
//         else{
//         RevString(arr,Index+1);
//         }
//     }
//     public static void main(String[] args) {
//         // System.out.print("[ ");
//         int arr[] = {1,2,3,4,15,6,7,8,9,10};
//         RevString(arr,0);
//     }
// }

// CHECKING IS ARRAY STRICK INCREASES

// class StrickIncreases{
//     public static boolean Check(int arr[],int Index){
//         if(Index==arr.length-1){
//             return true;
//         }
//         // int curr = arr[Index];
//         if(arr[Index]<arr[Index+1]){
//             return Check(arr,Index+1);
//         }else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,5,4,5,6};
//         int Index =0;
//         System.out.println( Check(arr,Index));
//     }
// }


// Permutation COMBINATION OF STRING


// class Permutation {
//     public static void printPermutations(String str, String ans) {
//         if (str.length() == 0) {
//             System.out.println(ans);
//             return;
//         }

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             String ros = str.substring(0, i) + str.substring(i + 1); // rest of string
//             printPermutations(ros, ans + ch);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "ABC";
//         printPermutations(str, "");
//     }
// }
