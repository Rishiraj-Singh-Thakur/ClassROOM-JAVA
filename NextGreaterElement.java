import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int n = arr.length;

        int nextGreater[] = new int[n];

        Stack<Integer> s = new Stack<>();
        for(int i = n-1;i>=0; i--){

            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }
            else{
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i = 0; i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
    }
}
