public class Main {
    public static void main(String[] args) {
        Punct p = new Punct();
        System.out.println(p.getX()); // 0
        System.out.println(p.getY()); // 0
        p.afiseaza(); //Coordonate punctului sunt (0,0).
        p.setX(3);
        p.setY(4);
        p.afiseaza(); //Coordonate punctului sunt (3,4).
        System.out.println(p.getX());//3
        System.out.println(p.getY());//4
        p.getX();//nu afiseaza.
        int x = p.getX(); // atribuie lui x rezultatul din p.getX() care este 3;
        System.out.println(x);//3

        Punct p2= new Punct(1,2);
        p2.afiseaza();//Coordonate punctului sunt (1,2).
    }
}
