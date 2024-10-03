// Se importan als utilidades
import java.util.HashMap;
import java.util.Scanner;

/* El siguiente código genera un HashMap en donde se contiene como llave los nombres de países y como valores sus respectivas
   capitales, posteriormente dentro de un ciclo de while se le solicita al usuario ingresar el nombre de un país, si el país 
   se encuentra en la lista entonces despliega en la consola el nombre del país y su capital. Si el país no existe dentro del HashMap
   se le solicita al usuario que ingrese la capital del país para agregarla al HashMap en conjunto con el nombre del país como llava.
   Si el usuaruio escribe "salir" como entrada, entonces el programa termina su ejecución 
   */
public class Codigo7 {

	public static void main(String[] args) {
		// Se agrega la entrada estándar al scanner
		Scanner s = new Scanner(System.in);

		// Se actualiza el nombre de la variable de ca a capitales
		// Se cambian los tipos de dato del HashMap a String
	    HashMap<String, String> capitales = new HashMap<>();

	    // Se agrega capital de El Salvador y se actualiza capital de México y se corrige el
	    // nombre de la capitan de Canadá de Otawwa a Ottawa
	    capitales.put("Canadá", "Ottawa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "Ciudad de México");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    capitales.put("El Salvador","San Salvador");
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	   
	    // Se corrige el tipo de dato
	    String c = "";
	    do {
    	  // Se cambia in por out
	      System.out.print("Escribe el nombre de un país y te diré su capital: ");
	      
	      // Se cambia el método de lectura del scanner s y se quita el tipo de dato de c para no re declarar la variable
	      c = s.nextLine();
	      // Se actualiza la palabra equal a equals
	      if (!c.equals("salir")) {
	    	  // Se actualizan las referencias de la variable ca a capitales
	    	  // Se cambia el método containsValue a containsKey ya que el nombre del país es una clave 
	        if (capitales.containsKey(c)) {
	          System.out.print("La capital de " + c);
	          // Se cambia del método put al método get
	          System.out.println(" es " + capitales.get(c));
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String ca = s.nextLine();
	          capitales.put(c, ca);
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	      // Se completa la palabra while y se agrega paréntesis al final 
	    } while (!c.equals("salir"));
	    
	    // Se cierra el Scanner
	    s.close();
	  }
	}    
