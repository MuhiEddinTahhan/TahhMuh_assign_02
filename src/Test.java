import java.util.ArrayList;

public class Test extends Library{


    public static void main(String[] args) {

        //the books that needed to be added
        Books a=new Books();
        a.setBookTitle("The DaVinci Code");
        Books b=new Books();
        a.setBookTitle("Le Petit Prince");
        Books c=new Books();
        a.setBookTitle("A Tale of Two Cities");
        Books d=new Books();
        a.setBookTitle("The Lord of The Rings");

        //creating the libraries
        Library queen = new Library();
        queen.setLibraryName("Lennoxville Library");
        queen.setLibraryAddress("120 Queen St.");

        Library collage = new Library();
        collage.setLibraryName("Collage Library");
        collage.setLibraryAddress("228 College St.");

        //adding the books to the array list

        ArrayList<Books> queenCollection=new ArrayList<Books>();
        ArrayList<Books> collageCollection=new ArrayList<Books>();

        queenCollection.add(a);
        queenCollection.add(b);
        queenCollection.add(c);
        queenCollection.add(d);


        //printing the open hours
        queen.printHours();
        System.out.println("********************");
        collage.printHours();

        // borrow lord of the ring

        queen.borrowBook(queenCollection,d);
        queen.borrowBook(queenCollection,d);
        collage.borrowBook(collageCollection,d);

        //print available books

        queen.availableBooks(queenCollection);
        collage.availableBooks(collageCollection);

        //return lord of the rings

        queen.returnBook(d);
        queen.availableBooks(queenCollection);
    }
}
