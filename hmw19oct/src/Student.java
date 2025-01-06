public class Student extends Member{

    private String classsrom;

    public Student(String name, int age, String address, String classrom){
        super(name, address, age);
        this.classsrom = classrom;
    }

    public String getClasssrom() {
        return classsrom;
    }

    @Override
    public String getClientType() {
        return "";
    }

    @Override
    public void printMemberDetails() {
        System.out.println("--------------------");
        System.out.println("Student details: ");
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Classroom: " + getClasssrom());
    }
}
