/**
 * name: Muhi Eddin Tahhan
 * date: feb 11th 2022
 * description: making a simple library
 */

/**
 * first class is books. this class is responsible for creating the books
 * giving them a title, and the status if they're borrowed or not
 */
public class Books {

    private String bookTitle;     //book title variable
    private boolean borrow=false; // boolean variable to determine if the book is borrowed or not

    /**
     * getter method to get the book title
     * @return the book title as a string
     */
    public String getBookTitle() {
        return bookTitle;    //return the name of the book
    }

    /**
     * this method sets the title of the book since it is private parameter
     * @param bookTitle it is the title of the book variable
     */
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;   // set the title of the book
    }

    /**
     * is a getter method to the variable borrow which is set false by default
     * @return borrow if it is true or false
     */
    public boolean isBorrow() {
        return borrow; //return the boolean variable if it is true or false
    }

    /**
     * the setter method for borrow
     * @param borrow takes borrow as parameter and sets it to true or false
     */
    public void setBorrow(boolean borrow) {
        this.borrow = borrow;     //set the private variable borrow
    }

    /**
     * the method sets borrow to be false by taking the setting method
     * @param borrow takes the setting method pass the value false
     */
    public void returned(boolean borrow){
        setBorrow(false);      //pass the value false to borrow
    }


}
