package LinearSearch;

public class SearchInString {

    public static void main(String[] args) {
        String name = " This is a string ";
        char target = 'a';
        System.out.println(search(name, target));
    }

    private static boolean search(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
//        for (int i = 0; i < name.length(); i++) {
//            if (target == name.charAt(i)) {
//                return true;
//            }
//        }

        for (char ch: name.toCharArray()){
            if (target == ch) {
                return true;
            }
        }

        return false;
    }


}
