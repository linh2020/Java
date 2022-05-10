//
//Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
//
//
//
//        Example 1:
//
//        Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//        Output: [[1,6],[8,10],[15,18]]
//        Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
//        Example 2:
//
//        Input: intervals = [[1,4],[4,5]]
//        Output: [[1,5]]
//        Explanation: Intervals [1,4] and [4,5] are considered overlapping.
//
//
//        Constraints:
//
//        1 <= intervals.length <= 104
//        intervals[i].length == 2
//        0 <= starti <= endi <= 104
//        Accepted
//        1,417,074
//        Submissions
//        3,154,435


import java.util.*;
import java.util.LinkedList;

import static javax.swing.UIManager.get;

public class MergeIntervals_56 {

    // Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
    // Output: [[1,6],[8,10],[15,18]]

    public int[][] merge(int[][] intervals) {
        return new int[][]{};
    }

    public static void main(String[] args) {

//        int[][] intervals = {
//                {1, 3},
//                {2, 6},
//                {8, 10},
//                {15, 18},
//        };

        // {6, 23}, {22, 8},{3, 4},{9, 16}

        // [[3, 4], [3, 16], [6, 23], [9, 17], [22, 8], [23, 16]]
        int[][] intervals = {
                {1, 2},
                {3, 8},
                {6, 11},
                {12, 17},
                {23, 16},
                {22, 8},
        };

        //[[1,3],[2,6],[8,10],[15,18]]
//        int[][] intervals = {
//                {1, 3},
//                {2, 6},
//                {8, 10},
//                {15, 18}
//        };

//        int[][] intervals = {
//                {1, 4},
//                {4, 5},
//        };

        System.out.println("/1");
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        System.out.println(Arrays.deepToString(intervals));

        System.out.println("/2");
//        for(int[] e: intervals){
//            for(int e1: e){
//                System.out.print(e1+ " ");
//            }
//            System.out.println();
//        }


        LinkedList<int[]> ll = new LinkedList<>();
        System.out.println("/4");
//        ll.add(new int[]{1});
//        System.out.println(ll.getLast()[0]);
        for (int[] e : intervals) {
            if (ll.isEmpty() || ll.getLast()[1] < e[0]) {
                if (!ll.isEmpty())
                    System.out.print("first: " + ll.getLast()[1] + " -- " + e[0]);
                System.out.println();
                ll.add(e);
                if (!ll.isEmpty()) {
                    System.out.print("-->" + ll.getLast()[1] + " -- " + e[0]);
                    System.out.println();
                    System.out.print("element " + e[0] + e[1]);
                    System.out.println();
                }

            } else {
//                ll.set(ll.size() - 1, new int[]{ll.get(ll.size()-1)[0],e[1]});
//                ll.set(ll.size()-1, new int[]{});
                System.out.println("last: " + ll.getLast()[0] + ll.getLast()[1] + " -- " + e[0] + e[1]);

                ll.set(ll.size() - 1, new int[]{ll.getLast()[0], e[1]});

                ll.getLast()[1] = Math.max(ll.getLast()[1], e[1]);

//                ll.getLast()[1] = 99999;
//                System.out.println("-------------" + ll.getLast()[1]);

                System.out.println("final: " + ll.getLast()[0] + ll.getLast()[1]);
            }
        }

        System.out.println("---FINAL---");
        for (int[] e : ll) {
            for (int e1 : e) {
                System.out.print(e1 + " ");
            }
            System.out.println();
        }

        ll.set(ll.size() - 1, new int[]{ll.getLast()[0], 999});

        System.out.println("setting a new value");
        for (int[] e : ll) {
            for (int e1 : e) {
                System.out.print(e1 + " ");
            }
            System.out.println();
        }


        System.out.println("/3");
        for (int[] e : intervals) {
            for (int e1 : e) {
                System.out.print(e1 + " ");
            }
            System.out.println();
        }


//        System.out.println("/5");
//        LinkedList<Integer> l3 = new LinkedList<>();
//        l3.add(1);
//        System.out.println(l3);
//        l3.set(l3.size() - 1, 19);
//        System.out.println(l3.getLast());


//        for (int i = 0; i < intervals.length;) {
////            for (int j = 0; j < intervals[i].length; ) {
//            if (intervals[i][1] > intervals[i + 1][0]) {
//                System.out.print("overlap ");
//                System.out.println(intervals[i][0] + " " + intervals[i + 1][1]);
//                if (intervals.length - i < 2)
//                    i+=2;
//                else
//                    i++;
//            } else {
//                System.out.print("not overlap: ");
//                System.out.println(intervals[i][0] + " " + intervals[i][1]);
//                i++;
//            }
////            }
//        }

//        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
//        System.out.println(Arrays.deepToString(intervals));

//        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
//        System.out.println(Arrays.deepToString(intervals));


        System.out.println("---");
        Arrays.sort(intervals, Comparator.comparingInt(e -> e[0]));
        System.out.println(Arrays.deepToString(intervals));


        LinkedList<int[]> ll2 = new LinkedList<>();
        ll.add(new int[]{8});
        ll.add(new int[]{5});
        ll.add(new int[]{9});
        ll.add(new int[]{3});


        int[][] arr1 = ll.toArray(new int[ll.size()][]);


//        System.out.println("------");
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }


        System.out.println();


        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i)[0] + ", ");
        }

//        System.out.println(ll.get(0[0]));

//        LinkedList<Integer> l2 = new LinkedList<>();
//        l2.add(1);
//        l2.add(2);
//        System.out.println(l2);


        int[] arr2 = {213, 16, 6, 2, 7, 322, 31, 3545, 22};
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr2));


//        Arrays.sort(arr, Comparator.comparingInt(o -> o[1]));
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
////        LinkedList<int[]> merged = new LinkedList<>();
//
//        LinkedList<int[]> ll = new LinkedList<>();
//
//        for (int i = 0; i < arr.length; i++) {
////            for (int j = 0; j < arr[i].length; j++) {
////            System.out.print(arr[i][1] + "\t");
//
////            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length-1; j++) {
//                if (arr[j][1] > arr[j + 1][0]) {
//                    ll.add(new int[]{arr[j][0], arr[j + 1][1]});
//                }
//            }
//        }
//
//        System.out.println(ll.get(0).toString());
//
//
////        int[][] arr = {
////                {1, 3},
////                {2, 6},
////                {8, 10},
////                {15, 18},
////        };
//

    }

}
