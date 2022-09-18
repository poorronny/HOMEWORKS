import homework_1_9.Author;
import homework_1_9.Books;

import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {
            var author1 = new Author("George", "Orwell");
            var author2 = new Author("Aldous", "Huxley");
            var book1 = new Books("1984", author1, 1949);
            var book2 = new Books("Brave New World", author2, 1932);

            System.out.println(book1);
            System.out.println(book2);

            book1.setYearPublication(LocalDate.now().getYear());
            System.out.println(book1);

        }
    }