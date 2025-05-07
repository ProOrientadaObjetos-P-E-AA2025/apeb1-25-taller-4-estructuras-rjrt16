import java.util.Scanner;
public class Ejercicio1_AplicacionIf {
    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        String n;
        int nP;
        double p; 
        
        System.out.println("Ingrese los datos");
        System.out.println("Ingrese el nombre del producto: ");
        n = an.nextLine();
        System.out.println("Ingrese cuantos productos desea comprar: ");
        nP = an.nextInt();
        System.out.println("Ingrese el precio del producto: ");
        p = an.nextDouble();
        
        Ejecutar1 a = new Ejecutar1(n, p, nP);
        a.calcularDescuento(p);
        a.calcularCompraFinal(p);
       

        System.out.println("El nombre del producto es: "+a.getProducto()+" el precio del producto es: " + a.getPrecio()+" y un total de: " + a.getNumProductos() + " con un descuento de: "+a.getDescuento()+" el costo de la compra final tiene un valor de: "+a.getCompraFinal());
    }
}