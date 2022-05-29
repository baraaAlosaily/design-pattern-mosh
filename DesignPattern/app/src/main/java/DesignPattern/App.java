
package DesignPattern;

import org.checkerframework.checker.units.qual.A;

public class App {
    public static void main(String[] args) {
//        User user=new User(" baraa");
//        user.printName();
//        TaxCalculator taxCalculator=getCalculator();
//        taxCalculator.getTax();
//        Account account1=new Account();
//        account1.deposit(10);
//        account1.withDrawel(5);
//        System.out.println(account1.getAmount());
        MailServices mailServices1=new MailServices();
        mailServices1.sendEmail();
    }
//    public static TaxCalculator getCalculator(){
//        return new TaxCalculator2019();
//    }
}
