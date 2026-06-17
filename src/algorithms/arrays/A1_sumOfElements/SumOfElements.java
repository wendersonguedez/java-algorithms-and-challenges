package algorithms.arrays.A1_sumOfElements;

public class SumOfElements {
    static int sumOfElements(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int result = sumOfElements(numbers);

        System.out.println("Soma: " + result);
    }
}
