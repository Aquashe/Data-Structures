public class InsertionSort {
    public static void main(String[] args) {
        int nums[] = { 6, 5, 9, 8, 4 };
        int size = nums.length;
        
        System.out.println("Before Sorting");
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + "\t");

        for (int i = 1; i < size; i++) {
            int j=i-1;
            int key = nums[i];
            while(j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }

        System.out.println("\n");
        System.out.println("After  Sorting");
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + "\t");
    }

}
