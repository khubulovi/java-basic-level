package lesson5;

public class Niggers {
    private String name;
    private String lastname;
    private String surname;
    private int age;
    private String mail;
    private String possition;
    private int salary;
    private String phoneNumber;

    public Niggers(String name, String lastname, String surname, int age, String mail, String possition, int salary, String phoneNumber) {
        this.name = name;
        this.lastname = lastname;
        this.surname = surname;
        this.mail = mail;
        this.possition = possition;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSurnam() {
        return surname;
    }

    public void setSurnam(String surnam) {
        this.surname = surnam;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPossition(String possition) {
        return possition;
    }

    public void setPossition(String possition) {
        this.possition = possition;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       if (age >= 18) {
       this.age = age;
       } else {
       System.out.println("He cant work here");
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public void searchWorkers(int age){
        if(age<=this.age){
            info();
        }
    }

    public void info() {
        System.out.println("Worker{" +
                "name='" + name + '\'' +
                ", placeOfWork='" + placeOfWork + '\'' +
                ", mail='" + mail + '\'' +
                ", number=" + number +
                ", salary=" + salary +
                ", age=" + age +
                '}');
    }
}
