import java.lang.reflect.Array;

public class Library {
    private String name;
    private int pages;
    private String author;

    public void setName(String name){
        this.name = name;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getName(){
        return this.name;
    }

    public int getPages() {
        return this.pages;
    }

    public String getAuthor() {
        return this.author;
    }

    public Library(String name, int pages,String author) {
        setName(name);
        setPages(pages);
        setAuthor(author);

        System.out.println("\n\nLivro criado com sucesso!\n\n");
    }
}
