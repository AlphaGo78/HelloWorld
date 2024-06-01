package demo01;

public class CarLoan {
    //汽车贷款金额
    int carLoan;
    //贷款年限
    int loanLength;
    //贷款利率
    int interestRate;
    //预付定金
    int downPayment;

    public CarLoan(int carLoan, int loanLength, int interestRate, int downPayment){
        this.carLoan = carLoan;
        this.loanLength = loanLength;
        this.interestRate = interestRate;
        this.downPayment = downPayment;
        if(loanLength <= 0 || interestRate <= 0){
            System.out.println("Error! You must take out a valid car loan.");
        } else if(downPayment > carLoan){
            System.out.println("The car can be paid in full.");
        } else{
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance/months;
            int interest = interestRate * monthlyBalance/100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }
    }

    public static void main(String[] args) {
        new CarLoan(10000,3,5,2000);
    }
}
