import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
    @Test
    public void firstTest(){
        AddClass addclass = new AddClass();
        int res = addclass.getSum(2,3);
        Assert.assertEquals(5, res);
    }
}
