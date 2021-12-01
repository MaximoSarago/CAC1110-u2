package mi8voproyect;
import java.util.Scanner;
/**
 *
 * @author Banghó
 */
public class Mi8voproyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        /**Crear un programa en java en el cual se pida al usuario ingresar su 
         * nombre, apellido, edad, hobbie, editor de código preferido, sistema 
         * operativo que utiliza, luego deberá mostrarse por consola los datos 
         * ingresados.
         */
        System.out.println("Indique su Nombre y Apellido:");
        String name = sc.nextLine();
        System.out.println("Indique su edad");
        String edad = sc.nextLine();
        System.out.println("Indique cual es su hobbie");
        String hobbie = sc.nextLine();
        System.out.println("Indique su editor preferido");
        String edipref = sc.nextLine();
        System.out.println("Por ultimo indique que sistema operativo usa");
        String sisop = sc.nextLine();
        System.out.println("Los datos inhresados por usted son: "+ "\n Nombre y "
                + "Apellido: "+name+"\n su edad es: "+edad +"\n indicó que su "
                        + "hobbie es: "+hobbie+" y que su editor preferido es: "
                +edipref+"\n y el sistema operativo que usa es: "+sisop );
    }
    
}
