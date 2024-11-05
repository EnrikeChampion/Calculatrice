/**
* Cette classe permet est un modèle pour les différentes opérations.
*/
public abstract class Operation extends Expression{
    private Expression operande1;
    private Expression operande2;

    /** 
    * Cette fonction sert à créer un objet avec la méthode champ à champ. 
	* <p>
	* Elle ne doit rien retourner.
	*
	* @param  e1 : une expression
	* @param  e2 : une expression
    */
    public Operation(Expression e1, Expression e2){
        this.operande1=e1;
        this.operande2=e2;
    }

    /** 
    * Cette fonction sert à créer un objet avec la méthode copie. 
	* <p>
	* Elle ne doit rien retourner.
	*
	* @param  o : une opération
    */
    public Operation(Operation o){
        this.operande1=o.getOperande1();
        this.operande2=o.getOperande2();
    }

    /** 
    * Cette fonction sert à obtenir la première opérande. 
	* <p>
	* Elle doit retourner la première opérande.
	*
	* @return   L'opérande 1
    */
    public Expression getOperande1(){
        return this.operande1;
    }

    /** 
    * Cette fonction sert à obtenir la deuxième opérande. 
	* <p>
	* Elle doit retourner la deuxième opérande.
	*
	* @return   L'opérande 2
    */
    public Expression getOperande2(){
        return this.operande2;  
    }

    /** 
    * Cette fonction est un modèle pour les classes filles.
	* <p>
	* Elle ne doit rien retourner.
    */
    public abstract double valeur();
}