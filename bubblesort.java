public class Classroom{
    public static void BubbleSort(int arr[]){
        //this loop is for the outer turns
        for(int turn=0;turn<arr.length;turn++){
            //for swapping
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void Printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {5, 1 ,4 ,3 ,2};
        BubbleSort(arr);
        Printarr(arr);
    }
}
