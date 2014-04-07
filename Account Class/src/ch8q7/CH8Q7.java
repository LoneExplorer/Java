package ch8q7;

public class CH8Q7 {

    public static void main(String[] args) {

        Account acc1 = new Account(1122, 20000, 4.5);
        acc1.withdraw(2500);
        acc1.deposit(3000);
        System.out.println(acc1);
    }

}
