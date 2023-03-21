package taller.inmuebles;

public class Main {
    public static void main(String[] args) {
        Inmueble inmueble = new Inmueble(1, 12, "Calle 13");
        inmueble.calcularPrecioVenta(1);
        inmueble.imprimir();
    }
}