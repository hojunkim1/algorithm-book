package search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void binarySearch() {
        Scanner stdIn = new Scanner(System.in);

        // get length of array
        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        // get element of array
        System.out.println("오름차순으로 입력하세요.");
        System.out.print("x[0]: ");
        x[0] = stdIn.nextInt();
        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]);
        }

        // get number to search
        System.out.print("검색할 값: ");
        int key = stdIn.nextInt();

        // search and show result
        int index = Arrays.binarySearch(x, key);
        if (index == -1) System.out.println("그 값의 요소가 없습니다");
        else System.out.println("그 값은 x[" + index + "]에 있습니다.");
    }

    private static int searchInt(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key) return pc;
            else if (a[pc] < key) pl = pc + 1;
            else pr = pc - 1;
        } while (pl <= pr);

        return -1;
    }

    public static void binarySearchString() {
        Scanner stdIn = new Scanner(System.in);

        // sorted strings
        String[] x = {"abstract", "assert", "boolean", "break", "byte"};

        // get number to search
        System.out.print("검색할 키워드: ");
        String key = stdIn.next();

        // search and show result
        int index = Arrays.binarySearch(x, key);
        if (index < 0) System.out.println("그 값의 요소가 없습니다");
        else System.out.println("그 값은 x[" + index + "]에 있습니다.");
    }
}
