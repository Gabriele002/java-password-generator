package org.lessons.java.security;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


       /*  Versione base
       System.out.println("Inserisci il tuo Nome");
        String userName = scan.nextLine();

        System.out.println("Inserisci il tuo Cognome");
        String userSurname = scan.nextLine();

        System.out.println("Inserisci il tuo colore preferito");
        String userPreferiteColor = scan.nextLine();

        System.out.println("Inserisci il tuo giorno di nascita");
        int userDayOfBirth = scan.nextInt();

        System.out.println("Inserisci il tuo mese di nascita");
        int userMounthOfBirth = scan.nextInt();

        System.out.println("Inserisci il tuo anno di nascita");
        int userYearOfBirth = scan.nextInt();

        int sommaMounthDayYearOfBirth = userYearOfBirth + userMounthOfBirth + userDayOfBirth;
        String pswGenerator = userName + "-"+ userSurname+"-"+userPreferiteColor+"-"+ sommaMounthDayYearOfBirth;
        System.out.println("La tua nuova psw è:");
        System.out.println(pswGenerator);
        */

        // Versione plus plus ultra usando cose non viste ma così è più bello
        System.out.println("Inserisci il tuo Nome");
        String userName = scan.nextLine();

        System.out.println("Inserisci il tuo Cognome");
        String userSurname = scan.nextLine();

        System.out.println("Inserisci il tuo colore preferito");
        String userPreferiteColor = scan.nextLine();


            System.out.println("Metti la tua data di nascita in questo formato dd/MM/yyyy:");
            String birthDateInput = scan.nextLine();

            String[] birthDateParts = birthDateInput.split("/");

            int day = Integer.parseInt(birthDateParts[0]);
            int month = Integer.parseInt(birthDateParts[1]);
            int year = Integer.parseInt(birthDateParts[2]);

            int sum = day + month + year;
            String pswGenerator = userName + "-"+ userSurname+"-"+userPreferiteColor+"-"+ sum;
            System.out.println(pswGenerator);

    }
}
