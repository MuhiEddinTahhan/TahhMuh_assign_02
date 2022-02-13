import java.util.ArrayList;


/**
 * this class is a subclass to books, it has array list of books objects, library address, name, opening and closing hours
 */
public class Library extends Books {

    ArrayList<Books> booksCollection = new ArrayList<Books>();
    private String libraryName;
    private String libraryAddress;
    private final String openHour="9 AM";
    private final String closeHour="5 PM";

    /**
     * constructor to get the open hours
     * @return
     */
    public String getOpenHour(){
        return openHour;
    }
    /**
     * constructor to get the close hours
     * @return
     */
    public String getCloseHour(){
        return closeHour;
    }

    /**
     * method to set a name for the Library
     * @param libraryName
     */
    public void setLibraryName(String libraryName){
        this.libraryName=libraryName;
    }

    /**
     * method to get the name of the library
     * @return
     */
    public String getLibraryName() {
        return libraryName;
    }

    /**
     * method to set the address of the library
     * @param libraryAddress
     */
    public void setLibraryAddress(String libraryAddress){
        this.libraryAddress=libraryAddress;
    }

    /**
     * method to get the address of the library
     * @return thee library address
     */
    public String getLibraryAddress() {
        return libraryAddress;
    }

    /**
     *this method adds books object to the array list of the library
     * @param a is the book object that needs to be added
     */
    public void addBooks(Books a){
        booksCollection.add(a);
    }

    /**
     * in this method we take the wanted book and check if it is on the list. Once it's found, the program will make
     * isBorrow value equal to true and print a massage that the book was successfully borrowed. if the book exist
     * but was borrowed already "isBorrow==true", the program will print that the book is not available to be borrowed.
     * this method uses a counter to go over the array list. and if the counter reaches to the number of elements
     * in the list and did not find the book, the program will print that this book is not in the list of books
     * for this library
     * @param a is the book object that needs to be checked
     */
    public void borrowBook(Books a) {
        int i;    //counter that will be used to determine if the book is available and will determine if the book exist in the list
        for (i = 0; i < booksCollection.size(); i++) {    //in this for loop
            if (a.getBookTitle().equals(booksCollection.get(i).getBookTitle())) {    // we compare if the name of the wanted book is
                if (!a.isBorrow()) {         //in the array list of th library by checking if there is a difference between the 2 strings
                    a.setBorrow(true);       //if they're identical, then will check if borrow is false
                    System.out.println("you borrowed " + a.getBookTitle() + " successfully");// if all conditions met, the program
                    break; // will make the borrow==true and make it unavailable
                } else {
                    System.out.println(a.getBookTitle() + " is not available");
                }
                break;//if it is already unavailable, then it will print unavailable
            }
        }
        if (i == booksCollection.size()) { //if the loop iterrate through the whole list, it means the book is not on the list
            System.out.println("book is not on the list of books collections");
        }
    }//a.getBookTitle() is null for some reason and that is why the program is not working

    /**
     * this method will call the method from books and turn borrow to true
     * @param a the book
     */
    public void returnBook(Books a){
        a.returned();
    }

    /**
     * this method checks the isBorrow value. If it is false, it will print the name of the book
     */
    public void availableBooks() {
        System.out.println("the books that are available in " + getLibraryName() + " are: ");
            for (int i = 0; i < booksCollection.size(); i++) {// the for loop will print every book that has borrow value of false
                if (!booksCollection.get(i).isBorrow()) {
                    System.out.println(booksCollection.get(i).getBookTitle());
                }
            }
        }

    /**
     * this method will take the variables of the class and present the time of opening and closing of each library
     */
    public void printHours(){
        System.out.println("the Library "+ getLibraryName()+" at "+getLibraryAddress()+"will open from" +
                getOpenHour()+" to "+getCloseHour());
    }

}
