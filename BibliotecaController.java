

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
  public Void pedirEnciclopedia(String nombre, String genero, int ano) {
    enciclopedia = new Enciclopedia(nombre, genero, ano); 
    System.out.print("Esta es la enciclopedia que necesita");
    
     
}
  public Void pedirPeriodico(String editorial, int fecha) {
    periodico = new Periodico(editorial, fecha); 
    System.out.print("Este es el periódico que solicitó");
    
     
}

  public Void pedirLibro(String nombre, String autor, int edicion) {
    libro = new Libro(nombre, autor, edicion); 
    System.out.print("Este es el periódico que solicitó");
    
     
}
}