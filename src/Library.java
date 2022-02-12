import java.util.ArrayList;

public class Library extends Books {

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
     * method to set the adress of the library
     * @param libraryAddress
     */
    public void setLibraryAddress(String libraryAddress){
        this.libraryAddress=libraryAddress;
    }

    /**
     * method to get the address of the library
     * @return
     */
    public String getLibraryAddress() {
        return libraryAddress;
    }

    /**
     * method to add books to an array list by calling the add function
     * @param booksCollection is the array list of the books
     * @param a is the book object
     */
    //public static void addBooks(ArrayList<Books> booksCollection, Books a){

  //      booksCollection.add(a);

   // }

    /**
     * this method try to find if the book exist on the list so the  user can borrow it
     * @param booksCollection is the array list of the books
     * @param a is the wanted book
     */
    public void borrowBook(ArrayList<Books> booksCollection, Books a){
        int i;  //counter that will be used to determine if the book is available and will determin if the book exist in the list
        for (i=0; i<=booksCollection.size(); i++){ //in this for loop
            if (a.getBookTitle().compareTo(booksCollection.get(i).getBookTitle())==0){ // we compare if the name of the wanted book is
                if (!a.isBorrow()){ //in the array list of th library by checking if there is a differnce between the 2 strings
                    a.setBorrow(true);//if they're identical, then will check if borrow is false
                    System.out.println("you borrowed "+a.getBookTitle()+" successfully");// if all conditions met, the program
                    break; // will make the berrow==true and make it un availeble
                }else{
                    System.out.println(a.getBookTitle()+" is not available");
                }break;//if it is already unavailable, then it will print unavailable
            }
        }
        if (i>booksCollection.size()){ //if the loop iterrate through the whole list, it means the book is not on the list
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
     * this method will print the available books in the library
     * @param booksCollection the array list of the book
     */
    public void availableBooks(ArrayList<Books> booksCollection){
        System.out.println("the books that are available in"+getLibraryName()+ "are: ");
        for (int i=0; i<=booksCollection.size(); i++){// the for loop will print every book that has borrow value of false
            if(!booksCollection.get(i).isBorrow()){
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
