

public class BibliotecaController {

    Lector lector;
    Bibliotecaria bibliotecaria; 

    public BibliotecaController () {

    }

    public boolean crearLector( String sexo,String nacionalidad) {
        lector = new Lector(sexo, nacionalidad); 
        return true;
    }

    public boolean crearBibliotecaria(String nombre, String turno, int edad) {
    bibliotecaria = new Bibliotecaria(nombre, turno, edad); 
    return true;
     
}
}