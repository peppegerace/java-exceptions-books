package org.experis.library;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner scan = new Scanner(System.in);

        // chiedo all'utente quanti libri vuole aggiungere
        System.out.print("Quanti libri vuoi caricare nella libreria? ");
        int numberBooks = Integer.parseInt(scan.nextLine());

        // creo un array per memorizzare i libri
        Book[] books = new Book[numberBooks];

        // ciclo per chiedere all'utente di inserire i dati per ciascun libro
        for (int i = 0; i < books.length; i++) {
            System.out.print("Inserisci il titolo: ");
            String title = scan.nextLine();
            System.out.print("Inserisci il numero di pagine: ");
            int numberPages = Integer.parseInt(scan.nextLine());

            System.out.print("Inserisci l'autore: ");
            String author = scan.nextLine();

            System.out.print("Inserisci l'editore: ");
            String publisher = scan.nextLine();

            // creo un nuovo libro
            Book book = new Book(title, numberPages, author, publisher);

            // aggiungo il libro creato all'array
            books[i] = book;
        }

        // stampo l'array
        for (Book book : books) {
            System.out.println(book.getInfoBook());
        }

        scan.close();
    }
}
