public class SelectionSort {
    public static void functionOfSelectionSort(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+"  ");
    }
    }
    public static void main(String[] args) {
        int arr[] = {22,12,43,23,55,25,6};
        for(int i = 0; i<arr.length-1;i++){
            int curr = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[curr]>arr[j]){
                    curr = j;
                int temp = arr[curr];
                arr[curr] = arr[i];
                arr[i]=temp;
                }
            }
        }
        functionOfSelectionSort(arr);
}
}

