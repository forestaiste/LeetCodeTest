package org.example.leetcode.pagethree;

import java.util.Deque;
import java.util.LinkedList;

public class EvaluateReversePolishNotation150 {
    public int evalRPN(String[] tokens) {
        Deque<String> stack = new LinkedList<>();

        for (String token : tokens) {

            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                String numberB = stack.pop();
                String numberA = stack.pop();
                Integer result = 0;
                if (token.equals("+"))
                    result = Integer.parseInt(numberA) + Integer.parseInt(numberB);

                if (token.equals("-"))
                    result = Integer.parseInt(numberA) - Integer.parseInt(numberB);

                if (token.equals("*"))
                    result = Integer.parseInt(numberA) * Integer.parseInt(numberB);

                if (token.equals("/"))
                    result = Integer.parseInt(numberA) / Integer.parseInt(numberB);

                stack.push(result.toString());
            } else {
                stack.push(token);
            }
        }

        return Integer.parseInt(stack.pop());
    }
}
