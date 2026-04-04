public class SearchInString {
    public static void main(String[] args) {
        String str = "Katyayini";
        char target = Character.toLowerCase('K');

        str = str.toLowerCase();

        int result = search(str, target);
        if(result != -1){
            System.out.println("The target is found at index " + result);
        }
        else {
            System.out.println("The target is not found.");
        }
    }
    static int search(String str, char target) {
        for(int i = 0 ;i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }
}
