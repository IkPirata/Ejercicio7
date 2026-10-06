import java.util.Scanner;
public class Ejercicio7 {
    public static void  main(String[]args) {
        Scanner input = new Scanner(System.in);

        final char[] LETRAS = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int DNI;

        System.out.println("Introduce los números de tu DNI: ");
        DNI = input.nextInt();
        System.out.println(LETRAS[DNI % 23]);

    }
}
