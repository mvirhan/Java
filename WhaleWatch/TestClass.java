import java.util.*;
public class TestClass
{
    public TestClass()
    {

    }
    
    //test 1.0
    public void test1()
    {
       Whale wh = new Whale();
       wh.display();        
    }

   // test 2.0
    public void test2()
    {
       Whale wh = new Whale();
       wh.setDirection("south");
       wh.setType("Adult");
       wh.setSpecies(1);

       display();      
    }
   
    // test 2.1
    public void test3()
    {
       Whale wh = new Whale();
       wh.setDirection(1);
       wh.setType(1);
       wh.setSpecies("String");

       wh.display();      
    }

     //test 2.2
     public void test4()
    {
       Whale wh = new Whale();
       wh.setDirection(1);
       wh.setType(1);
       wh.setSpecies("String");

       wh.display();      
    }

    public void display()
    {

    }

    public static void main (String[] args)
    {
        TestClass tc = new TestClass();
        tc.test2();
    }
}

