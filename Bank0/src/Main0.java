import java.util.Scanner;

public class Main0 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Select a number \n 1.Savings Account \n 2.Current Account \n 3.Loan");
        int num=sc.nextInt();

        switch (num) {
            case 1:

            SavingsAccountFeature saving = new SavingsAccountFeature();
            saving.output();
            saving.createAccount();
            saving.setInterest(2.5);
            saving.interestAmount(5,2.5);
            saving.passbook();
            break;

            case 2:

            CurrentAccountFeature current = new CurrentAccountFeature();
            current.output();
            current.createAccount();
            current.setInterest(1.0);
            current.interestAmount(5,1.0);
            current.Interest();
            break;

            case 3:

            LoanAccountFactory loan = new LoanAccountFactory();
            loan.output();
            loan.createAccount();
            loan.setInterest(8.0);
            loan.interestAmount(5,8.0);
            loan.creditScore();
            break;

            default:
                System.out.println("Enter Valid Number!!");
        }
    }
}
