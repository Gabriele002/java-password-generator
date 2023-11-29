package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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

        scan.close();

    }
}
