package codilo.lesson2;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OddOccurrencesInArrayTest {
    @Test(dataProvider = "testData")
    public void test(int[] array, int expcted){
        OddOccurrencesInArray oddOccurrencesInArray = new
                OddOccurrencesInArray();
        Assert.assertEquals(oddOccurrencesInArray.solution(array),expcted);
    }

    @DataProvider
    public Object[][] testData() {
       int[] a ={ 1,1,1,1,1};
       int[] b ={1,1,2,2,1};
       int[] c ={1,2,1,2,9};
       int[] e ={1,1,1,1,11};
       int[] d ={11,1,1,1,1};
       int[] f ={1,1,11,1,1};
        return new Object[][] {
                {a, 1},
                {b, 1},
                {c, 9},
                {e, 11},
                {d, 11},
                {f, 11},
        };
    }

}
