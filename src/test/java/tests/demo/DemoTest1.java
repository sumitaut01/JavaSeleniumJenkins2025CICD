package tests.demo;

import org.testng.annotations.Test;
import tests.BaseTest;


public class DemoTest1  extends BaseTest {


    @Test
    public  void method1(){
        System.out.println("this is the first one");

    }


    @Test
    public  void method2(){
        System.out.println("this is the second one");
    }
}
