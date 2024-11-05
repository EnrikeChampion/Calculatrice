public class Multiplication extends Operation{
    public static final String operateur="*";

    public Multiplication(Expression e1, Expression e2){
        super(e1, e2);
    }

    public Multiplication(Operation o){
        super(o);
    }

    public double valeur(){
        return getOperande1().valeur() * getOperande2().valeur();
    }

    public String toString(){
        return getOperande1() + " " + operateur + " " + getOperande2();
    }

    public static void main(String[] args) {
        Expression n1 = new Nombre(3);
        Expression n2 = new Nombre(4);
        Multiplication multi = new Multiplication(n1, n2);
        System.out.println("Résultat de la multiplication : " + multi.valeur()); // Affiche: 12.0
        System.out.println(multi); // Affiche: 3.0 * 4.0
    }
}