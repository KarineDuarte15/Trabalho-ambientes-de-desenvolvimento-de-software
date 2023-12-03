public class CalculadoraSoma {
        public int somar(int a, int b) {
            return a + b;
        }
        
        public int somar(int a, int b, int c) {
            return a + b + c;
        }

        public static void main(String[] args) {
            CalculadoraSoma calculadora = new CalculadoraSoma();
            int resultadoSoma2 = calculadora.somar(2, 3);
            int resultadoSoma3 = calculadora.somar(1, 2, 3);
            System.out.println("Resultado da soma 2: " + resultadoSoma2);
            System.out.println("Resultado da soma 3: " + resultadoSoma3);
        }
    }