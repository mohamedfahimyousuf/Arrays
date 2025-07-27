import java.util.*;
class thirdLargest {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Size of the Array: ");
       int size = sc.nextInt();
       int[] arr = new int[size];
       for(int i=0;i<size;i++){
           arr[i] = sc.nextInt();
       }
       int largest = arr[0];
       int sLargest = Integer.MIN_VALUE;
       int tLargest = Integer.MIN_VALUE;
       for(int i=0;i<size;i++){
           if(arr[i] > largest){
               largest = arr[i];
           }
       }
       for(int i=0;i<size;i++){
           if(arr[i] > sLargest && arr[i] != largest){
               sLargest = arr[i];
           }
       }
       for(int i=0;i<size;i++){
           if(arr[i] > tLargest && arr[i]!=sLargest && arr[i]!= largest){
               tLargest = arr[i];
       }
       }
       System.out.println("Third Largest: "+tLargest);
    }
}
