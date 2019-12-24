package LeetCode.Number66;

//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
//
//最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
public class PlusOne {
    public static void main(String[] args) {
        int[] a = {9,9,9,9};
        int[] b = plusOne(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
    }

    //考虑全为9的情况，直接把高位赋值为1，其余默认为0
    private static int[] plusOne(int[] a){
        for (int i = a.length - 1; i >= 0; i--) {
            a[i] = (a[i]+1) % 10;
            if (a[i] != 0) return a;
        }
        int[] b = new int[a.length+1];
        b[0] = 1;
        return b;
    }
}
