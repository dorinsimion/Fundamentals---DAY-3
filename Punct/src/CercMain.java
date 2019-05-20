public class CercMain {
    public static void main(String[] args) {
        Punct p= new Punct(3,4);
        int  raza = 3;
        Cerc cerc = new Cerc(p,raza);
        cerc.afiseaza();  // centru(3,4) raza 3

        p.setX(4);
        cerc.afiseaza(); // centru(4,4) raza 3
        raza=4;
        cerc.afiseaza(); // centru(4,4) raza 3

//        Cerc cerc2 = new Cerc(3);
//        cerc2.afiseaza();

        Cerc cerc3 = new Cerc();
        cerc3.afiseaza();

        double razaCerc = cerc.raza;
    }
}
