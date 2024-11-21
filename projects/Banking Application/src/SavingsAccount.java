public class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber,String accountHolderName,double balance){
        super(accountNumber, accountHolderName, balance);
    }
    @Override
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println(amount+" amount is withdrawn.");
        }else{
            System.out.println("Insufficient balance");
        }
    }
}
