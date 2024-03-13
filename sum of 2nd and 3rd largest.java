import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {10, 51, 53, 39, 47, 44, 21};
        int sum = sumOfSecondAndThirdLargest(values);
        System.out.println("Sum of the 2nd and 3rd largest numbers: " + sum);
    }

    public static int sumOfSecondAndThirdLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least 2 elements");
            return -1;
        }

        Arrays.sort(arr);

        
        int sL = arr[arr.length - 2];
        
        int tL = arr[arr.length - 3];

        return sL+tL;
    }
}
