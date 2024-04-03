package org.experis.library;

public class Book {
    // ATTRIBUTI
    private String title;
    private int numberPages;
    private String author;
    private String publisher;

    // COSTRUTTORE
    public Book(String title, int numberPages,String author, String publisher) throws IllegalAccessException {
//        this.title = title;
//        this.numberPages = numberPages;
//        this.author = author;
//        this.publisher = publisher;
        if (title != null || title.isEmpty()){
            throw new IllegalAccessException("Il titolo è un campo obbligatorio");
        }
        if (numberPages <= 0) {
            throw new IllegalAccessException("Il libro deve avere almeno una pagina");
        }
        if (author != null || title.isEmpty()) {
            throw new IllegalAccessException("Il libro deve avere un autore");
        }
        if (publisher != null || publisher.isEmpty()) {
            throw new IllegalAccessException("Il libro deve avere un editore");
        }
    }

    // GETTER and SETTER
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) throws IllegalAccessException {
        if (title != null || title.isEmpty()){
            throw new IllegalAccessException("Il titolo è un campo obbligatorio");
        }
        this.title = title;
    }
    public int getNumberPages() {
        return numberPages;
    }
    public void setNumberPages(int numberPages) throws IllegalAccessException {
        if (numberPages <= 0) {
            throw new IllegalAccessException("Il libro deve avere almeno una pagina");
        }
        this.numberPages = numberPages;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) throws IllegalAccessException {
        if (author != null || title.isEmpty()) {
            throw new IllegalAccessException("Il libro deve avere un autore");
        }
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher() throws IllegalAccessException {
        if (publisher != null || publisher.isEmpty()) {
            throw new IllegalAccessException("Il libro deve avere un editore");
        }
        this.publisher = publisher;
    }

    // METODI
    @Override
    public String toString() {
        return "Titolo: " + title + " || Numero pagine: " + numberPages + " || Autore: " + author + " || Editore: " + publisher;
    }
}
