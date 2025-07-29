public class Lector {
    public String sexo;
    public int numIdentificacion;
    public String nacionalidad;

    Lector (String sexo, String nacionalidad) {
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
    }

    Lector (int numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public void pideLibro(String nombreLibro) {  
        System.out.print("Necesito el libro: " + nombreLibro);
        
    }
    
    public void estudiar() {
        System.out.println("El lector está estudiando");
    }

}
