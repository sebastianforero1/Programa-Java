import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Programa {

    public static void main(String[] args) throws Exception {                           //Inicio

        Scanner user = new Scanner(System.in);
        String name;
        int eleccion1 = 0;

        System.out.println("           __");
        System.out.println("          /\\ \\");
        System.out.println("         / /\\ \\       Hola");
        System.out.println("        / /__\\ \\      ¿Como te llamas?");
        System.out.println("        \\/____\\/");
        System.out.println("");
        name = user.nextLine();

        try {
            eleccion1 = menu(name);
            queHacer(eleccion1, name);
        } catch (Exception InputMismatchException) {
            System.out.println("           __");
            System.out.println("          /\\ \\");
            System.out.println("         / /\\ \\        Las opciones son numeros");
            System.out.println("        / /__\\ \\");
            System.out.println("        \\/____\\/");
            System.out.println("");
            otraVez(name);
        }

    }

    static int menu(String name){                                                       //Menu
        System.out.println("");
        int option;
        Scanner user = new Scanner(System.in);

        System.out.println("           __");
        System.out.println("          /\\ \\");
        System.out.println("         / /\\ \\       ¡Excelente! " + name + ", ¿Que quieres hacer?");
        System.out.println("        / /__\\ \\");
        System.out.println("        \\/____\\/");
        System.out.println("");

        System.out.println("    __| |____________________________________________| |__");
        System.out.println("    (__   ____________________________________________   __)");
        System.out.println("      | |                                            | |");
        System.out.println("      | |   1. Saber mi signo zodiacal                 | |");
        System.out.println("      | |   2. Saber cuantos dias he vivido         | |");
        System.out.println("      | |   3. Saber mi edad en años perro           | |");
        System.out.println("      | |   4. Saber mi numero segun la numerologia  | |");
        System.out.println("     _| |____________________________________________| |__");
        System.out.println("    (__   ____________________________________________   __)");
        System.out.println("       | |                                            | |");
        System.out.println("");
        option = user.nextInt();

        return option;
    }

    static void queHacer(int eleccion, String name){                              //Dice Que Hacer Al Programa
        if(eleccion == 1){
            String sZodiacal ="";
            try {
                sZodiacal = zodiaco(name);
            } catch (Exception InputMismatchException) {
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Recuerda que los datos son en numeros");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
            System.out.println("           __");
            System.out.println("          /\\ \\");
            System.out.println("         / /\\ \\       Mi signo zodiacal es: " + sZodiacal);
            System.out.println("        / /__\\ \\");
            System.out.println("        \\/____\\/");
            System.out.println("");
        }else if(eleccion == 2){
            int dVividos = dias();
            System.out.println("           __");
            System.out.println("          /\\ \\");
            System.out.println("         / /\\ \\       Yo he vivido: " + dVividos + " dias");
            System.out.println("        / /__\\ \\");
            System.out.println("        \\/____\\/");
            System.out.println("");
        }else if(eleccion == 3){
            float aPerro = añosPerros();
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println("           __");
            System.out.println("          /\\ \\");
            System.out.println("         / /\\ \\       Yo tengo " + df.format(aPerro) + " años perro");
            System.out.println("        / /__\\ \\");
            System.out.println("        \\/____\\/");
            System.out.println("");
        }
        else if(eleccion == 4){
            int nNum = numeroLogia(name);
            System.out.println("           __");
            System.out.println("          /\\ \\");
            System.out.println("         / /\\ \\       Mi numero segun la numerologia es: " + nNum );
            System.out.println("        / /__\\ \\");
            System.out.println("        \\/____\\/");
            System.out.println("");
        }else{
            System.out.println("           __");
            System.out.println("          /\\ \\");
            System.out.println("         / /\\ \\       Mi Numero ingresado no es una opcion valida");
            System.out.println("        / /__\\ \\");
            System.out.println("        \\/____\\/");
            System.out.println("");

            otraVez(name);
        }
        algoMas(name);
    }

    static String zodiaco(String name) {                                                           //Signo Zodiacal
        System.out.println("");
        Scanner user = new Scanner(System.in);
        int mes;
        int dia;
        String signo = "";

        System.out.println("           __");
        System.out.println("          /\\ \\");
        System.out.println("         / /\\ \\       Es necesario:");
        System.out.println("        / /__\\ \\");
        System.out.println("        \\/____\\/");
        System.out.println("");

        System.out.println("     .-^-.");
        System.out.println("    '\"'|`\"` Mi mes de nacimiento: ");
        System.out.println("       j");
        System.out.println("");
        mes = user.nextInt();
        System.out.println("");

        System.out.println("     .-^-.");
        System.out.println("    '\"'|`\"` Mi dia de nacimiento: ");
        System.out.println("       j");
        System.out.println("");
        dia = user.nextInt();
        System.out.println("");

        if(mes == 1){
            if(dia <= 20){
                signo = "Capricornio";
            }else if(dia <=31){
                signo = "Acuario";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Enero solo tiene 31 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else if(mes == 2){
            if(dia > 29){
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Febrero solo tiene maximo 29 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }else if(dia <= 19){
                signo = "Acuario";
            }else{
                signo = "Piscis";
            }
        }else if(mes == 3){
            if(dia <= 20){
                signo = "Piscis";
            }else if (dia <= 31){
                signo = "Aries";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Marzo solo tiene 31 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else if(mes == 4){
            if(dia <= 20){
                signo = "Aries";
            }else if(dia <= 30) {
                signo = "Tauro";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Abril solo tiene 30 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else if(mes == 5){
            if(dia <= 21){
                signo = "Tauro";
            }else if(dia <= 31){
                signo = "Geminis";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Mayo solo tiene 31 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else if(mes == 6){
            if(dia <= 21){
                signo = "Geminis";
            }else if(dia <= 30){
                signo = "Cancer";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Junio solo tiene 30 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else if(mes == 7){
            if(dia <= 22){
                signo = "Cancer";
            }else if(dia <= 31){
                signo = "Leo";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Julio solo tiene 31 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else if(mes == 8){
            if(dia <= 23){
                signo = "Leo";
            }else if(dia <= 31){
                signo = "Virgo";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Agosto solo tiene 31 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else if(mes == 9){
            if(dia <= 23){
                signo = "Virgo";
            }else if(dia <= 30){
                signo = "Libra";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Septiembre solo tiene 30 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else if(mes == 10){
            if(dia <= 23){
                signo = "Libra";
            }else if(dia <= 31){
                signo = "Scorpio";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Octubre solo tiene 31 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else if(mes == 11){
            if(dia <= 22){
                signo = "Scorpio";
            }else if(dia <= 30){
                signo = "Sagitario";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Noviembre solo tiene 30 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else if(mes == 12){
            if(dia <= 21){
                signo = "Sagitario";
            }else if(dia <= 31){
                signo = "Capricornio";
            }else{
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Diciembre solo tiene 31 dias");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else{
            System.out.println("           __");
            System.out.println("          /\\ \\");
            System.out.println("         / /\\ \\       Solo hay 12 meses y por lo tanto van del 1 al 12");
            System.out.println("        / /__\\ \\");
            System.out.println("        \\/____\\/");
            System.out.println("");
            if(dia > 31){
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Todos los meses tienen alrededor de 30 o 31 dias menos febrero");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
            }
            otraVez(name);
        }

        return signo;
    }

    static int dias(){                                                                             //Dias vividos

        int dia;
        int mes;
        int año;
        int vivido = 0;

        System.out.println("");
        Scanner user = new Scanner(System.in);
        System.out.println("           __");
        System.out.println("          /\\ \\");
        System.out.println("         / /\\ \\       Para eso es necesario:");
        System.out.println("        / /__\\ \\");
        System.out.println("        \\/____\\/");
        System.out.println("");

        System.out.println("     .-^-.");
        System.out.println("    '\"'|`\"` Mi año de nacimiento: ");
        System.out.println("       j");
        System.out.println("");
        año = user.nextInt();
        System.out.println("");

        Calendar fecha = new GregorianCalendar();
        mes = fecha.get(Calendar.MONTH);
        dia = fecha.get(Calendar.DATE);

        vivido = (((2021-año)*365) + ((mes+1)*30) + dia);
        if(vivido < 0){
            System.out.println("           __");
            System.out.println("          /\\ \\");
            System.out.println("         / /\\ \\       No has nacido jeje");
            System.out.println("        / /__\\ \\");
            System.out.println("        \\/____\\/");
            System.out.println("");
        }
       return vivido;

    }

    static float añosPerros(){                                                                   //Edad en años perro
        float diasP = 0;
        float edad;

        System.out.println("");
        Scanner user = new Scanner(System.in);
        System.out.println("           __");
        System.out.println("          /\\ \\");
        System.out.println("         / /\\ \\       Para esto es necesario:");
        System.out.println("        / /__\\ \\");
        System.out.println("        \\/____\\/");
        System.out.println("");

        System.out.println("     .-^-.");
        System.out.println("    '\"'|`\"` Mi edad: ");
        System.out.println("       j");
        System.out.println("");
        edad = user.nextFloat();
        System.out.println("");

        diasP = edad/7;

       return diasP;
    }

    static int numeroLogia(String name){                                                //calcula el numero - numerologia
        int numero = 0;
        int numeroP;
        int dNac;

        System.out.println("");
        Scanner user = new Scanner(System.in);
        System.out.println("           __");
        System.out.println("          /\\ \\");
        System.out.println("         / /\\ \\       Para esto es necesario:");
        System.out.println("        / /__\\ \\");
        System.out.println("        \\/____\\/");
        System.out.println("");

        System.out.println("     .-^-.");
        System.out.println("    '\"'|`\"` Mi dia de nacimiento: ");
        System.out.println("       j");
        System.out.println("");
        dNac = user.nextInt();
        System.out.println("");

        if(dNac <= 31){
            numeroP = (dNac%10) + (dNac/10);
            numero = (numeroP%10) + (numeroP/10);
        }else{
            System.out.println("Nota: Los meses solo tienen maximo 31 dias");
            otraVez(name);
        }

        return numero;
    }

    static void otraVez(String name){                                                        //Reiniciar sin salir
        System.out.println("");
        Scanner user = new Scanner(System.in);

        System.out.println("           __");
        System.out.println("          /\\ \\");
        System.out.println("         / /\\ \\       ¿Deseas intentarlo otra vez?");
        System.out.println("        / /__\\ \\");
        System.out.println("        \\/____\\/");
        System.out.println("");
        System.out.println("a. Si");
        System.out.println("b. No");
        String quiero = user.nextLine();

        if(quiero.equals("a")){
            try {
                int eleccion = menu(name);
                queHacer(eleccion, name);
            } catch (Exception InputMismatchException) {
                System.out.println("           __");
                System.out.println("          /\\ \\");
                System.out.println("         / /\\ \\       Las opciones son numeros");
                System.out.println("        / /__\\ \\");
                System.out.println("        \\/____\\/");
                System.out.println("");
                otraVez(name);
            }
        }else{
            System.out.println("           __");
            System.out.println("          /\\ \\");
            System.out.println("         / /\\ \\       ¡Muchas gracias por su tiempo!");
            System.out.println("        / /__\\ \\");
            System.out.println("        \\/____\\/");
            System.out.println("");
            System.exit(0);
        }

    }

    static void algoMas(String name){                                                   //pregunta si quiere salir

        System.out.println("");
        Scanner user = new Scanner(System.in);

        System.out.println("           __");
        System.out.println("          /\\ \\");
        System.out.println("         / /\\ \\       ¿Desea hacer algo mas?");
        System.out.println("        / /__\\ \\");
        System.out.println("        \\/____\\/");
        System.out.println("");
        System.out.println("a. Si");
        System.out.println("b. No");
        String mas = user.nextLine();

        if(mas.equals("a")){
            int eleccion = menu(name);
            queHacer(eleccion, name);
        }else{
            System.out.println("           __");
            System.out.println("          /\\ \\");
            System.out.println("         / /\\ \\       ¡Muchas gracias por su tiempo!");
            System.out.println("        / /__\\ \\");
            System.out.println("        \\/____\\/");
            System.out.println("");
            System.exit(0);
        }
    }

}