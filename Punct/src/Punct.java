public class Punct {
    int x;
    int y;


    Punct(){}

    Punct(int x,int y){
        this.x=x;
        this.y=y;
    }

    Punct (int x){
        this.x=x;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void afiseaza() {
        System.out.println("Coordonate puntului sunt ("+x+","+y+").");
        //Coordonate punctului sunt (3,4).
    }
}
