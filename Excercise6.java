import java.util.Scanner;

public class Excercise6 {
    public static void main(String[] args) {
        
        Scanner entry = new Scanner(System.in);

        System.out.println("Type your favorite character: ");
        String character = entry.nextLine();

        if(character.equals("Gon")){
            System.out.println("Hello best friend!!!");
            
        }else if(character.equals("Killua")){
            System.out.println(" :3");

        } else if ( character.equals( "Hisoka")){
            System.out.println("Hello, how much time without see :] ");

        }else{
            System.out.println("you don't be fan to hxh");
        }

      
    }
}
