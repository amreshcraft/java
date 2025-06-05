// two static method

class Parent{
   public void method(){
    System.out.println("Hello I am Parent");
   }
   
}

class Child extends Parent{
      public void method(){
    System.out.println("Hello I am Child");
   }
}
public class TestMethodHiding {

    Parent p = new Parent();
    p.method();
    Parent p2 = new Child();
    p2.method();
    Child c = new Child();
    c.method();
    // Child c2 = new Parent(); error
    
}