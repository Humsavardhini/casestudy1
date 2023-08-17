public class SavingsAccountFeature extends SavingsAccount{

    public void output(){
        System.out.println("SAVINGS ACCOUNT:");
        System.out.println();
    }

    @Override
    public void passbook(){super.passbook();}
}
