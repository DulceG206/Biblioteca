import java.util.Scanner;
import java.util.function.IntConsumer;
public class Main {
public static void main(String[] args) {

    Lector lector;

    Scanner scanner = new Scanner(System.in);
  
    BibliotecaController bibliotecaController = new BibliotecaController();

    while (true) {
    System.out.println("1. Registrar Lector");
    System.out.println("2. Registrar bibliotecaria");
    System.out.println("3. Pedir Enciclopedia");
    System.out.println("4. Pedir periódico");
    System.out.println("5. Salir de la biblioteca");

    System.out.print("Elija una opción del menu ");
    int opcion = scanner.nextInt();
    scanner.nextLine();

        switch (opcion) {

    case 0: 
    System.out.print("Ingrese el sexo del lector: ");
    String sexo = scanner.nextLine();
    System.out.print("Ingrese la nacionalidad del lector: ");
    String nacionalidad = scanner.nextLine();
    bibliotecaController.crearLector(sexo, nacionalidad);

    case 1:
    System.out.print("Ingrese el nombre de la bibliotecaria: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese el turno de la bibliotecaria: ");
    String turno = scanner.nextLine();
    System.out.print("Ingrese la edad de la bibliotecaria: ");
    String edad = scanner.nextLine();
    scanner.nextLine();
    bibliotecaController.crearBibliotecaria(nombre, turno, edad);
    break;
    case 2:
    System.out.print("Ingrese el nombre de enciclopedia que desea: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese el genero de la enciclopedia: ");
    String genero = scanner.nextLine();
    System.out.print("Ingrese el año de publicación de la enciclopedia: ");
    int ano = scanner.nextInt();
    scanner.nextLine();
    bibliotecaController.pedirEnciclopedia(nombre, genero, ano);
    System.out.print(pedirEnciclopedia); 
    break;

    case 3:
    System.out.print("Ingrese la editorial del periódico que desea: ");
    String editorial = scanner.nextLine();
    System.out.print("Ingrese la fecha de publicación del periódico: ");
    int fecha = scanner.nextInt();
    scanner.nextLine();
    bibliotecaController.pedirPeriodico(editorial, fecha);
    System.out.print(pedirPeriodico);
    break;

    case 4:
    System.out.print("Ingrese nombre del libro que desea: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese el nombre del autor del libro: ");
    String autor = scanner.nextLine();
    System.out.print("Ingrese la edición del libro: ");
    int edicion = scanner.nextInt();
    scanner.nextLine();
    bibliotecaController.pedirPeriodico(editorial, fecha);
    System.out.print(pedirLibro);
    break;
    default:
    System.out.println("Opción inválida.");
    }

    }

 }
}