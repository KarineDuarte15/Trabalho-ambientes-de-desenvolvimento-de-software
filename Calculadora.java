public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }
    
    public int subtrair(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int resultadoSoma = calculadora.somar(5, 3);
        int resultadoSubtracao = calculadora.subtrair(10, 4);
        System.out.println("Resultado da soma: " + resultadoSoma);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);
    }
}