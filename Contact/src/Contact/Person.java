package Contact;

public class Person {
    private String lastName;
    private String firstName;
    private String phone;

    public Person(String lastName, String firstName, String phone){
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getPhone(){
        return phone;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void print() {
        System.out.printf("%n%s%n%s%n%s%n", lastName, firstName, phone);
    }
}
