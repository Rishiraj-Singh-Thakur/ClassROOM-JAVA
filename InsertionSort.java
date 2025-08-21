public class InsertionSort{
    public static void functionOfInsertionSort(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+"  ");
    }
    }
    public static void main(String[] args) {
        int arr[] = {22,12,43,23,55,25,6};
        for(int i = 1; i<arr.length;i++){
            int curr = arr[i];

            int j = i-1;
            while (j>=0 && arr[j]>curr) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        functionOfInsertionSort(arr);
}
}

