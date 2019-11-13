class Dog{
    public void bark(){
        System.out.println("woof ");
    }

    public static void testStatic()
    {
        System.out.println("inside static");
    }
}
class Hound extends Dog{
    public void sniff(){
        System.out.println("sniff ");
    }

    public void bark(){
        System.out.println("bowl");
    }

    public static void testStatic()
    {
        System.out.println("inside static from dog");
    }
}

public class OverridingTest{
    public static void main(String [] args){
        Dog dog = new Hound();
        Dog dog1=new Dog();
        Dog.testStatic();
        Hound.testStatic();
       // dog.bark();
        //dog1.bark();
//        Hound hound=(Hound) new Dog();
    //    hound.bark();

    }
}