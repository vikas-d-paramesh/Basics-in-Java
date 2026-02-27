package OOP;

public class AccessModifiers {

    public static void main(String args[]) {

        BankAccount acc1 = new BankAccount();

        acc1.username = "Hardik Pandya"; // allowed (public)

        // acc1.password = "12345555"; ❌ not allowed (private)

        acc1.setPassword("abjsbsdbk"); // correct way
        
    }
}

class BankAccount {

    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}