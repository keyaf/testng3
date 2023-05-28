
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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
    @Test(priority = 1)
    public void test() {
        System.out.println("Keya");
    }


    @Test
    public void test7(){
        System.out.println("test7");
    }

    @Test(dataProvider = "provider")
    public void test3(int ssn, String name){
        System.out.println("SSN is "+ssn);
        System.out.println("Name is "+name);
    }
    @DataProvider(name = "provider")
    public Object[][] dataprovider(){
        Object[][] data = new Object[2][2];
        data[0][0] = 123;
        data[0][1] ="Keya";
        data[1][0] = 236;
        data[1][1] = "Asa";
        return data;

    }

}
