    import java.util.Scanner;
    public class Excercise4 {
        public static void main(String[] args) {


            /*Juan tiene un total de 100$ y va a una tienda a comprar 3 productos
             * los productos tienen el siguiente precio: P1 = 30$, P2 = 50$, P3 = 45$
             * Hacer un programa que condicione si Juan tiene el suficiente dinero para pagar,
             * si Juan tinen el suficiente dinero enviar un mensaje de exito, pero si no tiene el 
             * suficiente dinero mandar un mensaje de error 
              */
    
              Scanner scanner = new Scanner(System.in);
              boolean satisfactoryMony  = false;//creamos una variable de tipo boleano
             int wallet = 100;

             do {

                System.out.print("coloca sabrita: "); // pedimos los presios
                int sabrita =  scanner.nextInt();

                System.out.print("coloca jugo: ");
                int jugo =scanner.nextInt();

                System.out.print("coloca cereal: "); 
                 int cereal =scanner.nextInt();
                 
               int total= sabrita + jugo + cereal ;

              if ( total <= wallet ) {

                System.out.println("Juan, your purchase has been a success!!!");
                satisfactoryMony = true;

             } else { 
                System.out.println( " no way Juan you lack money");
             }
        
    
              }while( !satisfactoryMony ); // satisfactoryMony == false;
         }
    }
    


    /* pedir por consola el nombre de tu personaje de HxH favorito,
     * y saludarlo como la personalidad de personaje ingresado, -
     * ni no es un personaje especial enviaras un saludo por defecto
     */