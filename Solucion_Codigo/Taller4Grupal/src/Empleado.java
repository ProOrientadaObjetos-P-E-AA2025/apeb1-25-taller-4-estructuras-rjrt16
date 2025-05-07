
public class Empleado {

    private String nombre;
    private double salario;
    private int edad;
    private double porcentaje;
    private double promSueldo;
    private int numEmpleados;
    private double totalSueldo;
    private double salarioAum;

    public Empleado() {
    }

    public Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje / 100;
    }

    public double getTotalSueldo() {
        return totalSueldo;
    }

    public void setTotalSueldo(double totalSueldo) {
        this.totalSueldo = totalSueldo;
    }

    public double getPromSueldo() {
        return promSueldo;
    }

    public void calcularProm() {
        promSueldo = totalSueldo / numEmpleados;

    }

    public double getSalarioAum() {
        return salarioAum;
    }

    public void calcularAumentoSalario(int j, double matriz[]) {
        salarioAum = matriz[j] + (matriz[j] * porcentaje);
    }

}
