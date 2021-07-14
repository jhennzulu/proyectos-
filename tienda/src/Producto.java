public class Producto {

    private String nombre = " ";
    private float precio = 0;

    public Producto(){

    }

    public void mostrar() {
        System.out.println(nombre+ ":"+ precio);
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setPrecio(float precio){
        this.precio = precio;
    }

    public float getPrecio(){
        return this.precio;

    }    
}
