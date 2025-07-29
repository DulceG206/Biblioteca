import java.util.Scanner;
public class Main {
public static void main(String[] args) {

    Lector lector;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el sexo del lector: ");
    String sexo = scanner.nextLine();
    System.out.print("Ingrese la nacionalidad del lector: ");
    String nacionalidad = scanner.nextLine();
    lector = new Lector(sexo, nacionalidad); 
    System.out.println("Nuevo lector ingresado. Datos: sexo: " + sexo + "Nacionalidad: " + nacionalidad);


    while (true) {
    System.out.println("1. Solicitar un libro ");
    System.out.println("2. Estudiar en la biblioteca");
    
    System.out.print("Elija una opción del manu ");
    int opcion = scanner.nextInt();
    scanner.nextLine();

        switch (opcion) {
    case 1:
    System.out.print("Ingrese el nombre del libro que desea: ");
    String libro = scanner.nextLine();
    scanner.nextLine();
    lector.pideLibro(libro);
    break;
    case 2:
    lector.estudiar();
    break;
    default:
    System.out.println("Opción inválida.");
    }

    }

 }
}