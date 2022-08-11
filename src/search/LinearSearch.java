package search;

import java.util.Scanner;

public class LinearSearch {
    public static void call() {
        Scanner stdIn = new Scanner(System.in);

        // get length of array
        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1]; // use num + 1 when searchSentinel()

        // get element of array
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        // get number to search
        System.out.print("검색할 값: ");
        int key = stdIn.nextInt();

        // search and show result
        int idx = searchSentinel(x, num, key);
        if (idx == -1) System.out.println("그 값의 요소가 없습니다");
        else System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }

    private static int searchWhile(int[] a, int n, int key) {
        // linear search : check all element from first to exact one.
        int i = 0;
        while (true) {
            if (i == n) return -1;
            if (a[i] == key) return i;
            i++;
        }
    }

    private static int searchFor(int[] a, int n, int key) {
        // linear search : check all element from first to exact one.
        for (int i = 0; i < n; i++)
            if (a[i] == key) {
                return i;
            }
        return -1;
    }

    private static int searchSentinel(int[] a, int n, int key) {
        // linear search : check all element from first to exact one.
        a[n] = key;
        int i = 0;
        while (!(a[i] == key)) i++;
        return i == n ? -1 : i;
    }
}
