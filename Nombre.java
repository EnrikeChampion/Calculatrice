public class Nombre extends Expression{
    private double valeurNombre;

    public Nombre(){
        this.valeurNombre=0;
    }

    public Nombre(int v){
        this.valeurNombre=v;
    }

    public Nombre(Nombre n){
        this.valeurNombre=n.valeur();
    }

    public double valeur(){
        return this.valeurNombre;
    }
    
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
