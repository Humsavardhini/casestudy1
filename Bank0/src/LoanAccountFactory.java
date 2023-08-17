public class LoanAccountFactory extends LoanAccount{
    public void output(){
        System.out.println("LOAN:");
        System.out.println();
    }

    @Override
    public void creditScore(){super.creditScore();}

}
