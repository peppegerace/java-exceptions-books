package org.experis.library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // chiedo all'utente quanti libri vuole aggiungere
        System.out.print("Quanti libri vuoi caricare nella libreria? ");
        int numberBooks = Integer.parseInt(scan.nextLine());

        // creo un array per memorizzare i libri
        Book[] books = new Book[numberBooks];

        // ciclo per chiedere all'utente di inserire i dati per ciascun libro
        for (int i = 0; i < books.length; i++) {

            books[i] = createBook(scan);
        }
        scan.close();

        // stampo in video i dati inseriti
        for (Book book : books) {
            System.out.println(book.getInfoBook());
        }
    }

    private static Book createBook(Scanner scan) {
        Book book = null;

        do {
            try {
                System.out.print("Inserisci il titolo: ");
                String title = scan.nextLine();

                System.out.print("Inserisci il numero di pagine: ");
                int numberPages = Integer.parseInt(scan.nextLine());

                System.out.print("Inserisci l'autore: ");
                String author = scan.nextLine();

                System.out.print("Inserisci l'editore: ");
                String publisher = scan.nextLine();
                book = new Book(title, numberPages, author, publisher);
            } catch (NumberFormatException e) {
                System.out.println("Numero non valido");
            } catch (IllegalArgumentException exc) {
                System.out.println("Dato non valido");
            }
            } while (book == null);
            return book;
        }
    }