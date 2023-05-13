package LinearSearch;

/* Search for 3 in the range of index [1,4] in an array*/
public class SearchInRange {
    public static void main(String[] args) {
        int[] numberArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int startIndex = -1;
        int endIndex = 41;
        int target = 6;
        System.out.println(searchInRange(numberArray, startIndex, endIndex, target));
    }

    private static boolean searchInRange(int[] numberArray, int startIndex, int endIndex, int target) {
        if (numberArray.length == 0) {
            return false;
        }
        startIndex = Math.max(startIndex, 0);
        endIndex = Math.min(endIndex, numberArray.length - 1);
        for (int i = startIndex; i <= endIndex; i++) {
            if (numberArray[i] == target) {
                return true;
            }
        }
        return false;
    }
}
