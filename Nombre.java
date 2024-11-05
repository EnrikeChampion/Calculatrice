/**
* Cette classe permet de définir des nombres.
*/
public class Nombre extends Expression{
    private double valeurNombre;

    /** 
    * Cette fonction sert à créer un objet avec la méthode par défaut. 
	* <p>
	* Elle ne doit rien retourner.
    */
    public Nombre(){
        this.valeurNombre=0;
    }

    /** 
    * Cette fonction sert à créer un objet avec la méthode champ à champ. 
	* <p>
	* Elle ne doit rien retourner.
	*
	* @param  v : un entier
    */
    public Nombre(int v){
        this.valeurNombre=v;
    }

    /** 
    * Cette fonction sert à créer un objet avec la méthode copie. 
	* <p>
	* Elle ne doit rien retourner.
	*
	* @param  n : un nombre
    */
    public Nombre(Nombre n){
        this.valeurNombre=n.valeur();
    }

    /** 
    * Cette fonction sert à donner la valeur de ce nombre. 
	* <p>
	* Elle doit retourner la valeur du nombre.
	*
	* @return   Valeur du nombre
    */
    public double valeur(){
        return this.valeurNombre;
    }
    
    /** 
    * Cette fonction sert à définir ce qu'il faut afficher. 
	* <p>
	* Elle doit retourner la chaîne de caractère à afficher.
	*
	* @return   String permettant d'afficher le nombre
    */
    public String toString() {
    return String.valueOf(this.valeurNombre);
    }
    
    public static void main(String[] args) {
        Nombre n1 = new Nombre();
        Nombre n2 = new Nombre(5);
        Nombre n3 = new Nombre(n2);

        System.out.println(n1); // Affiche: 0
        System.out.println(n2); // Affiche: 5
        System.out.println(n3); // Affiche: 5
    }
}
