import java.util.*;
class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("largest: "+largest);
        int sLargest = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>sLargest && arr[i]!=largest){
                sLargest = arr[i];
            }
        }
        System.out.println("Slargest: "+sLargest);
    }
}
