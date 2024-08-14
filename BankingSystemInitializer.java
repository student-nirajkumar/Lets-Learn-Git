/*Scenario: Software Marks: Initialization in a Banking System
In a banking system there is a requirement to initialize some crucial parameters
during the software's startup. The development team has designed a class named 
"BankingSystemInitializer" to manage this initialization process. The class contains 
static and non-static members to handle various aspects of the initialization.
Description:
To denote Bank ID create a variable as nonStaticBankid, BankName as nonStaticBankName
and bankbalance as nonStaticBankBalance, create a Static Inializer Block to print 
"initialization process has begun" and print "Banking Process has started," from 
anonymous block create a parameterised constructor to intialize all the Bank Details 
such as nonStaticBankid,nonStaticBankName and nonStaticBankBalance and print all the 
details of bank from a non-static method as "printBankDetails()" which must be invoked
from a main method
Sample input: 
			nonStaticBankid as 448742310873423262 nonStaticBankName as Fedral
			Bank of India. 
			nonStaticBankBalance as 98385354265735737
expected output:-
		initialization process has begun Banking Process has started,
Bank Details are:
BANK ID: 448742310873423262
BANK NAME: Fedral Bank of India.
BANK BALANCE:98385354265735737 
Thank YOU for using Fedral Bank of India.
*/




class BankingSystemInitializer {

    // Non-static variables for bank details
    private long nonStaticBankid;
    private String nonStaticBankName;
    private long nonStaticBankBalance;

    // Static Initializer Block
    static {
        System.out.println("Initialization process has begun");
    }

    // Anonymous Block
    {
        System.out.println("Banking Process has started");
    }

    // Parameterized Constructor to initialize bank details
    public BankingSystemInitializer(long bankid, String bankName, long bankBalance) {
        this.nonStaticBankid = bankid;
        this.nonStaticBankName = bankName;
        this.nonStaticBankBalance = bankBalance;
    }

    // Non-static method to print bank details
    public void printBankDetails() {
        System.out.println("Bank Details are:");
        System.out.println("BANK ID: " + nonStaticBankid);
        System.out.println("BANK NAME: " + nonStaticBankName);
        System.out.println("BANK BALANCE: " + nonStaticBankBalance);
        System.out.println("Thank YOU for using " + nonStaticBankName);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an instance of BankingSystemInitializer with sample input
        BankingSystemInitializer bank1 = new BankingSystemInitializer(
                448742310873423262L, 
                "Federal Bank of India", 
                98385354265735737L
        );

        // Creating another instance of BankingSystemInitializer with different input
        BankingSystemInitializer bank2 = new BankingSystemInitializer(
                123456789012345678L,
                "State Bank of India",
                4500000000000000L
        );

        // Invoking the method to print bank details for the first bank
        bank1.printBankDetails();

        // Invoking the method to print bank details for the second bank
        bank2.printBankDetails();
    }
}
