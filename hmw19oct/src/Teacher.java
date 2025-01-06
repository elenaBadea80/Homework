public class Teacher extends Member{

    private String email;

    public Teacher(String name, String address, int age, String email){
        super(name, address, age);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String getClientType() {
        return "";
    }

    @Override
    public void printMemberDetails() {
        System.out.println("--------------------");
        System.out.println("Teacher details: ");
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Email: " + getEmail());
    }
}
