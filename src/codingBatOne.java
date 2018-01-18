//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package codingBatProjects;

import java.util.Arrays;

public class codingBatOne {
    public codingBatOne() {
    }

    public static void main(String[] args) {
        System.out.println(icyHot(-2, 120));
        System.out.println(last2("xxaxannaxanaxnnnaxnn"));
        System.out.println(without2("erwinter"));
        System.out.println(makeEnds(new int[]{4, 3, 6, 2, 3}));
        System.out.println(sortaSum(3, 9));
        System.out.println(loneSum(12, 2, 12));
        System.out.println(repeatEnd("weekend", 3));
        System.out.println(countTriple("annxxxxaannnnna"));
        System.out.println(bigDiff(new int[]{7, 6, 19, 3, 4}));
        System.out.println(linearIn(new int[]{3, 4, 6, 2}, new int[]{6, 2}));
    }

    private static boolean icyHot(int temp1, int temp2) {
        return temp1 > 100 && temp2 < 0 || temp1 < 0 && temp2 > 100;
    }

    private static int last2(String str) {
        int count = 0;

        for(int i = 0; i < str.length() - 3; ++i) {
            if (str.substring(str.length() - 2).equals(str.substring(i, i + 2))) {
                ++count;
            }
        }

        return count;
    }

    private static String without2(String str) {
        return str.substring(0, 2).equals(str.substring(str.length() - 2)) ? str.substring(2) : str;
    }

    private static String makeEnds(int[] nums) {
        int[] firstLast = new int[]{nums[0], nums[nums.length - 1]};
        return Arrays.toString(firstLast);
    }

    private static int sortaSum(int a, int b) {
        return a + b > 9 && a + b < 20 ? 20 : a + b;
    }

    private static int loneSum(int a, int b, int c) {
        int sum = a + b + c;
        if (a == b ^ a == c) {
            sum -= a;
        }

        if (b == c) {
            sum -= b;
        }

        return a == b && b == c ? a : sum;
    }

    private static String repeatEnd(String str, int num) {
        String end = str.substring(str.length() - num);

        for(int i = 0; i < num - 1; ++i) {
            end = end + str.substring(str.length() - num);
        }

        return end;
    }

    private static int countTriple(String str) {
        int count = 0;

        for(int i = 0; i < str.length() - 2; ++i) {
            if (str.substring(i, i + 1).equals(str.substring(i + 1, i + 2)) && str.substring(i, i + 1).equals(str.substring(i + 2, i + 3))) {
                ++count;
            }
        }

        return count;
    }

    private static int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for(int i = 0; i < nums.length - 1; ++i) {
            if (nums[i + 1] > max) {
                max = nums[i + 1];
            }

            if (nums[i + 1] < min) {
                min = nums[i + 1];
            }
        }

        return max - min;
    }

    private static boolean linearIn(int[] outer, int[] inner) {
        for(int i = 0; i < outer.length - inner.length + 1; ++i) {
            if (Arrays.toString(Arrays.copyOfRange(outer, i, i + inner.length)).equals(Arrays.toString(inner))) {
                return true;
            }
        }

        return false;
    }
}
