import java.util.Stack;

public class FactorialStack {

    static class Call {
        int n;
        int res;

        Call(int n) {
            this.n = n;
            this.res = -1;
        }

        @Override
        public String toString() {
            return "factoriel(" + n + ")";
        }
    }

    public static int factorial(int n) {
        Stack<Call> stack = new Stack<>();
        stack.push(new Call(n));
        System.out.println("Empilement :");

        while (stack.peek().n > 0) {
            int nextN = stack.peek().n - 1;
            System.out.println(stack);
            stack.push(new Call(nextN));
        }

        System.out.println("\nDépilement :");

    
        int res = 1;
        while (!stack.isEmpty()) {
            Call call = stack.pop();
            if (call.n == 0) {
                call.res = 1;
            } else {
                call.res = call.n * res;
            }
            res = call.res;
            System.out.println(call.n + " ← " + call);
        }

        return res;
    }

    public static void main(String[] args) {
        // Dans notre schéma, nous avons testé pour n = 4 donc on simule le programme suivant : 
        int n = 4;
        int res = factorial(n);
        System.out.println("\nFactoriel de " + n + " = " + res);
    }
}
