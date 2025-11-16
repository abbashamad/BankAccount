public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);
        try{
            account.withdraw(-1000);
        } catch (IllegalArgumentException e){
            System.out.println("Fejl: " + e.getMessage());
        }


        BankAccount account1 = new BankAccount(-1);

        try{
            account1.withdraw(1);
        }catch (IllegalArgumentException s){
            System.out.println("Fejl: " + s.getMessage());
        }

    }


}
