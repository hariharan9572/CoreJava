class Human{
    private String name;
    private int age;

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

    public Human(){
        // System.out.println("In constructor");
        name = "Jhon";
        age = 20;
    }
    
    
}

public class Constructor {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getName() + " : " + obj.getAge());
        // obj.name="Hari";
        // obj.age=23;

        // obj.setAge(22, obj);
        obj.setAge(22);
        obj.setName("Hariharan");

        // System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
