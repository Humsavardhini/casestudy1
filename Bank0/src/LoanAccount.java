public abstract class LoanAccount implements Account{
    @Override
    public void createAccount(){
        System.out.println("Loan account created");

    }

    @Override
    public void setInterest(double interestRate) {
        System.out.println("Loan interest rate is "+interestRate+"%");
    }

    int amount = 10000;

    @Override
    public void interestAmount(int years,double interestRate){
        double interestamt= (amount*interestRate*years)/100;
        System.out.println("The interest amount is: "+interestamt);
    }

    public void creditScore(){
        System.out.println("Improves your credit score");
    }
}