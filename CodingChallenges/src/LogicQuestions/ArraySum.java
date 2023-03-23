package LogicQuestions;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 7};
        int sum = findArraySum(arr);
        System.out.println("The sum of array elements is: " + sum);
    }

    public static int findArraySum(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
