public class SearchInStrings {

    public static void main(String[] args) {
        System.out.println(search("ziad", 'f'));
        System.out.println(searchForEach("ziad", 'i'));
    }

    static boolean search(String str, char target) {
        if (str.isEmpty())
            return false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target)
                return true;
        }
        return false;
    }

    static boolean searchForEach(String str, char target) {
        if (str.isEmpty())
            return false;
        for (char c : str.toCharArray()) {
            if (c == target)
                return true;
        }
        return false;
    }
}
