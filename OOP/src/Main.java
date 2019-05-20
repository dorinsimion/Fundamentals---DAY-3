public class Main {
    public static void main(String[] args) {
        Pisica diesel = new Pisica();
        diesel.areCoada=true;
        diesel.culoare="GRI";
        System.out.println(diesel.culoare); //GRI
        System.out.println(diesel.areCoada()); //true

        boolean areCoada = diesel.areCoada();
        System.out.println(areCoada);   //true

        diesel.miauna();  // Miau miau miau

    }
}
