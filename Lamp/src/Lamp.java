public class Lamp {
    String culoare;
    boolean on;

    void turnOff(){
        on=false;
    }

    void turnOn(){
        on=true;
    }

    boolean isOn(){
        if(on){
            System.out.println("ON");
        } else {
            System.out.println("OFF");
        }
        return on;
    }

    String getCuloare(){
        return culoare;
    }
}
