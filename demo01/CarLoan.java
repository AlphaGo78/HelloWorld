package demo01;

public class CarLoan {
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;

    public CarLoan(int carLoan, int loanLength, int interestRate, int downPayment){
        if(loanLength <= 0 || interestRate <= 0){
            System.out.println("Error! You must take out a valid car loan.");
        } else if(downPayment > carLoan){
            System.out.println("The car can be paid in full.");
        } else{
            int remainingBalance = carLoan - downPayment;
            int months = loanLength*12;
            int monthlyBalance = remainingBalance/months;
            int interest = interestRate * monthlyBalance;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }
    }

    public static void main(String[] args) {
        CarLoan carLoan1 = new CarLoan(10000,3,5,2000);
    }
}
