/**
 * this class is for testing the previous classes
 */
public class Test extends Library{


    public static void main(String[] args) {

        //the books that needed to be added

        Books a=new Books();
        a.setBookTitle("The DaVinci Code");
        Books b=new Books();
        b.setBookTitle("Le Petit Prince");
        Books c=new Books();
        c.setBookTitle("A Tale of Two Cities");
        Books d=new Books();
        d.setBookTitle("The Lord of The Rings");

        //null object, because putting a nothing in the array list created an error in the methods in books.

        Books e=new Books();

        //creating the libraries.

        Library queen = new Library();
        queen.setLibraryName("Lennoxville Library");
        queen.setLibraryAddress("120 Queen St.");

        Library collage = new Library();
        collage.setLibraryName("Collage Library");
        collage.setLibraryAddress("228 College St.");

        //adding the books to the array list

        queen.addBooks(a);
        queen.addBooks(b);
        queen.addBooks(c);
        queen.addBooks(d);

        collage.addBooks(e); //add the null object as empty library


        //printing the open hours

        System.out.println();
        queen.printHours();
        System.out.println("********************");
        collage.printHours();
        System.out.println("");
        System.out.println("");

        // printing available books

        queen.availableBooks();
        System.out.println();

        // borrow lord of the ring

        queen.borrowBook(d);
        System.out.println("");

        queen.borrowBook(d);
        System.out.println("");

        collage.borrowBook(d);
        System.out.println("");

        //print available books

        queen.availableBooks();
        System.out.println("");

        collage.availableBooks();
        System.out.println("");

        //return lord of the rings

        queen.returnBook(d);
        System.out.println("");

        queen.borrowBook(d);
        System.out.println("");

        queen.availableBooks();

        //one problem: for some reason the program does not show Lord of the rings even though the value of borrow is false
        // I couldn't solve that problem
    }
}
