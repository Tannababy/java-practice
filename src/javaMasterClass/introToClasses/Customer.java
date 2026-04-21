package javaMasterClass.introToClasses;

public class Customer {

    private String name;
    private int creditLimit;
    private String email;

    public Customer(String name, int creditLimit, String email){
        System.out.println("This is the 3 args constructor called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(){
        this("Tanna", "tbaby@bonita.com");
        System.out.println("This is the no args constructor, that calls the 3 args constractor that has been called");
    }

    public Customer(String name, String email){
        this(name, 620, email);
        System.out.println("This is the 2 args constructor called");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
