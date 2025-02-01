//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        double cardBalance = 5000;
        double interestRate = 0.17;
        double monthOneInterest = cardBalance * interestRate;
        double monthOneTotal = monthOneInterest + cardBalance;
        double monthTwoInterest = monthOneTotal * interestRate;
        double monthTwoTotal = monthTwoInterest + monthOneTotal;




        System.out.printf("Starting card balance is $" + cardBalance);
        System.out.printf(" interest after one month is $" + monthOneInterest);
        System.out.printf(" total after one month is $" + monthOneTotal);
        System.out.printf(" interest for month two is $" + monthTwoInterest);
        System.out.printf(" total after two months is $" + monthTwoTotal);


    }
}