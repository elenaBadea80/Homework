public class Book {

    private String bookName;
    private String status;
    private final Member member;
    private final Transaction[] transactions = new Transaction[100];
    private int transactionCount = 0;
    private double balance;

    public Book(String bookName,String status, Member member) {
        this.bookName = bookName;
        this.status = status;
        this.member = member;
    }

    public double getBalance() {
        return balance;
    }

    public String getBookName() {
        return bookName;
    }

    public String getStatus() {
        return status;
    }

    public Member getMember() {
        return member;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void depositBook (double noOfBooks) {
        // exit early if the amount is negative
        if (noOfBooks < 0) {
            System.out.println("The amount to deposit must be positive.");
            return;
        }

        Transaction transaction = Transaction.createDepositTransaction(noOfBooks);
        transactions[transactionCount++] = transaction;

        balance += noOfBooks;
    }

    public void returnBook (double noOfBooks) {
        // exit early if the amount is negative
        if (noOfBooks < 0 || noOfBooks > balance) {
            System.out.println("The amount to withdraw must be positive " +
                    "and should not exceed the balance.");
            return;
        }

        Transaction transaction = Transaction.createReturnTransaction(noOfBooks);
        transactions[transactionCount++] = transaction;

        balance -= noOfBooks;
    }

    public void borrowBook(double noOfBooks) {
        if (noOfBooks < 0 || noOfBooks > balance) {
            System.out.println("The amount to transfer must be positive " +
                    "and should not exceed the balance.");
            return;
        }

        Transaction transaction = Transaction.createBorrowTransaction(noOfBooks);
        transactions[transactionCount++] = transaction;

        balance += noOfBooks;
    }

    public void printBook() {
        System.out.println("--------------------");
        System.out.println("Name of books: " + getBookName());
        System.out.println("Member: " + member.getName());
        System.out.println("Status of books: " + getStatus());
        System.out.println("--------------------------------");
        System.out.println("Details of " + member.getName() + ":");
        System.out.println("Balance: " + getBalance());
        for (int i = 0; i < transactionCount; i++) {
            Transaction transaction = transactions[i];
            System.out.println("- " + transaction.getDetails() + " (" + transaction.getNoOfBooks() + ")");
        }
    }
}