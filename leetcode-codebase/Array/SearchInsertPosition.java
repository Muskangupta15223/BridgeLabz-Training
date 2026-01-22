public class SearchInsertPosition {

  public static int searchInsert(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= target) {
        return i;
      }
    }
    return arr.length;
  }

  public static void main(String args[]) {
    int[] arr = { 1, 3, 5, 6 };
    int target = 5;
    int ans = searchInsert(arr, target);
    System.out.println(ans);
  }
}
