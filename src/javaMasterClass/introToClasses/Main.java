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


        BankAccount myAccount = new BankAccount();
//        myAccount.setAccountBalance(400);
        myAccount.withdraw(500);
        System.out.println("Account balance is now = " + myAccount.getAccountBalance());
        myAccount.deposit(45);
        System.out.println("Account balance is now = " + myAccount.getAccountBalance());
    }

}
