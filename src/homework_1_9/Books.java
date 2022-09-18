package homework_1_9;

import java.util.Objects;

public class Books {
    private final String name;
    private final Author author;
    private Integer yearPublication;


    public Books(String name, Author author, Integer yearPublication) {
        this.name = name;
        this.author = author;
        this.yearPublication = yearPublication;
    }


    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public Integer getYearPublication(){
        return yearPublication;
    }

    public void setYearPublication(Integer yearPublication) {
       this.yearPublication = yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return name.equals(books.name) && author.equals(books.author) && yearPublication.equals(books.yearPublication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearPublication);
    }

    @Override
    public String toString() {
        return "Книга называется - " + name + ". " + author + ". " + "Год публикации: " + yearPublication + ".";
    }

}
