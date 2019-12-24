package LeetCode.Number11;

//LeetCode第11题,求装水容器的最大值
//给一个数组，横坐标代表数组的长度，纵坐标由短的那一条边做决定
public class Max_Container {
    public static void main(String[] args) {
        int[] a={3,4,5,2,7,5};
        System.out.println(maxArea(a));
    }
    private static int maxArea(int[] height){
        int maxArea =0,l = 0,r = height.length - 1;
        while (l < r){
            maxArea = Math.max(maxArea,Math.min(height[l],height[r])*(r - l));
            if (height[l] < height[r]){
                l++;
            }else {
                r--;
            }
        }
        return maxArea;
    }
}
