//package dsaalgo;
//
//public class SearchInRotatedArray {
//    public static void main(String[] args) {
//        System.out.println(search(new int []  {4,5,6,7,8,9,10,1,2,3}, 0, 8, 10));
//    }
//
//    private static int search(int arr[], int l,int r, int key){
//        int pivot = getPivot(arr, l, r);
//        int e = bs(arr, l, pivot, key);
//        if(e == -1){
//            e = bs(arr, r , pivot + 1, key);
//        }
//        return e;
//    }
//
//
//
//    private static int getPivot(int []arr, int l, int r){
//        while (l <= r) {
//            int mid = (l + r) / 2;
//            if (arr[mid] > arr[mid + 1]) {
//                return mid;
//            } else if (arr[mid] < arr[mid - 1]) {
//                return mid - 1;
//            } else if (arr[mid] > arr[l]) {
//                return l = mid + 1;
//            } else {
//                return r = mid - 1;
//            }
//        }
//        return -1;
//    }
//}
