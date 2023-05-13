package LinearSearch;

/*
Given an array nums of integers, return how many of them contains an even number of digits
 */
public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arrayOfIntegers = new int[]{1000, 332, 4564, 323, 1212, 12345, 9};
        System.out.println(findNumbers(arrayOfIntegers));
    }

    private static int findNumbers(int[] arrayOfIntegers) {
        if (arrayOfIntegers.length == 0) {
            return 0;
        }
        int counter = 0;
        for (int num : arrayOfIntegers) {
            if (findNumberOfDigitInInteger(num) % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int findNumberOfDigitInInteger(int num) {
        if (num == 0)
            return 1;
        if (num < 0) {
            num = num * -1;
        }
        int counter = 0;
        while (num > 0) {
            num = num / 10;
            counter++;
        }
        return counter;
    }

    //more efficient way to finding number of digits
    private static int digits2(int num) {
        if (num == 0)
            return 1;
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num)) + 1;
    }
}
