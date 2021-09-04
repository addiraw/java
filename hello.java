import java.util.Scanner;




  class  hello
{   String username;
    String password;
    
    hello(String username,String password)
    {
        System.out.println("Welcome");
        this.username=username;
        this.password=password;
    }
    public String checkcredential(String username,String password)
    {   char status='f';
        String message="",p="";

        if((this.username==username)&&(this.password==password))
        {
            status='p';
            message="pass";
            p = status + message ;
        }
        else if(this.username==username)
        {
            status='f';
            message="password is incorrect";
            p = status + message ;
        }
        else 
        {
            status='f';
            message="Username and password are incorret";
            p = status + message ;
        }
        
        //return status;
        return p;
    }
    // public static int returning(String input,String input1)
    // {
        
    // }
    public static void main(String[] args)
    {
        System.out.println("Wlecome to world please write aditya to proceed");
        int i=4;
        do{
            Scanner scan = new Scanner(System.in);
            String inp = scan.nextLine();
            System.out.print(inp);
            if(inp=="aditya")
                            System.out.println("you write te same thing that i read");
                        else
                            System.out.println("You does not anythings that matches this type");
                                    --i;
        
        //login id page
        Scanner scanr = new Scanner(System.in);
        System.out.println("---welcome to the peogramming ");
        System.out.println("enter the username");
        String input = scanr.nextLine();
        System.out.println("enter the password");
        String input1 = scanr.nextLine();
        System.out.println(input);
        System.out.println(input1);
        hello n = new hello(input,input1);

        //hello n = new hello();
        Scanner scans = new Scanner(System.in);
        System.out.println("enter the username");
        String input2 = scans.nextLine();
        System.out.println("enter the password");
        String input3 = scans.nextLine();
        System.out.println(input2);
        System.out.println(input3);
        String status=n.checkcredential(input2,input3);
        //char a = (char) status;
        //System.out.println(a);
        System.out.println(status);

    }while(i==0);

    }
}
