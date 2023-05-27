
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test

public class TestOne {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    @Test
    public void test1(){
        System.out.println("Test 1");

    }
    @Test
    public void test2(){
        System.out.println("Test 2");
    }
    @Test
    public void test3(){
        System.out.println("Test 3");
    }

}
