package codilo.lesson2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

//https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
public class CyclicRotationTest {
    @Test(dataProvider = "testData")
    public void test(int[] array, int[] arrayExpected, int r) {
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] arrayActual = cyclicRotation.solution(array, r);
        Assert.assertEquals(arrayActual, arrayExpected, Arrays.toString(arrayActual));
    }

    @DataProvider
    public Object[][] testData() {
        int[] a = {1, 2, 3, 4, 5};
        int[] aR = {5, 1, 2, 3, 4};
        int ar = 1;

        int[] b = {1, 2, 3, 4, 5};
        int[] bR = {4, 5, 1, 2, 3};
        int br = 2;

        int[] c = {1, 2, 3, 4, 5};
        int[] cR = {3, 4, 5, 1, 2};
        int cr = 3;

        return new Object[][]{
                {a, aR, ar},
                {b, bR, br},
                {c, cR, cr},
        };
    }

}
