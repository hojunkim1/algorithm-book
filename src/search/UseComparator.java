package search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class UseComparator {
    public static void useComparator() {
        Scanner stdIn = new Scanner(System.in);

        // data
        PhyscData[] x = {new PhyscData("강민하", 162, 0.3)};

        // input
        System.out.print("키가 몇 cm인 사람을 찾고 있나요?: ");
        int height = stdIn.nextInt();

        // binary search
        int index = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);


        // show result
        if (index < 0) System.out.println("그 값의 요소가 없습니다");
        else {
            System.out.println("그 값은 x[" + index + "]에 있습니다.");
            System.out.println("찾은 데이터: " + x[index]);
        }
    }

    static class PhyscData {
        private final String name;
        private final int height;
        private final double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() {
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return Integer.compare(d1.height, d2.height);
            }
        }
    }
}
