package LogicQuestions;

import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 7};
        int secondLargest = findSecondLargest(arr);
        System.out.println("The second largest number is: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        Arrays.sort(arr); // sort the array in ascending order
        int n = arr.length;
        return arr[n-2]; // return the second last element
    }
}

