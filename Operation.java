public abstract class Operation extends Expression{
    private Expression operande1;
    private Expression operande2;

    public Operation(Expression e1, Expression e2){
        this.operande1=e1;
        this.operande2=e2;
    }

    public Operation(Operation o){
        this.operande1=o.getOperande1();
        this.operande2=o.getOperande2();
    }

    public Expression getOperande1(){
        return this.operande1;
    }

    public Expression getOperande2(){
        return this.operande2;  
    }

    public abstract double valeur();
}