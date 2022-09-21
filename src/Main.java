import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);

        Library[] books;
        books = new Library[3];

        for(i = 0; i < 3; i++){
            int counter = i + 1;
            System.out.println("\n \n==============  Criando Livro  " + counter + " ==================== \n\n");

            System.out.println("Digite o nome do livro " + counter);
            String name = input.nextLine();

            System.out.println("Digite a quantidade de paginas do livro " + counter);
            int pages = Integer.parseInt(input.nextLine());

            System.out.println("Digite o nome do author " + counter);
            String author = input.nextLine();

            books[i] = new Library(name, pages, author);
        }


        for(i = 0; i < 3; i++){
            int counter = i + 1;

            System.out.println("\n \n==============  Livro  " + counter + " ==================== \n\n");
            System.out.println("Nome do livro " + books[i].getName());
            System.out.println("A quantidade de paginas do livro "  + books[i].getPages());
            System.out.println("O author do livro "  + books[i].getAuthor());
        }
    }
}