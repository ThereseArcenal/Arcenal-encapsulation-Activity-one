/*
   Name: Therese Andrei C. Arcenal
   Course&Sec: BSIT 2B     
   Date: October 24, 2023
   Activity: ArcenalEncapsulationAct1 
*/

   
public class ArcenalEncapsulationAct1{
    public static void main(String[] args) {
        Person person = new Person("Therese Andrei", "Camoro", "Arcenal", 20, "October 8, 2003", "MC Arthur Blvd Cebu City");

        System.out.println("=== PERSONAL INFO ===");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Middle Name: " + person.getMiddleName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Birthday: " + person.getBdayDate());
        System.out.println("Address: " + person.getAddress());  
      
    }
}   
   class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String bdayDate;
    private String address;

    public Person(String firstName, String middleName, String lastName, int age, String bdayDate, String address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.bdayDate = bdayDate;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBdayDate() {
        return bdayDate;
    }

    public void setBdayDate(String bdayDate) {
        this.bdayDate = bdayDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
