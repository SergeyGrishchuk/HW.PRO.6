import com.HomeWork.MyHW;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestArrayAfter4 {
    private int[] a;
    private int[] b;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6, 7,4, 7, 8, 9}, new int[]{7, 8, 9}},
                {new int[]{3, 7, 8, 4}, new int[]{}},
                {new int[]{3, 7, 8, 4, 6, 7, 4}, new int[]{}},
                {new int[]{3, 5, 2, 4, 9}, new int[]{9}}
        });
    }

    public TestArrayAfter4(int[] a, int[] b) {
        this.a = a;
        this.b = b;
    }

    @Test
    public void test1ArraySelectAfter4() {
        Assert.assertArrayEquals(b, MyHW.arraySelectAfter4(a));
    }

    @Test(expected = RuntimeException.class)
    public void test2ArraySelectAfter4(){
        int[] a = new int[]{1, 3, 5, 7, 9, 0};
        MyHW.arraySelectAfter4(a);
    }
}
