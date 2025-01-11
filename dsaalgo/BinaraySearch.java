package dsaalgo;

public class BinaraySearch {
    public static void main(String[] args) {

        System.out.println(binaraySearch(new int[]{1, 5, 8, 2, 7, 69, 4}, 7));
    }

    private static int binaraySearch(int[] arr, int x) {


        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (x < arr[mid]) {
                return r = mid - 1;

            } else {
                return l = mid + 1;
            }

        }
        return -1;
    }
}