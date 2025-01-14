package fc.java.model3;
import fc.java.model3.Address;
public class Member {

    private String name;
    private int age;
    private String email;
    private Address adress;



    public Member(String name, int age, String email, Address adress) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", adress=" + adress +
                '}';
    }



}
