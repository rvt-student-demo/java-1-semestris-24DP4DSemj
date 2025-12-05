package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {

    static class Book {
        private String title;
        private String pages;
        private String publicationYear;

        public Book(String title, String pages, String publicationYear) {
            this.title = title;
            this.pages = pages;
            this.publicationYear = publicationYear;
        }

        public String getTitle() {
            return title;
        }

        public String getPages() {
            return pages;
        }

        public String getPublicationYear() {
            return publicationYear;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            String pageCount = scanner.nextLine();

            System.out.print("Publication Year: ");
            String publicationYear = scanner.nextLine();

            books.add(new Book(title, pageCount, publicationYear));
        }

        System.out.print("Which info to display? (title/author/year/everything): ");
        String infoType = scanner.nextLine().toLowerCase();

        if ("title".equals(infoType)) {
            for (Book b : books) {
                System.out.println(b.getTitle());
            }
        } else if ("author".equals(infoType)) {
            for (Book b : books) {
                System.out.println(b.getPages() + " pages");
            }
        } else if ("year".equals(infoType)) {
            for (Book b : books) {
                System.out.println(b.getPublicationYear());
            }
        } else if ("everything".equals(infoType)) {
            for (Book b : books) {
                System.out.println(b.getTitle() + ", " + b.getPages() + " pages" + ", " + b.getPublicationYear());
            }
        }

        scanner.close();
    }

}