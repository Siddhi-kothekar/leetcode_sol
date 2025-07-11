import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")) {
                st.push(Integer.parseInt(token));  
            } else {
                int op1 = st.pop();
                int op2 = st.pop();
                int ans = 0;

                switch (token) {
                    case "+":
                        ans = op2 + op1;
                        break;
                    case "-":
                        ans = op2 - op1;
                        break;
                    case "*":
                        ans = op2 * op1;
                        break;
                    case "/":
                        ans = op2 / op1;
                        break;
                }

                st.push(ans);
            }
        }

        return st.pop();
    }
}
