package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGAnnotations {

    //first test case, to show how testNG order the result of tests
    //it's following alphabetical order
    @Test
    public void BfirstTestCase(){
        System.out.println("i am the 1st");
    }
    @Test
    public void AsecondTestCase(){
        System.out.println("i am the 2nd");
    }
    @Test
    public void thirdTestCase(){
        System.out.println("i am the 3rd");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("i am before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("i am AFTER");
    }

}
