public class Main {
    public static void main(String[] args) {

        Member studentMember = new Student("Mihai", 23, "5th Road", "9 D");
        Member teacherMember = new Teacher("Ana", "7th Street", 37, "crist@gmail.com");

        studentMember.printMemberDetails();
        teacherMember.printMemberDetails();

        Book studentBook = new Book("Mindset", "returned", studentMember);
        Book teacherBook = new Book("ThinkUp","borrowed",teacherMember);

        studentBook.depositBook(7);
        teacherBook.depositBook(6);

        studentBook.borrowBook(2);
        teacherBook.borrowBook(4);

        studentBook.returnBook(5);
        teacherBook.returnBook(7);

        studentBook.printBook();
        teacherBook.printBook();
    }
}
