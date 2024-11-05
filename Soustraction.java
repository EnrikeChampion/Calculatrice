/**
* Cette classe permet de soustraire deux expressions.
*/
public class Soustraction extends Operation{
    public static final String operateur="-";

    /** 
    * Cette fonction sert à créer un objet avec la méthode champ à champ. 
	* <p>
	* Elle ne doit rien retourner.
	*
	* @param  e1 : une expression
	* @param  e2 : une expression
    */
    public Soustraction(Expression e1, Expression e2){
        super(e1, e2);
    }

    /** 
    * Cette fonction sert à créer un objet avec la méthode copie. 
	* <p>
	* Elle ne doit rien retourner.
	*
	* @param  o : une opération
    */
    public Soustraction(Operation o){
        super(o);
    }

    /** 
    * Cette fonction sert à donner la valeur de cette expression. 
	* <p>
	* Elle doit retourner la valeur de cette expression.
	*
	* @return   Sousrtaction de e1 et e2
    */
    public double valeur(){
        return getOperande1().valeur() - getOperande2().valeur();
    }

    /** 
    * Cette fonction sert à définir ce qu'il faut afficher. 
	* <p>
	* Elle doit retourner la chaîne de caractère à afficher.
	*
	* @return   String permettant d'afficher la soustraction
    */
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