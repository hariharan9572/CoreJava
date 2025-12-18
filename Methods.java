class Computer{
    public void playMusic(){
        System.out.println("Playing Music...");
    }

    public String getMeAPen(int cost){
        if (cost >= 10){
            return "Pen";
        }else{
            return "Cost of a pen is 10Rs";
        }
    }
}

public class Methods {
    public static void main(String[] args) {

        Computer obj = new Computer();
        obj.playMusic();
        
        String str = obj.getMeAPen(9);
        System.out.println(str);
    }
}
