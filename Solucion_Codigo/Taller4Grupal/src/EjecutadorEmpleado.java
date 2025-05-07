
import java.util.Scanner;

public class EjecutadorEmpleado {

    public static void main(String[] args) {
        boolean bandera = true;
        Scanner tcl = new Scanner(System.in);
        String[] nombres = new String[100];
        int[] edad = new int[100];
        double[] salario = new double[100];
        int op = 0;
        int i = 0;
        Empleado emp1 = new Empleado();
        while (bandera) {
            String n;
            int e;
            double s;
            System.out.println("Que desea hacer?");
            System.out.println("1) Agregar empleado");
            System.out.println("2) Lista de empleados\n3) Salir");
            op = tcl.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Nombre del empleado");
                    n = tcl.next();
                    System.out.println("Edad del empleado");
                    e = tcl.nextInt();
                    System.out.println("Sueldo del empleado");
                    s = tcl.nextDouble();
                    nombres[i] = n;
                    edad[i] = e;
                    salario[i] = s;
                    i++;
                    break;
                case 2:
                    boolean que = true;
                    int j = 0;
                    while (que) {

                        if (salario[j] == 0) {
                            que = false;
                        } else {

                            System.out.println("Nombre " + nombres[j] + " edad " + edad[j] + " Salario " + salario[j]);
                        }
                        j++;

                    }
                    break;
                case 3:
                    bandera = false;

                    break;

                default:
                    System.out.println("Intente de nuevo");
            }
        }
        boolean por = true;
        int j = 0;
        double sumtota = 0;
        while (por) {
            if (salario[j] == 0) {
                por = false;
            } else {

                System.out.println("Nombre " + nombres[j] + " edad " + edad[j] + " Salario " + salario[j]);
                sumtota = sumtota + salario[j];

                j++;
            }

        }
        j--;

        System.out.println("Ingresar porsentaje");
        double porcentaje = tcl.nextDouble();
        emp1.setPorcentaje(porcentaje);
        emp1.setTotalSueldo(sumtota);
        emp1.setNumEmpleados(j);
        emp1.calcularProm();
        por = true;
        j = 0;
        while (por) {
            if (salario[j] < emp1.getPromSueldo()) {
                emp1.calcularAumentoSalario(j, salario);
                System.out.println("Nombre " + nombres[j] + " edad " + edad[j] + " Salario " + emp1.getSalarioAum());

            } else {

                System.out.println("Nombre " + nombres[j] + " edad " + edad[j] + " Salario " + salario[j]);

            }
            j++;
            if (salario[j] == 0) {
                por = false;
            }
        }
    }
}
