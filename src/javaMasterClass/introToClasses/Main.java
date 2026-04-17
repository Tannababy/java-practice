package javaMasterClass.introToClasses;

public class Main {

    public static void main(String[] args) {

//        Car car = new Car();
//        car.setMake("Porsche");
//        car.setModel("Carrera");
//        car.setDoors(2);
//        car.setConvertible(true);
//        car.setColour("black");
//        System.out.println("make = " + car.getMake());
//        System.out.println("model = " + car.getModel());
//        car.describeCar();


        BankAccount myAccount = new BankAccount(); //calls the default constructor (no args constructor)
        myAccount.setAccountBalance(400);
        myAccount.withdraw(500);
        System.out.println("Account balance is now = " + myAccount.getAccountBalance());
        myAccount.deposit(45);
        System.out.println("Account balance is now = " + myAccount.getAccountBalance());

        BankAccount newAccount = new BankAccount("012345", 1000.00, "Ibiere Amobi", "ibemail@iternet.com", "12340987651");
        System.out.println(newAccount.getAccountNumber());
        System.out.println(newAccount.getAccountBalance());

        BankAccount lotasAccount = new BankAccount("Lota", "lota@gmail.com", "123456789809");
        System.out.println("Acct no: " + lotasAccount.getAccountNumber() + "; Acct name: " + lotasAccount.getCustomerName());
    }

}
