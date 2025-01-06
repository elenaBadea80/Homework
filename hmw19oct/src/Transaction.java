public class Transaction {

    private final String details;
    private final double noOfBooks;

    public double getNoOfBooks() {
        return noOfBooks;
    }

    public String getDetails() {
        return details;
    }

    private Transaction( double noOfBooks, String details) {
        this.details = details;
        this.noOfBooks = noOfBooks;
    }

    public static Transaction createBorrowTransaction(double noOfBooks){
        return new Transaction (noOfBooks,"Borrow a number of " + noOfBooks + " books." );
    }

    public static Transaction createReturnTransaction(double noOfBooks){
        return new Transaction( noOfBooks, "Return a number of " + noOfBooks + " books.");
    }

    public static Transaction createDepositTransaction(double noOfBooks) {
        return new Transaction( noOfBooks, "Deposit: " + noOfBooks + " books.");
    }

}