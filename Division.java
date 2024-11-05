/**
* Cette classe permet de diviser deux expressions.
*/
public class Division extends Operation{
    public static final String operateur="/";

    /** 
    * Cette fonction sert à créer un objet avec la méthode champ à champ. 
	* <p>
	* Elle ne doit rien retourner.
	*
	* @param  e1 : une expression
	* @param  e2 : une expression
    */
    public Division(Expression e1, Expression e2) {
        super(e1, e2);
    }

    /** 
    * Cette fonction sert à créer un objet avec la méthode copie. 
	* <p>
	* Elle ne doit rien retourner.
	*
	* @param  o : une opération
    */
    public Division(Operation o){
        super(o);
    }

    /** 
    * Cette fonction sert à donner la valeur de cette expression. 
	* <p>
	* Elle doit retourner la valeur de cette expression.
	*
	* @return   Division de e1 et e2
    * @return   0
    * @throws ArithmeticException   Si division par zéro
    */
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

    /** 
    * Cette fonction sert à définir ce qu'il faut afficher. 
	* <p>
	* Elle doit retourner la chaîne de caractère à afficher.
	*
	* @return   String permettant d'afficher la division
    */
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