public class Division extends Operation{
    public static final String operateur="/";

    public Division(Expression e1, Expression e2) {
        super(e1, e2);
    }

    public Division(Operation o){
        super(o);
    }

    public double valeur(){
       try {
            if (getOperande2().valeur() == 0) {
                throw new ArithmeticException("Division par zéro");
            }
            return getOperande1().valeur() / getOperande2().valeur();
        } catch (ArithmeticException e) {
            System.out.println("Erreur: " + e.getMessage());
            return 0;
        }
    }

    public String toString(){
        return getOperande1() + " " + operateur + " " + getOperande2();
    }

    public static void main(String[] args) {
        Expression n1 = new Nombre(6);
        Expression n2 = new Nombre(3);
        Division div = new Division(n1, n2);
        System.out.println("Résultat de la division : " + div.valeur()); // Affiche: 2.0
        System.out.println(div); // Affiche: 6.0 / 3.0

        Expression n3 = new Nombre(0);
        Division divZero = new Division(n1, n3);
        System.out.println("Résultat de la division : " + divZero.valeur()); // Affiche: Erreur: Division par zéro; Renvoie: 0.0
        System.out.println(divZero); // Affiche: 6.0 / 0.0
    }

}