package homework_1_9;

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
    public String toString() {
        return "Книга называется - " + name + ". " + author + ". " + "Год публикации: " + yearPublication + ".";
    }
}
