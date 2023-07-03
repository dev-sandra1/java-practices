public class Excercise3 {
    public static void main(String[] args) {
        /*Juan tiene un total de 100$ y va a una tienda a comprar 3 productos
         * los productos tienen el siguiente precio: P1 = 30$, P2 = 50$, P3 = 45$
         * Hacer un programa que condicione si Juan tiene el suficiente dinero para pagar,
         * si Juan tinen el suficiente dinero enviar un mensaje de exito, pero si no tiene el 
         * suficiente dinero mandar un mensaje de error 
          */

          int wallet = 100;
          int sabritas = 30;
          int jugo = 50;
          int pan = 10;

          int total = sabritas + jugo + pan;

          if (total <= wallet) {
            System.out.println("Juan, your purchase has been a success!!!");
         } else { 
            System.out.println( " no way Juan you lack money");
         }
    

        }
    
}
