public class Example {
     void fun() {
        System.out.println("A.fun()");
    }
}

class B extends Example {
     void fun() {
        System.out.println("B.fun()");
    }

    public static void main(String args[]) {
        Example a = new B();
        a.fun();  // prints A.fun()

    }
}




