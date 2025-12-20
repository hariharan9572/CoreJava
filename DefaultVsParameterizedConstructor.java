class Human{
    private String name;
    private int age;

    // public Human(){ // default constructor
    //     // System.out.println("In constructor");
    //     name = "Jhon";
    //     age = 20;
    // }

    // public Human(int a, String n){ // parametrized constructor
    //     age = a;
    //     name = n;
    // }

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // age = age;

        // Human obj1 = obj;
        // obj1.age = age;

        this.age = age;  // this keyword represent the current object
    }
    
    
}

public class DefaultVsParameterizedConstructor {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(20, "Hari");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj.getAge());
        // obj.name="Hari";
        // obj.age=23;

        // obj.setAge(22, obj);
        obj.setAge(22);
        obj.setName("Hariharan");

        // System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
