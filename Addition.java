public class Addition extends Operation{
    public static final String operateur="+";

    public Addition(Expression e1, Expression e2){
        super(e1,e2);
    }

    public Addition(Operation a){
        super(a);
    }

    public double valeur(){
        return getOperande1().valeur() + getOperande2().valeur();
    }

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
