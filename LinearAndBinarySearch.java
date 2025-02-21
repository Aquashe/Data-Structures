import java.util.Scanner;

public class LinearAndBinarySearch {

    public static void main(String[] args) {
        int arr[] = { 5, 7, 9, 11, 13 };
        System.out.print("Enter the integer: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int result1 = linearSearch(arr, target);
        int result2 = binarySearch(arr, target, 0, arr.length - 1);

        if (result1 != -1 || result2 != -1) {
            System.out.println("Element found through Linear search : " + result1);
            System.out.println("Element found through Binary search : " + result2);
        } else
            System.out.println("Element not found");
        sc.close();
    }

    public static int binarySearch(int[] arr, int target, int left, int right) {

        if (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target)
                return mid;
            else if (target > arr[mid])
                return binarySearch(arr, target, mid + 1, right);
            else
                return binarySearch(arr, target, left, mid - 1);
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

}