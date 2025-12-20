// import tools.Calc;
// import tools.AdvCalc;

import tools.*;

public class Demo {
    public static void main(String[] args) {
        Calc obj = new Calc();
        AdvCalc obj1 = new AdvCalc();

        int r1=obj.add(3, 4);
        int r2=obj1.mul(3, 4);

        System.out.println(r1 + " : " + r2);
    }
}
