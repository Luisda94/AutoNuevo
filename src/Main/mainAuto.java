package Main;
import java.util.Scanner;
import modelo.AutoSimpleProbandoPOO;
public class mainAuto {

	public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los datos del auto desde la consola en el mismo orden que fueron declarados en el modelo.
        System.out.println("Ingrese la marca del auto:");
        String marca = scanner.nextLine();

        System.out.println("Ingrese el modelo del auto:");
        String modelo = scanner.nextLine();

        System.out.println("Ingrese el color del auto:");
        String color = scanner.nextLine();

        System.out.println("Ingrese la velocidad máxima del auto:");
        int velocidadMaxima = scanner.nextInt();

        // Crear objeto Auto
        AutoSimpleProbandoPOO auto = new AutoSimpleProbandoPOO(marca, modelo, color, velocidadMaxima, false);
	
	        // Mostrar detalles del auto
	        auto.mostrarDatos();

	        // Menú para interactuar con el auto
	        int opcion;
	        do {
	            System.out.println("\nSeleccione qué desea hacer");
	            System.out.println("1- Encender auto");
	            System.out.println("2- Apagar auto");
	            System.out.println("3- Acelerar auto");
	            System.out.println("4- Salir");
	            opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                    auto.encender();
	                    break;
	                case 2:
	                    auto.apagar();
	                    break;
	                case 3:
	                    auto.acelerar();
	                    break;
	                case 4:
	                    System.out.println("Saliendo del menú.");
	                    break;
	                default:
	                    System.out.println("Opción no válida.");
	                    break;
	            }
	        } while (opcion != 4);

	        scanner.close();
	   }
}