//You are tasked with developing a library management system that handles books and members.
// The system should be able to perform the following operations:
//
//Add a new book
//Register a new member
//Borrow a book
//Return a book
//Print the details of a book
//Print the details of a member
//
//The models involved in the system are:
//Book
//Member (Student, Teacher)
//Transaction

public abstract class Member {

    private String name;
    private String address;
    private int age;

      public Member(String name, String adress, int age){
        this.name = name;
        this.address = adress;
        this.age = age;
      }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public abstract String getClientType();
    public abstract void printMemberDetails();
}
