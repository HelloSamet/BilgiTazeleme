public class Person {
    int id;
    String name;
    String surName;
    String identityNymber;
    String phoneNumber;


    public Person(int id, String name, String surName, String identityNymber, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.identityNymber = identityNymber;
        this.phoneNumber = phoneNumber;
    }

    public Person(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getIdentityNymber() {
        return identityNymber;
    }

    public void setIdentityNymber(String identityNymber) {
        this.identityNymber = identityNymber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", identityNymber=" + identityNymber + ", name=" + name + ", phoneNumber="
                + phoneNumber + ", surName=" + surName + "]";
    }

    


}
