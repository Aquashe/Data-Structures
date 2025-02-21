public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = { 6, 5, 9, 8, 4 };
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;
        System.out.println("Before Sorting");
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + "\t");

        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[minIndex] > nums[j])
                    minIndex = j;
            }
            temp = nums[i];
            nums[i] =nums[minIndex];
            nums[minIndex]=temp;
        }

        System.out.println("\n");
        System.out.println("After  Sorting");
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + "\t");
    }

}
