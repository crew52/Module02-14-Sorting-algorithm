package bt1;

import java.util.Scanner;

public class InsertionSortSteps {
    public static void insertionSortWithSteps(int[] arr) {
        int n = arr.length;
        System.out.println("Mảng ban đầu: ");
        printArray(arr);

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử lớn hơn key về phía sau
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            // Hiển thị mảng sau mỗi bước
            System.out.println("Bước " + i + ": ");
            printArray(arr);
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\n--- Bắt đầu thuật toán sắp xếp chèn ---\n");
        insertionSortWithSteps(arr);

        System.out.println("\n--- Mảng đã được sắp xếp ---");
        printArray(arr);

        scanner.close();
    }
}
