import java.util.*;
class MinAndMax {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Size of the Array: ");
       int size = sc.nextInt();
       int[] arr = new int[size];
       for(int i=0;i<size;i++){
           arr[i] = sc.nextInt();
       }
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       for(int i=0;i<size;i++){
           if(arr[i] > max){
               max = arr[i];
           }
       }
       for(int i=0;i<size;i++){
           if(arr[i] < min){
               min = arr[i];
           }
       }
       System.out.println("Maximum: "+max);
       System.out.println("Minimum: "+min);
    }
}
