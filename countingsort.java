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
    public static void SelectionSort(int arr[]){
        //for number of turns
        for(int i=0; i<arr.length-1;i++){
            int minpos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void InsertionSort(int arr[]){
        //outer loop
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    public static void CountingSort(int arr[]){
        int lar = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            lar = Math.max(lar,arr[i]);
        }
        int count[] = new int[lar+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
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
        CountingSort(arr);
        Printarr(arr);
    }
}
