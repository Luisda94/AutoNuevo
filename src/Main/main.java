package Main;

import java.util.Scanner;


import modelo.Auto;

public class main {

	   public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        // Crear objeto Auto
	        Auto auto = new Auto("Ferrari", "f80", "rojo", 450, false);
	     //   TelefonoMovil celular2 = new TelefonoMovil("Motorola","G54",3,"negro");
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