public class CalculadoraPotencia {
    public double calcularPotencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public int calcularPotencia(int base, int expoente) {
        return (int) Math.pow(base, expoente);
    }

     public static void main(String[] args) {
        CalculadoraPotencia calculadora = new CalculadoraPotencia();
        double resultadoPotenciaDouble = calculadora.calcularPotencia(2.0, 3.0);
        int resultadoPotenciaInt = calculadora.calcularPotencia(3, 4);
        System.out.println("Resultado da potência (double): " + resultadoPotenciaDouble);
        System.out.println("Resultado da potência (int): " + resultadoPotenciaInt);
    }
}