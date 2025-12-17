package tests.demo;

import org.testng.annotations.Test;
import tests.BaseTest;

public class DemoTest2 extends BaseTest {

    @Test
    public  void method1(){
        System.out.println("this is the DemoTest2=>first one");
    }


    @Test
    public  void method2(){
        System.out.println("this is the DemoTest2=>second one");
    }
}
