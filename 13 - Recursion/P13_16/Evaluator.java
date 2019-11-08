/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13_16;

/**
 *
 * @author billy
 */
public class Evaluator {

    private ExpressionTokenizer tokenizer;

    public Evaluator(String anExpression) {
        tokenizer = new ExpressionTokenizer(anExpression);
    }

    public int getExpressionValue() {
        int value = getTermValue();
        boolean done = false;
        while (!done) {
            String next = tokenizer.peekToken();
            if ("+".equals(next) || "-".equals(next)) {
                tokenizer.nextToken();
                int value2 = getTermValue();
                if ("+".equals(next)) {
                    value += value2;
                } else {
                    value -= value2;
                }
            } else {
                done = true;
            }
        }
        return value;
    }

    public int getTermValue() {
        int value = getFactorValue();
        boolean done = false;
        while (!done) {
            String next = tokenizer.peekToken();
            if ("*".equals(next) || "/".equals(next) || "^".equals(next) || "%".equals(next)) {
                tokenizer.nextToken();
                int value2 = getFactorValue();
                if ("*".equals(next)) {
                    value *= value2;
                } else if ("/".equals(next)) {
                    value /= value2;
                } else if ("%".equals(next)) {
                    value %= value2;
                } else {
                    value = (int)Math.pow(value, value2);
                }
            } else {
                done = true;
            }
        }
        return value;
    }

    public int getFactorValue() {
        int value;
        String next = tokenizer.peekToken();
        if ("(".equals(next)) {
            tokenizer.nextToken();
            value = getExpressionValue();
            tokenizer.nextToken();
        } else {
            value = Integer.parseInt(tokenizer.nextToken());
        }
        return value;
    }
}
