package Entity;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private String id;
    private String firstname;
    private String lastname;
    private LocalDate dateofBrith;
    private String gender;
    private String phoneNumber;
    private String email;
    private String address;

    public Person(String id, String firstname, String lastname, LocalDate dateofBrith, String gender, String phoneNumber, String email, String address) {

        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateofBrith = dateofBrith;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getFirstname() {

        return firstname;
    }

    public void setFirstname(String firstname) {

        this.firstname = firstname;
    }

    public String getLastname() {

        return lastname;
    }

    public void setLastname(String lastname) {

        this.lastname = lastname;
    }

    public LocalDate getdateofBrith() {

        return dateofBrith;
    }

    public void setDateofBrith(LocalDate dateofBrith) {

        this.dateofBrith = dateofBrith;
    }

    public String getgender() {

        return gender;
    }

    public void setgender(String gender) {

        this.gender = gender;
    }

    public String getphoneNumber() {

        return phoneNumber;
    }

    public void setphoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public String getemail() {

        return email;
    }

    public void setemail(String email) {

        this.email = email;
    }

    public String getAddress() {

        return address;
    }

    public void setaddress(String address) {

        this.address = address;
    }

    public void displayIfo() {

        System.out.println("id : " + id);
        System.out.println("firstName : " + firstname);
        System.out.println("lastName : " + lastname);
        System.out.println("dateOfBirth : " + dateofBrith);
        System.out.println("gender : " + gender);
        System.out.println("phoneNumber : " + phoneNumber);
        System.out.println("email : " + email);
        System.out.println("address : " + address);
    }

    @Override
    public String toString() {

        return "Person{" +
                "id='" + id + '\'' +
                ", firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", dateOfBirth=" + dateofBrith +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object m) {

        if (this == m) {
            return true;
        }

        if (!(m instanceof Person)) {
            return false;
        }

        Person person = (Person) m;

        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }


    }

