public class Main {
    public static void main(String[] args) {
//        Lamp lamp1 = new Lamp();
//        lamp1.turnOn();
//        lamp1.isOn(); //ON
//        System.out.println(lamp1.isOn()); //ON , true
//        boolean isOn = lamp1.isOn(); //ON
//        System.out.println(isOn);//true
//
//        lamp1.turnOff();
//        lamp1.isOn();  //OFF
//
//        Lamp lamp2 = new Lamp();
//        lamp2.turnOff();
//        lamp2.isOn();  //OFF

        Lamp lamp3 = new Lamp();
        boolean lamp3IsOn = lamp3.isOn(); //OFF
        System.out.println(lamp3IsOn); //FALSE

        System.out.println(lamp3.getCuloare()); //null
        if(lamp3.getCuloare()!=null){
            System.out.println("In cadrul if"); //nu se executa
        }
        lamp3.culoare="albastru";
        System.out.println(lamp3.getCuloare()); // albastru
        System.out.println(lamp3.getCuloare().equals("alb"));//false

//        boolean x;
//        System.out.println(x);  nu functioneaza , neinitializat
    }
}
