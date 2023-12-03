public class CalculadoraPotencia {
    public double calcularPotencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public int calcularPotencia(int base, int expoente) {
        return (int) Math.pow(base, expoente);
    }
}