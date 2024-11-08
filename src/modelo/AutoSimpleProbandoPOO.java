package modelo;

public class AutoSimpleProbandoPOO {
/*Crearás una clase Auto con los siguientes atributos: marca, modelo, color, velocidadMaxima.
Usted decide el tipo de dato que crea más conveniente. Agregará un cuarto atributo de tipo
booleano, de nombre encendido. Los atributos no deben ser accesibles desde otra clase.
Crearás los métodos de encendido del auto, apagado y acelerado del mismo. Debe evaluar que,
si el auto está apagado no pueda acelerar, si se encuentra encendido no se pueda encender otra
vez, si está apagado no se vuelva a apagar.
Deberás crear un menú́donde podrás elegir lo que quieras realizar. El menú no se detiene hasta
que usted decida salir. Para producir el objeto solicitarás que los datos sean ingresados desde
la consola. Una vez generado imprimirá los datos. */
	
	   private String marca;
	    private String modelo;
	    private String color;
	    private int velocidadMaxima;
	    private boolean encendido;
		/**
		 * @param marca
		 * @param modelo
		 * @param color
		 * @param velocidadMaxima
		 * @param encendido
		 */
		public AutoSimpleProbandoPOO(String marca, String modelo, String color, int velocidadMaxima, boolean encendido) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.color = color;
			this.velocidadMaxima = velocidadMaxima;
		    this.encendido = false; // Auto empieza apagado
		}
	    // Método para encender el auto
	    public void encender() {
	        if (encendido) {
	            System.out.println("No se puede realizar esta acción porque su auto ya se encuentra encendido.");
	        } else {
	            encendido = true;
	            System.out.println("Se ha encendido su auto.");
	        }
	    }
	    // Método para apagar el auto
	    public void apagar() {
	        if (!encendido) {
	            System.out.println("No se puede realizar esta acción porque su auto ya está apagado.");
	        } else {
	            encendido = false;
	            System.out.println("Se ha apagado su auto.");
	        }
	    }

	    // Método para acelerar el auto
	    public void acelerar() {
	        if (!encendido) { //si es diferente no, porque esta apagado
	            System.out.println("No puede acelerar porque su auto está apagado.");
	        } else {
	            System.out.println("Está acelerando su auto.");
	        }
	    }
	    //faltaria metodo para frenar. no lo pide el ejercicio no se hara.

	    // Método para imprimir los detalles del auto
	    public void mostrarDatos() {
	        System.out.println("Felicidades por su nuevo Auto [marca=" + marca + ", modelo=" + modelo + ", color=" + color +
	                ", velocidadMaxima=" + velocidadMaxima + ", encendido=" + encendido + "]");
	    }

}
