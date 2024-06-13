package paquete2;
// El error existente es causado por el objeto Estudiante
// Al no tener un constructor que se base de la super clase 
// Presenta un error de que las subclases tambien requieren crear un constructor
// que reciba como minimo los parametros del constructor en Estudiante

public class EstudianteDistancia extends Estudiante {

    private int numeroAsignaturas;
    private double costoAsignatura;
    private double matriculaDistancia;

    public EstudianteDistancia(String n, String a, String iden, int ed) {
        super(n, a, iden, ed);
    }

    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsginaturas(int numero) {
        numeroAsignaturas = numero;
    }

    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor) {
        costoAsignatura = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    public void calcularMatriculaDistancia() {
        matriculaDistancia = numeroAsignaturas * costoAsignatura;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroAsignaturas() {
        return numeroAsignaturas;
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoAsignatura() {
        return costoAsignatura;
    }

    // 7. Método obtenerMatriculaDistancia() : Real
    public double obtenerMatriculaDistancia() {
        return matriculaDistancia;
    }


}
