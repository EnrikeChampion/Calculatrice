public class Soustraction extends Operation{
    public static final String operateur="-";

    public Soustraction(Expression e1, Expression e2){
        super(e1, e2);
    }

    public Soustraction(Operation o){
        super(o);
    }

    public double valeur(){
        return getOperande1().valeur() - getOperande2().valeur();
    }

    public String toString(){
        return getOperande1() + " " + operateur + " " + getOperande2();
    }

    public static void main(String[] args) {
        Expression n1 = new Nombre(3);
        Expression n2 = new Nombre(4);
        Soustraction sous = new Soustraction(n1, n2);
        System.out.println("Résultat de la soustraction : " + sous.valeur()); // Affiche: -1.0
        System.out.println(sous); // Affiche: 3.0 - 4.0
    }
}