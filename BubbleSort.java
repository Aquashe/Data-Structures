public class BubbleSort {

    public static void main(String[] args) {
        int nums[] = { 6, 5, 9, 8, 4 };
        int size = nums.length;
        System.out.println("Before Sorting");
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i]+"\t");

        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(nums[j]>nums[j+1])
                {
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }


        System.out.println("\n");    
        System.out.println("After  Sorting");
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i]+"\t");
    }

    
}
