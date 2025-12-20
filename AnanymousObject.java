class A{
    public A(){
        System.out.println("object created");
    }
    public void show(){
        System.out.println("In A show");
    }
}

public class AnanymousObject {
    public static void main(String[] args){
        // int marks;
        // marks=99;
        
        // // A obj = new A();

        // A obj;
        // obj = new A();

        // obj.show();

        new A().show();  // Ananoymous object
        new A().show();
    }
}
