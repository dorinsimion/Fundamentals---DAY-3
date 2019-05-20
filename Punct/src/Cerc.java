public class Cerc {
    private Punct punct;
    double raza;


    public Cerc(Punct punct, double raza) {
        this.punct = new Punct(punct.getX(), punct.getY());
        this.raza = raza;
    }

    private Cerc(double raza){
        this(new Punct(0,0),raza);
    }

    Cerc(){
        this(5);
//        this.punct=new Punct(0,0);
//        this.raza=5;
    }

    public Punct getPunct() {
        return punct;
    }

    public double getRaza() {
        return raza;
    }

    void afiseaza(){
        System.out.println("Cercul cu centrul ("+ punct.getX()+","
                + punct.getY()+") si raza "+ raza);
    }

}
