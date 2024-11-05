/**
* Cette classe permet d'additionner deux expressions.
*/

public class Addition extends Operation{
    public static final String operateur="+";

    /** 
    * Cette fonction sert à créer un objet avec la méthode champ à champ. 
	* <p>
	* Elle ne doit rien retourner.
	*
	* @param  e1 : une expression
	* @param  e2 : une expression
    */
    public Addition(Expression e1, Expression e2){
        super(e1,e2);
    }

    /** 
    * Cette fonction sert à créer un objet avec la méthode copie. 
	* <p>
	* Elle ne doit rien retourner.
	*
	* @param  a : une opération
    */
    public Addition(Operation a){
        super(a);
    }

    /** 
    * Cette fonction sert à donner la valeur de cette expression. 
	* <p>
	* Elle doit retourner la valeur de cette expression.
	*
	* @return   Addition de e1 et e2
    */
    public double valeur(){
        return getOperande1().valeur() + getOperande2().valeur();
    }

    /** 
    * Cette fonction sert à définir ce qu'il faut afficher. 
	* <p>
	* Elle doit retourner la chaîne de caractère à afficher.
	*
	* @return   String permettant d'afficher l'addition
    */
    public String toString(){
       return getOperande1() + " " + operateur + " " + getOperande2();
    }
    
    public static void main(String[] args) {
        Expression e1 = new Nombre(3);
        Expression e2 = new Nombre(4);
        Addition add = new Addition(e1, e2);
        System.out.println("Résultat de l'addition : " + add.valeur()); // Affiche: 7.0
        System.out.println(add); // Affiche: 3.0 + 4.0
    }
}
