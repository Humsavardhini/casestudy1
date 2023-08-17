public abstract class SavingsAccount implements Account{
    @Override
    public void createAccount(){
        System.out.println("Savings account created");

    }

    @Override
    public void setInterest(double interestRate) {
        System.out.println("Savings account interest is "+interestRate+"%");
    }

    int amount = 10000;

    @Override
    public void interestAmount(int years,double interestRate){
        double interestamt= (amount*interestRate*years)/100;
        System.out.println("The interest amount is: "+interestamt);
    }

    public void passbook(){
        System.out.println("Savings account comes with the passbook feature!");
    }
}
