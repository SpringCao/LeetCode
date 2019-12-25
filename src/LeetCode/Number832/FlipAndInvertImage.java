package LeetCode.Number832;

//给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
//
//水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
//
//反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
//

public class FlipAndInvertImage {
    public static void main(String[] args) {
        int[][] a = {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] flipAndInvertImage(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0,k = a[i].length-1; j < k; j++,k--) {
                int temp = a[i][j];
                a[i][j] = a[i][k];
                a[i][k] = temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
               a[i][j] = a[i][j] ^ 1;   //此处的异或运算很巧妙
            }
        }
        return a;
    }
}
