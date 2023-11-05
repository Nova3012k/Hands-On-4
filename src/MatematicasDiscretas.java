public class MatematicasDiscretas {
    public double calcularSumatoria(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum;
    }

    public double calcularSumatoriaMultiplicacion(double[] array1, double[] array2) {
        double sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i] * array2[i];
        }
        return sum;
    }
}
