// import java.util.scanner;

import java.util.Scanner;

class ATmStore
{
    public static void main( String[] args)
    {
      Scanner scanner =new Scanner (System.in);
    int bal = 10000;
    while(true)
    {
        System.out.println("ATM Machine");
        System.out.println("Choose 1 for Withdraw");
        System.out.println("Choose 2 for Deposit");
        System.out.println("Choose 3 for Check Balance");
        System.out.println("Choose 4 for Exit");
        System.out.println("Choose The opretion: ");
       
        int opretion= scanner.nextInt();
        switch(opretion)
        {
        case 1:
        System.out.println("Enter money to be withdraw");
        int WithdrawAmount = scanner.nextInt();
        if(WithdrawAmount<=bal)
        {
            bal=bal-WithdrawAmount;
            System.out.println("Amount w1ithdraw succesfully");
        }
        else
        {
            System.out.println("Insufficient balance");
        }
       case 2:
       System.out.println("Enter money to be deposit");
        int depositAmount=scanner.nextInt();
        bal+=depositAmount;
        System.out.println("Amount deposit successfully");
        break;
       case 3:
       System.out.println("Balance" +bal);

       case 4:
       System.out.println("Thank for visiting ATM");
       default:
       System.out.println("invalid opretion");

        }

        
    }
}
}