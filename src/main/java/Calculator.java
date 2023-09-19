public class Calculator {
    //attributes
    char operator;
    int operand1;
    int operand2;
    String expression;

    //constructor
    public Calculator() {

    }
    //getter

    public char getOperator() {
        return operator;
    }

    public int getOperand1() {
        return operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand1(int operand) {
        operand1 = operand;
    }

    public void setOperand2(int operand) {
        operand2 = operand;
    }

    public void setOperator(String value) {
        if (value.equals("+")) {
            operator = '+';
        }
        if (value.equals("-")) {
            operator = '-';
        }
        if (value.equals("*")) {
            operator = '*';
        }
        if (value.equals("/")) {
            operator = '/';
        }
    }


    //functionality
    public String setExpression(String expression) {
        String[] parts = expression.split(" ");

        if (parts.length == 3 && (Character.isAlphabetic(operand1) || Character.isAlphabetic(operand2))) {
            setOperand1(Integer.parseInt(parts[0]));
            setOperand2(Integer.parseInt(parts[2]));
            setOperator(parts[1]);
        }
        this.expression = expression;
        return expression;
    }

    public boolean verify() {
        String correctExpression = operand1 + " " + operator + " " + operand2;

        if ((operand2 == 0) && (operator == '/')) {
            return false;
        }

        if (this.expression.equals(correctExpression)) {
            return true;
        } else {
            return false;
        }
    }


    public int evaluate() {
        if (operator == '+') {
            return operand1 + operand2;
        }
        if (operator == '-') {
            return operand1 - operand2;
        }
        if (operator == '*') {
            return operand1 * operand2;
        }
        if (operator == '/') {
            return operand1 / operand2;
        }


        return 0;
    }
}
