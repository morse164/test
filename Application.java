public class Application {

  public static void main(String[] args){


    int current_year = 2018;
    int birth_year = 1998;
    int diff_years = current_year - birth_year;
    int numerator = 3;
    int denominator = 4;
    float numerator2 = 3;
    float denominator2 = 4;
    String fname = "Chris";
    String lname = "Morse";
    String fullname = fname + " " + lname;


    System.out.println(numerator2/denominator2);
    System.out.println("My first name is - " + fname);
    System.out.println("My last name is - " + lname);
    System.out.println("My full name is - " + fullname);

    System.out.println("Name:" + fullname + "." + " The number of days between " + birth_year + " and " + current_year + " is " + diff_years);




    BankAccount myAccount = new BankAccount("Java", "hello", 100.50);
    //BankAccount myOtherAccount = new BankAccount("Java2", "hello2", 200.33);

    myAccount.setPassword("hello","newpassword");
    System.out.println("Password change successful. Password is now: " + myAccount.getPassword());
    myAccount.deposit("newpassword",10.99);
    System.out.println("Deposit successful. Current account balance is: " + myAccount.getBalance("newpassword"));
    myAccount.setName("newname");
    System.out.println("Successfully changed account name to: " + myAccount.getName());
    myAccount.withdraw("newpassword",5.02);
    System.out.println("Withdraw successful. Current account balance is: " + myAccount.getBalance("newpassword"));
    myAccount.withdraw("hello",10);
    System.out.println("Withdraw successful. Current account balance is: " + myAccount.getBalance("newpassword"));

    //System.out.println("My second account's balance is: " + myOtherAccount.GetBalance);





  }

}
