public class QuickSort {
    public static void main(String[] args) {
        int nums[] = { 6, 5, 9, 8, 4 };
        int size = nums.length;

        System.out.println("Before Sorting");
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + "\t");

        quickSort(nums, 0, size - 1);

        System.out.println("\n");
        System.out.println("After  Sorting");
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + "\t");
    }

    private static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pivot = parition(nums, low, high);
            quickSort(nums, low, pivot - 1);
            quickSort(nums, pivot + 1, high);
        }
    }

    private static int parition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;
        return i + 1;
    }

}
