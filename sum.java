public class SumOfNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Sample array of numbers
        int sum = 0;

        for (int number : numbers) {
            sum += number; // Add each number to sum
        }

        System.out.println("The sum of the numbers is: " + sum);
    }
}