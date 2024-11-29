import java.util.Scanner;

class Account{
  Scanner sc=new Scanner(System.in);

  String name="Kedar";
  int money;
  String type;
  int accno;
  Account(String acctype,int accno){
    this.type=acctype;
    this.money=0;
    this.accno=accno;
    
  }
  void accdetail(){
    System.out.println("Account Holder Name: "+name);
    System.out.println("Account No: "+accno);
    System.out.println("Balance: "+money);
    System.out.println(this.type);
  }

  void deposit(){
    int mon;
    System.out.println(accno);
    System.out.println(type);
    System.out.println("Enter the Amount: ");
    mon=sc.nextInt();
    money+=mon;
    System.out.println("Balance: "+money);
  }

  void withdraw(){
    System.out.println(this.accno);
    System.out.println(type);
    int mon;
    System.out.println("Enter the Amount: ");
    mon=sc.nextInt();
    money-=mon;
    System.out.println("Balance: "+money);
    if((money<=100) && this.type=="current_account")
    {
      System.out.println("Minimum balance is 100");
      System.out.println("Deposite money now and pay the fine of 50");
    }
  }
  void cal_intrest(){
    if(this.type=="saving_account")
    {
      
      System.out.println(this.type);
      double temp=this.money;
      
      double intrest=((temp)*0.5)+temp;
      System.out.println("The intrest: "+intrest);
    }

    else
    {
      System.out.println("Not a saving account");
    }
    
  }
}
 
public class sys {
    public static void main(String[] args) {
      Account c1=new Account("saving_account",1);
      Account c2=new Account("current_account",2);

      while(true)
      {
        Scanner sc=new Scanner(System.in);
        
        int choice;
        System.out.println("Enter the choice:\n1.Deposite\n2.Withdraw\n3.Compute intrest\n4.Display acc details\n5.Exit");
        choice=sc.nextInt();
        if (choice==1)
        {
          c1.deposit();
          c2.deposit();
        }

        if(choice==2){
           c1.withdraw();
           c2.withdraw();
        }

        if(choice==3){
          c1.cal_intrest();
          c2.cal_intrest();
       }

       if(choice==4){
        c1.accdetail();
        c2.accdetail();
     }

     if(choice==5){
      break;
      }
    }
    
    // Adding USN and Name
    System.out.println("USN: 1BM23CS147");
    System.out.println("Name: Kedar Jevargi");
  }
}
