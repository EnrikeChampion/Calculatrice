/**
* Cette classe permet de multiplier deux expressions.
*/
public class Multiplication extends Operation{
    public static final String operateur="*";

    /** 
    * Cette fonction sert à créer un objet avec la méthode champ à champ. 
	* <p>
	* Elle ne doit rien retourner.
	*
	* @param  e1 : une expression
	* @param  e2 : une expression
    */
    public Multiplication(Expression e1, Expression e2){
        super(e1, e2);
    }

    /** 
    * Cette fonction sert à créer un objet avec la méthode copie. 
	* <p>
	* Elle ne doit rien retourner.
	*
	* @param  o : une opération
    */
    public Multiplication(Operation o){
        super(o);
    }

    /** 
    * Cette fonction sert à donner la valeur de cette expression. 
	* <p>
	* Elle doit retourner la valeur de cette expression.
	*
	* @return   Multiplication de e1 et e2
    */
    public double valeur(){
        return getOperande1().valeur() * getOperande2().valeur();
    }

    /** 
    * Cette fonction sert à définir ce qu'il faut afficher. 
	* <p>
	* Elle doit retourner la chaîne de caractère à afficher.
	*
	* @return   String permettant d'afficher la multiplication
    */
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