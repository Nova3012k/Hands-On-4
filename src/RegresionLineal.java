public class RegresionLineal {
    private final double beta0;
    private final double beta1;

    public RegresionLineal(DataSet dataset, MatematicasDiscretas matematicas) {
        double[] advertising = dataset.advertising;
        double[] sales = dataset.sales;
        double n = advertising.length;

        double sumX = matematicas.calcularSumatoria(advertising);
        double sumY = matematicas.calcularSumatoria(sales);
        double sumXY = matematicas.calcularSumatoriaMultiplicacion(advertising, sales);
        double sumXSquare = matematicas.calcularSumatoriaMultiplicacion(advertising, advertising);

        // Calcula los coeficientes de regresión
        beta1 = (n * sumXY - sumX * sumY) / (n * sumXSquare - sumX * sumX);
        beta0 = (sumY - beta1 * sumX) / n;
    }

    public double predecir(double x) {
        return beta0 + beta1 * x;
    }

    public void imprimirEcuacion() {
        System.out.println("Formula: Y= B0 + B1 * X");
        System.out.println("Ecuación de Regresión: Y = " + beta0 + " + " + beta1 + " * X");
    }
}