public class Libro{
    public String nombre;
    public String autor;
    public int edicion;

    public Libro (String nombre, String autor, int edicion) {
        this.nombre = nombre;
        this.autor = autor;
        this.edicion = edicion;
    }

    public String ensenar() {  
        System.out.print("El libro nos ensena");
    }
    public String citarlo() {
            System.out.print("Las referencias del libro son: ");

    }
}