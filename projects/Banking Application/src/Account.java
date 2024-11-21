public abstract class Account {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public Account(String accountNumber,String accountHolderName,double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount "+amount+" is Deposited.");

        }else{
            System.out.println("Invalid Amount.");
        }
    }
    public abstract void withdraw(double amount);
        public void displayInfo(){
            System.out.println("Account Holder Name:"+accountHolderName);
            System.out.println("Account Number "+accountNumber);
            System.out.println("Balance"+balance);
        }
    
}
