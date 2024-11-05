public class CalculatriceSimple {
    public static void main(String[] args) {
        Nombre six = new Nombre(6);
        Nombre dix = new Nombre(10);
        Operation s = new Soustraction(dix, six);
        System.out.println(s + " = " + s.valeur()); 
    }
}
