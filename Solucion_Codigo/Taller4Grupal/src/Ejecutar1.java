
public class Ejecutar1 {

    private String producto;
    private double precio;
    private double descuento;
    private double compraFinal;
    private int numProductos;

    public Ejecutar1(String producto,double precio,int numProductos) {
        this.producto = producto;
        this.precio = precio;
        this.numProductos = numProductos;
        
        
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void calcularDescuento(double descuento) {
        if ((precio > 1000) || (numProductos < 10)) {
            this.descuento = precio / 1.10;
        } else {
            this.descuento = precio / 1.05;
        }
    }

    public double getCompraFinal() {
        return compraFinal;
    }

    public void calcularCompraFinal(double compraFinal) {
        this.compraFinal = (descuento*numProductos);
    }

    public int getNumProductos() {
        return numProductos;
    }

    public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }

}
