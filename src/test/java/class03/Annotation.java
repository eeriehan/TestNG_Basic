package class03;

import org.testng.annotations.*;

public class Annotation {

    @BeforeTest
    public void BeforeTest(){
        System.out.println("B4 TEST");

    }
    @AfterTest
    public void AfterTest(){
        System.out.println("AFTER test");
    }




    @BeforeMethod
    public  void BeforeMethod(){
        System.out.println("I am Before Method");
    }
    @Test
    public void AFirstTest(){
        System.out.println("I am A 1 Test");
    }


    @Test
    public void BSecondTest(){
        System.out.println("I am B 2 Test");
    }

    @AfterMethod
    public  void AfterMethod(){
        System.out.println("I am After Method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AFTER CLASS");
    }
}
