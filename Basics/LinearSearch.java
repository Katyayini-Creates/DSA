public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23, 45, 5, 67, 8, 9, 0, 10};
        int target = 23;

        int result = search(arr, target);
        if(result != -1) {
            System.out.println("The target element is found at index " + result);
        }
        else {
            System.out.println("The target element is not found.");
        }

    }

    static int search(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;             //index can never be negative. But if we have to return the element
                               // then there could be chances that -1 is among those elements then
                               // we can return 'Integer.MAX_VALUE' or do the question accordingly.
    }
}
