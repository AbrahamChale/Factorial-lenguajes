class Factorial {
    int calcular(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.calcular(5));  // Salida: 120
    }
}