import java.util.Arrays;

public class Test10 {
    void foo(int[] nums){
       // for (int i = 0; i < nums.length; i++)
           // nums[i]++;
        nums = new int[]{2,3,4,};
        //nums的内容没有改变，只是这个变量现在引用了一个新数组
        //原始的123数组还是存在，只是这个变量不再引用他而已
        //nums后是=不管后面接什么原始都不变，nums后是.或[]这种内容时原始就改变了
        System.out.println("in foo:" + Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Test10 t = new Test10();
        int[] nums = {1,2,3,};
        t.foo(nums);
        //当给方法传递的参数是引用类型时，如果方法中修改了该引用类型所引用的对象内容时
        //在方法结束后引用类型引用的内容会发生改变
        System.out.println("in main:" +Arrays.toString(nums));
    }
}
