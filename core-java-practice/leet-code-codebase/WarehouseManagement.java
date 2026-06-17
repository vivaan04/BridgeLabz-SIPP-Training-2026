A warehouse stores item quantities in an array. Find the max, min,
total stock, and detect duplicates. Extend: rotate the stock array by
k positions (simulate daily shift handover), and transpose a 2D shelf
grid.

import java.util.*;
public class WarehouseManagement {
    public static void main(String[] args) {
        int[] stock = {50, 20, 40, 20, 60, 50};
        int max = stock[0];
        int min = stock[0];
        int total = 0;
        for (int item : stock) {
            if (item > max) max = item;
            if (item < min) min = item;
            total += item;
        }
        System.out.println("Maximum Stock: " + max);
        System.out.println("Minimum Stock: " + min);
        System.out.println("Total Stock: " + total);
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int item : stock) {
            if (!seen.add(item)) {
                duplicates.add(item);
            }
        }
        System.out.println("Duplicates: " + duplicates);
        int k = 2;
        int n = stock.length;
        k = k % n;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = stock[i];
        }
        System.out.println("Rotated Array:");
        System.out.println(Arrays.toString(rotated));
        // 2D Shelf Grid
        int[][] shelf = {
            {10, 20, 30},
            {40, 50, 60}
        };
        // Transpose Matrix
        int rows = shelf.length;
        int cols = shelf[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = shelf[i][j];
            }
        }
        System.out.println("Transposed Shelf Grid:");
        for (int[] row : transpose) {
            System.out.println(Arrays.toString(row));
        }
    }
}