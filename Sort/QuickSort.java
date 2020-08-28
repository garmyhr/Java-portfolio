import java.util.Arrays;

public class QuickSort {


    public static void main(String[] args) {
      int[] arr = {32, 2, 45, 23, 96, 25, 1, 56, 74, 84};

      QuickSort s = new QuickSort();
      s.sort(arr);
      System.out.print(Arrays.toString(arr));
    }

    public void sort(int[] arr) {

      if(arr == null || arr.length == 0) {
        System.out.println("Invalid input");
      }

      partition(arr, 0, arr.length-1);
    }

    private void partition(int[] arr, int left, int right){

      int i = left;
      int j = right;

      int pivot = arr[left + (right-left)/2];

      while(i <= j) {

        while(arr[i] < pivot) {
          i++;
        }
        while(arr[j] > pivot) {
          j--;
        }

        if(i <= j) {
          swap(arr, i, j);
          i++;
          j--;
        }
      }

      if(i < right) partition(arr, i, right);
      if(j > left) partition(arr, left, j);
    }

    private void swap(int[] arr, int i, int j) {
      int tmp = arr[i];
      arr[i] = arr[j];
      arr[j] = tmp;
    }
}
