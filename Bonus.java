public class Test {
    public static Expression fabriqueExpression(String e) {
        e = e.replaceAll("\\s", ""); 

        if (e.matches("\\d+")) {
            return new Nombre(Integer.parseInt(e));
        }

        int openBrackets = 0;
        for (int i = 0; i < e.length(); i++) {
            char c = e.charAt(i);
            if (c == '(') openBrackets++;
            else if (c == ')') openBrackets--;
            else if ((c == '+' || c == '-' || c == '*' || c == '/') && openBrackets == 0) {
                Expression left = fabriqueExpression(e.substring(0, i));
                Expression right = fabriqueExpression(e.substring(i + 1));
                switch (c) {
                    case '+':
                        return new Addition(left, right);
                    case '-':
                        return new Soustraction(left, right);
                    case '*':
                        return new Multiplication(left, right);
                    case '/':
                        return new Division(left, right);
                }
            }
        }

   
        if (e.startsWith("(") && e.endsWith(")")) {
            return fabriqueExpression(e.substring(1, e.length() - 1));
        }

        throw new IllegalArgumentException("Expression non valide: " + e);
    }

    public static void main(String[] args) {
        String expr1 = "3";
        String expr2 = "17-2";
        String expr3 = "(17-2)/3";

        System.out.println(fabriqueExpression(expr1)); 
        System.out.println(fabriqueExpression(expr2)); 
        System.out.println(fabriqueExpression(expr3)); 
    }
}
