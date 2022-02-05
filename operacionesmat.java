package Menu;
import java.util.Scanner;
public class operacionesmat {

    static Scanner scanner =new Scanner(System.in);
    
    public static void main(String[] args) {

        int opcion = 0;

        do 
        {
            System.out.println("\n---BIENVENIDO A LAS OPERACIONES MATEMÁTICAS BÁSICAS ---\n");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
        
            System.out.println("Por favor digite la opcion");
            opcion=scanner.nextInt();

        
        
          switch(opcion){
            case 1: 
                suma(); 
                break; 
           
            case 2: 
                resta(); 
                break; 

            case 3:
                multiplicacion();
                break; 
                
            case 4: 
                division();
                break; 
                
            case 5:
                break; 
                default: 
                System.out.println("Opcion Invalida");
                
                
            } 



        } while (opcion !=5);
        
        System.out.println("\nEL PROGRAMA HA FINALIZADO");

    }

      static void suma (){
        System.out.println("OPERACION DE SUMA");
        System.out.println("Digite el sumando 1: ");
        int numero1=scanner.nextInt();
        System.out.println("Digite el sumando 2: "); 
        int numero2=scanner.nextInt(); 
        int resultado=numero1+numero2;
        System.out.println("El resultado es "+ resultado);
        }

      static void resta (){
          System.out.println("OPERACION DE RESTA");
          System.out.println("Digite el minuendo:");
          int numero1=scanner.nextInt();
          System.out.println("Digite el sustraendo: "); 
          int numero2=scanner.nextInt(); 
          int resultado=numero1-numero2;
          System.out.println("El resultado es "+ resultado);
        }

        static void multiplicacion(){
            System.out.println("OPERACION DE MULTIPLICACIÓN");
            System.out.println("Digite el multiplicando: ");
            int numero1=scanner.nextInt();
            System.out.println("Digite el multiplicador: "); 
            int numero2=scanner.nextInt(); 
            int resultado=numero1*numero2;
            System.out.println("El resultado es "+ resultado); 
        }

        static void division(){
            System.out.println("OPERACION DE DIVISIÓN");
            System.out.println("Digite el dividendo: ");
            int numero1=scanner.nextInt();
            System.out.println("Digite el divisor: "); 
            int numero2=scanner.nextInt(); 
            int resultado=numero1/numero2;
            System.out.println("El resultado es "+ resultado);

        }
}
