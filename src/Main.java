public class Main {
    public static void main(String[] args) {
        System.out.println("Swapnil Deoraye");
        int arr[] = {10, 20, 30, 40,100, 50};

        int n=arr.length;
        int start = 0, end = n-1;
        System.out.println("swapnil");
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}