import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestTwo {

    @Test
    public void test4() {
        System.out.println("Test 4");
    }

    @Test(dataProvider = "test")
    public void test5(int ssn, String name, int ph) {
        System.out.println(ssn);
        System.out.println(name);
        System.out.println(ph);

    }


    @Test(dataProvider = "provider")
    public void test4(int ssn, String name) {
        System.out.println("SSN is " + ssn);
        System.out.println("Name is " + name);

    }

    @DataProvider(name = "test")
    public Object[][] dataprovider() {
        Object[][] newData = new Object[3][3];
        newData[0][0] = 123;
        newData[0][1] = "Shuva";
        newData[0][2] = 1234567;
        newData[1][0] = 123;
        newData[1][1] = "Shuva";
        newData[1][2] = 1234567;
        newData[2][0] = 123;
        newData[2][1] = "Shuva";
        newData[2][2] = 1234567;
        return newData;
    }

    @DataProvider(name = "provider")
    public Object[][] dataprovider1() {
        Object[][] data = new Object[2][2];
        data[0][0] = 123;
        data[0][1] = "Keya";
        data[1][0] = 54;
        data[1][1] = "Asma";
        return data;
    }

}








