

public class Enciclopedia {
    public String nombre;
    public String genero;
    public int ano;

    public Enciclopedia (String nombre, String genero, int ano) {
        this.nombre = nombre;
        this.genero = genero;
        this.ano = ano;
    }

    public void informar() {  
        System.out.print("La informacion que necesitas esta aqui");
    
    }
    public void darFecha() {
            System.out.print("22-03-1859");
    }
}
