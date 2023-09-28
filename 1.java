//1. Create a package named ‘com’. Define subpackages;‘transact’: with class ‘Transaction’ with static methods credit() and debit() ‘loan’: with class ‘LoanAccount’ with method doTransaction() which calls Transactionmclass methods.
//Create one ‘LoanAccount’ object in main to perform operations on it by accepting command line arguments.
package com;

import com.loan.LoanAccount;

public class Com {

    
    public static void main(String[] args) {
        
        int n = args.length;
        int s = Integer.parseInt(args[0]);
        int c = Integer.parseInt(args[1]);
        int d = Integer.parseInt(args[2]);
        
      LoanAccount la = new LoanAccount();
        la.Transaction(s,c,d);

        
    }
    
}
//subpackage 1
package com.transact;


public class Transaction {
   int salary;

    public Transaction(int s){
        this.salary = s;
    }

    public int credits(int c){
        int res= salary+c;
       return res;
    }
    public int debits(int d){
        int res1 =  salary-d;
        return res1;
 }

  //subpackage 2
  package com.loan;
import com.transact.*;
public class LoanAccount {
    
    public void Transaction(int s,int c,int d) {
        Transaction ta = new Transaction(s);
        System.out.println("the initial amount:"+s);

        System.out.println("the amount after credit:"+ta.credits(c));
        System.out.println("the amount after debit:"+ta.debits(d));
        
    }
}
}

