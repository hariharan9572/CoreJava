import other.*;

class C extends A{
    public void abc(){
        System.out.println(marks);
    }
}

public class Demo {
    public static void main(String[] args){
        A obj = new A();
        int r = obj.marks;
        obj.show();
        System.out.println(r);

        B obj1 = new B();

        System.out.println(obj1.marks);
    }
}
