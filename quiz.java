import java.io.*;
class quiz
{
    void QUIZ_menu()throws Exception
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("WELCOME TO THE QUIZ");
        System.out.println();
        System.out.println();
        
        System.out.println("WHAT WOULD YOU PREFER ?");
        System.out.println("1.BASICS OF GENETICS");
        System.out.println("2.APPLICATION BASED QUIZ");
        System.out.println("3.SCIENTISTS AND THEIR COUNTRIES IN GENETICS");
         System.out.println("4.TO READ INSTRUCTIONS");
        System.out.println("5.GO BACK TO MENU");
        int choice=Integer.parseInt(br.readLine());
        
        if(choice==1)
        {System.out.println("\u000C");
            Basics_quiz obj=new Basics_quiz();
            obj.quiz1(); }
        else if(choice==2)
        {System.out.println("\u000C");
            application obj=new application();
            obj.quiz2();}
        else if(choice==3)
        {System.out.println("\u000C");
            scientists obj=new scientists();
            obj.quiz3();
        }
        else if(choice==4)
        {System.out.println("\u000C");
            instructions obj= new instructions();
            obj.read();
        }
            
        else if(choice==5)
        {
            System.out.println("\u000C");
            MAIN obj=new MAIN();
            obj.display();
        }
        
        else
        {
            System.out.println("INVALID ENTRY... ENTER AGAIN");
            if(choice==1)
        { System.out.println("\u000C");
            Basics_quiz obj=new Basics_quiz();
            obj.quiz1();
        }
        else if(choice==2)
        {
            System.out.println("\u000C");
            application obj=new application();
            obj.quiz2();
        }
        else if(choice==3)
        {System.out.println("\u000C");
            scientists obj=new scientists();
            obj.quiz3();}
        else
        { 
            System.out.println("\u000C");
            MAIN obj=new MAIN();
            obj.display();
        }
    }
}
}


    
        
    
    


    
        