package paquete2;
// El error existente es causado por el objeto Estudiante
// Al no tener un constructor que se base de la super clase 
// Presenta un error de que las subclases tambien requieren crear un constructor
// que reciba como minimo los parametros del constructor en Estudiante

public class EstudiantePresencial extends Estudiante {

    /*1.  Declarar
        numeroCreditos: Entero 
        costoCredito: Real 
        matriculaPresencial: Real */
    private int numeroCreditos;
    private double costoCredito;
    private double matriculaPresencial;

    public EstudiantePresencial(String n, String a, String iden, int ed) {
        super(n, a, iden, ed);
    }

    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero) {
        numeroCreditos = numero;
    }

    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor) {
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial() {
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos() {
        return numeroCreditos;
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito() {
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public double obtenerMatriculaPresencial() {
        return matriculaPresencial;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s"
                + "Numero Credito: %d\n"
                + "Costo Credito: %.2f\n"
                + "Matricula: %.2f\n",
                super.toString(),
                numeroCreditos,
                costoCredito,
                matriculaPresencial);

        return cadena;
    }
}
