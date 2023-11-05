public class Main {
    public static void main(String[] args) {
        DataSet dataset = new DataSet();
        MatematicasDiscretas matematicas = new MatematicasDiscretas();
        RegresionLineal regresion = new RegresionLineal(dataset, matematicas);

        // Imprimir la ecuación de regresión
        regresion.imprimirEcuacion();

        // Valor X (adevertising) para predecir Y
        double x = 5; // Aqui puedo cambiar el valor de acuerdo a lo que necesite

        // Predice el valor Y basado en el valor X de entrada y lo imprime en la terminal
        double yPredicted = regresion.predecir(x);
        System.out.println("Valor X (Advertising) para predecir Y = " + x);
        System.out.println("Valor Y (ventas) predecido: " + yPredicted);
    }
}
