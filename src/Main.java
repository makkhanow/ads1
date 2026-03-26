public class Main{
//1.
public static int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}
//2.
public static boolean contains(int[] arr, int target) {
    for (int num : arr) {
        if (num == target) {
            return true;
        }
    }
    return false;
}
//3.
public static void printPairs(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[i] + ", " + arr[j]);
        }
    }
}
//4.
public static void uniquePairs(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            System.out.println(arr[i] + ", " + arr[j]);
        }
    }
}
//5.
public static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
//6.
public static int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;

    while (left <= right) {
        int mid = (left + right) / 2;

        if (arr[mid] == target) return mid;
        if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }

    return -1;
}
//7.
public static void doublingLoop(int n) {
    for (int i = 1; i < n; i *= 2) {
        System.out.println(i);
    }
}
//8.
public static void tripleLoop(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                System.out.println(arr[i] + arr[j] + arr[k]);
            }
        }
    }
}
//9.
public static ArrayList<Integer> buildList(int n) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        list.add(i);
    }
    return list;
}
//10
public static void insertAtBeginning(ArrayList<Integer> list, int n) {
    for (int i = 0; i < n; i++) {
        list.add(0, i);
    }
}
}
