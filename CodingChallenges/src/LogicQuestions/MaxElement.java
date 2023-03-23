package LogicQuestions;

import java.util.Scanner;

public class MaxElement {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the size of the array: ");
      int size = input.nextInt();
      int[] arr = new int[size];
      System.out.print("Enter the elements of the array: ");
      for(int i = 0; i < size; i++) {
         arr[i] = input.nextInt();
      }
      int max = arr[0];
      for(int i = 1; i < size; i++) {
         if(arr[i] > max) {
            max = arr[i];
         }
      }
      System.out.println("Maximum element in the array: " + max);
   }
}

