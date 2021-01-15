import java.util.Scanner;

public class ReverseOfArray {
    static void reverseArray( int arr[], int start, int end){
        int var;
        while (start < end){
            var = arr[start];
            arr[start] = arr[end];
            arr[end] = var;
            start++;
            end--;
        }
    }
    static void printArray(int arr[], int size){
        for (int i= 0; i < size; i++){
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        printArray(arr, 6);
        reverseArray(arr, 0 , 5);
        System.out.println("Reverse of the array is  \n");
        printArray(arr , 6);


    }
}
