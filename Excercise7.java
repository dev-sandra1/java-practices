public class Excercise7 {
    public static void main(String[] args) {
        
        int dia = 7;
        String NombreDia;
        
        switch (dia) {
            
            case 1: NombreDia ="lunes";
            break;

            case 2: NombreDia ="martes";
            break;

            case 3: NombreDia ="miercoles";
            break;

            case 4: NombreDia ="jueves";
            break;

            case 5: NombreDia ="viernes";
            break;

            case 6: NombreDia ="sabado 2";
            break;

            case 7: NombreDia ="domingo";
            break;

           default : NombreDia = "numerode dia invalido";

        }

        System.out.println(" el dia de la semana seleccionado es: " + NombreDia);


    }
}       
