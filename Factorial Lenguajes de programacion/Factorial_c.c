
int factorial(int n) {
    int resultado = 1;
    for (int i = 1; i <= n; i++) {
        resultado *= i;
    }
    return resultado;
}
int main() {
    printf("%d", factorial(5));  // Salida: 120
    return 0;
}