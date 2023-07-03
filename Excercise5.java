import java.util.Scanner;

public class Excercise5 {
    public static void main(String[] args) {
        
        Scanner entry = new Scanner(System.in);

        System.out.println("ingre  la primera palabra: ");
        String firstWord = entry.nextLine();


        if(firstWord.equals("hola")){
            System.out.println("primer saludo");
            
        }else if(firstWord.equals("adios")){
            System.out.println("segundo saludo");
        }else{
            System.out.println("saludo por defecto");
        }



    }
}
