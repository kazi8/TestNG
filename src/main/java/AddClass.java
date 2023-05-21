import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddClass {
    public void beforeMethod(){
        System.out.println("Inside before method");
    }
    public int getSum(int a, int b){
        return a+b;
    }
    @Test
    public void secondTest(){
        System.out.println("This is our second test");
    }
}
