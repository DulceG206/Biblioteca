

public class BibliotecaController {

    Lector lector;
    Bibliotecaria bibliotecaria; 
    Enciclopedia enciclopedia; 
    Periodico periodico; 
    Libro libro; 

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
  public String pedirEnciclopedia(String nombre, String genero, int ano) {
    enciclopedia = new Enciclopedia(nombre, genero, ano); 
    return "Esta es la enciclopedia que necesita: " + nombre + genero + ano;
    
     
}
  public String pedirPeriodico(String editorial, int fecha) {
    periodico = new Periodico(editorial, fecha); 
    return "Este es el periódico que solicitó: " + editorial + fecha; 
    
     
}

  public String pedirLibro(String nombre, String autor, int edicion) {
    libro = new Libro(nombre, autor, edicion); 
    return "Este es el periódico que solicitó:" + nombre + autor + edicion;
    
     
}
}