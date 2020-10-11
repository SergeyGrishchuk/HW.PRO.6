import com.HomeWork.MyHW;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestArray1And4 {
    private int[] arr;
    private boolean mark;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 3, 4, 5, 2, 5, 2}, false},
                {new int[]{1, 4, 1, 4, 1, 1, 1, 4, 4, 4, 4}, true},
                {new int[]{1, 4, 1, 4, 1, 4, 1, 4, 0}, false},
                {new int[]{1, 1}, false},
                {new int[]{4, 4}, false}
        });
    }

    public TestArray1And4(int[] arr, boolean mark) {
        this.arr = arr;
        this.mark = mark;
    }

    @Test
    public void testArray1And4(){
        Assert.assertEquals(mark, MyHW.array1and4(arr));
    }
}
