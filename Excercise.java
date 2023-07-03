public class Excercise {
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 20;
        int aux;

        System.out.println("----before----");
        System.out.println(" num1:" + num1);
        System.out.println(" num2:" + num2);

        aux = num2; // 20
        num2 = num1; // 10
        num1 = aux; // 20 

        System.out.println("----after----");
        System.out.println(" num1:" + num1);
        System.out.println(" num2:" + num2);


    }
    
}
