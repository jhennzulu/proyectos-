public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("La tienda de ropa");
        
        Producto productoUno = new Producto();

        productoUno.setNombre("falda");
        productoUno.setPrecio(70000);
        productoUno.mostrar();
        
    }
}
