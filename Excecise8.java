import java.util.Scanner;

public class Excecise8 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        double salary = 0; 
        int categoria;

        System.out.println("enter the type of category you want to calculate the salary: ");
        categoria = entry.nextInt();

            if (categoria == 1) {

                salary = 15890 + (15890 + 0.10);
                
            }else if(categoria == 2){

                salary = 25630.89;

            }else if(categoria == 3){

                salary = 35560.20 - (35560.20 * 0.11);

            }else{
                System.out.println("You must enter a valid category number");
            }

            System.out.println("the total salary for the selected category " 
            + categoria + " is equal to: " + salary);


    }
}
