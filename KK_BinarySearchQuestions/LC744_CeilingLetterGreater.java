public class LC744_CeilingLetterGreater {
    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c'};
        char target = 'b';

        char result = findGreater(letters, target);
        System.out.println(result);
    }

    static char findGreater(char[] letters, char target) {
        int size = letters.length;
        int start = 0;
        int end = size - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target >= letters[mid]) {
                start = mid + 1;
            } else if (target < letters[mid]) {
                end = mid - 1;
            }
        }
        return letters[start % size];   //here we can just return letters[start], but for this at the starting we will
    }                                   //check if (target >= letters[size - 1]) the return first element of the array.
}


