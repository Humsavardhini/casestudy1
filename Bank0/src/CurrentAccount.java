public abstract class CurrentAccount implements Account{
    @Override
    public void createAccount(){
        System.out.println("Current account created");
    }
    @Override
    public void setInterest(double interestRate){
        System.out.println("Current account interest rate is "+interestRate+"%");
    }

    int amount = 10000;

    @Override
    public void interestAmount(int years,double interestRate){
        double interestamt= (amount*interestRate*years)/100;
        System.out.println("The interest amount is: "+interestamt);
    }

    public void Interest(){
        System.out.println("It bears No interest at all!!");
    }


}
