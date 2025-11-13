public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);
        try{
            account.withdraw(1001);
        } catch (IllegalArgumentException e){
            System.out.println("Fejl: " + e.getMessage());
        }


    }


}
