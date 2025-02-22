public class MergeSort {
    public static void main(String[] args) {
        int nums[] = { 6, 5, 9, 8, 4 };
        int size = nums.length;

        System.out.println("Before Sorting");
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + "\t");

        mergeSort(nums, 0, size - 1);

        System.out.println("\n");
        System.out.println("After  Sorting");
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + "\t");
    }

    private static void mergeSort(int[] nums, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(nums, low, mid);
            mergeSort(nums, mid + 1, high);
            merge(nums, low, mid, high);
        }
    }

    private static void merge(int[] nums, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int x = 0; x < n1; x++)
            leftArray[x] = nums[low + x];

        for (int x = 0; x < n2; x++)
            rightArray[x] = nums[mid + 1 + x];

        int i = 0;
        int j = 0;
        int k = low;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j])
                nums[k] = leftArray[i++];
            else
                nums[k] = rightArray[j++];
            k++;    
        }

        while (i < n1)
            nums[k++] = leftArray[i++];
        while (j < n2)
            nums[k++] = rightArray[j++];
    }

}
