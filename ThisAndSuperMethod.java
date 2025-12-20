class A extends Object{ // extend Object is there but you can't see optional
    public A(){
        super(); // super() is there by default for every constructor  but you can't see optional
        System.out.println("In A");
    }

    public A(int n){
        super();
        System.out.println("In A int");
    }
}

class B extends A{
    public B(){
        // super();
        System.out.println("In B");
    }

    public B(int n){
        // super(n); // call the constructor of super class - super method will execute the super class
        this(); // this method will excute the constructor of same class
        System.out.println("In B int");
    }
}

public class ThisAndSuperMethod {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
