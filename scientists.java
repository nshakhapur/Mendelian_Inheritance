import java.io.*;
class scientists
{
    void quiz3()throws Exception
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("WELCOME TO QUIZ");
    System.out.println();
    System.out.println();
    System.out.println("PLEASE ENTER YOUR NAME");
        String name=br.readLine();
    
              String ans="",next=""; int marks=0;
   
    
    for(int i=1;i<7;i++)
           { 
               System.out.println("Loading Up the Questions");
             for(int j=1;j<=11;j++)
                {
                  System.out.print("*");
                  Thread.sleep(70);
                }
                Thread.sleep(10);
             System.out.print("\u000C");
           }
    System.out.println("1.Who is referred to as 'Father of Genetics'?");
    System.out.println();
    System.out.println("a.Gregor Mendel");
    System.out.println("b.Johannssen");
    System.out.println("c.Newton");
    System.out.println("d.Wilkins");
    ans=br.readLine();
    if(ans.equals("a"))
    {
        System.out.println("CORRECT! YOU DID IT!\n Press Enter to continue");
    next=br.readLine();
        
           marks+=20;
}
else
{ System.out.println("SORRY! WRONG ANSWER :-( ! TRY NEXT ONE\n CORRECT ONE IS a\n Press Enter to continue");
    next=br.readLine();
}
  
if( next.equals(""))
{
            ans="";System.out.print("\u000C");
 System.out.println("2.Who was the first person to coin the name 'Gene'?");
    System.out.println();
    System.out.println("a.Gregor Mendel");
    System.out.println("b.Francis Crick");
    System.out.println("c.Watson");
    System.out.println("d.Johannssen");
    ans=br.readLine(); ans=ans.toLowerCase();          
if(ans.equals("d"))
    {
        System.out.println("CORRECT! YOU DID IT!\n Press Enter to continue");
    next=br.readLine();
        
           marks+=20;
}
else
{ System.out.println("SORRY! WRONG ANSWER :-( ! TRY NEXT ONE\n CORRECT ANSWER IS d\nPress Enter to continue");
 next=br.readLine();}
}
  if( next.equals(""))
{  
ans="";System.out.print("\u000C");
 System.out.println("3.Which country was Gene first discovered?");
    System.out.println();
    System.out.println("a.United Kingdoms");
    System.out.println("b.Germany");
    System.out.println("c.Denmark");
    System.out.println("d.Switzerland");
    ans=br.readLine(); ans=ans.toLowerCase();          
if(ans.equals("c"))
    {
        System.out.println("CORRECT! YOU DID IT!\n Press Enter to continue");
    next=br.readLine();
        
           marks+=20;
}
else
{ System.out.println("SORRY! WRONG ANSWER :-( ! TRY NEXT ONE\n CORRECT ONE IS c\nPress Enter to continue");
 next=br.readLine();}
}
   if( next.equals(""))
{
            ans="";System.out.print("\u000C");
 System.out.println("4.In which country was DNA first discovered? ");
    System.out.println();
    System.out.println("a.United Kingdoms");
    System.out.println("b.Denmark");
    System.out.println("c.Germany");
    System.out.println("d.Switzerland");
    ans=br.readLine(); ans=ans.toLowerCase();          
if(ans.equals("d"))
    {
        System.out.println("CORRECT! YOU DID IT!\n Press Enter to continue");
    next=br.readLine();
        
           marks+=20;}
else
{ System.out.println("SORRY! WRONG ANSWER :-( ! TRY NEXT ONE\n CORRECT ONE IS d\nPress Enter to continue");
 next=br.readLine();}
}
   if( next.equals(""))
{
  ans="";System.out.print("\u000C");
 System.out.println("5.Gregor Mendel was_____");
    System.out.println();
    System.out.println("a.Geneticst");
    System.out.println("b.Monk");
    System.out.println("c.Philosopher");
    System.out.println("d.Botanist");
    ans=br.readLine(); ans=ans.toLowerCase();          
if(ans.equals("b"))
    {
        System.out.println("CORRECT! YOU DID IT!\n Press Enter to continue");
    next=br.readLine();
        
           marks+=20;
}
else
{ System.out.println("SORRY! WRONG ANSWER :-( ! \n THE CORRECT ONE IS b\nPress Enter to continue");
 next=br.readLine();}
 }
    if( next.equals(""))
{
     
         for(int i=1;i<7;i++)
           { 
               System.out.println("Get Ready to view your Score Card");
             for(int j=1;j<=11;j++)
                {
                  System.out.print("*");
                  Thread.sleep(70);
                }
                Thread.sleep(10);
             System.out.print("\u000C");
           } 
       double p=(100 / 100 * marks);
 System.out.println("\t\t\t\t CERTIFICATE OF GENETICAL SCIENCES");
 System.out.println("\t \t\tThis is to certify that "+name+" has successfully completed");
 System.out.println("\t\t the Scientists Of Genetics as Quiz and has been qualified for being a Geneticst");
 System.out.println("\t\t\tby attainig "+p+"%");
 System.out.println();
 System.out.println("Please Press enter to continue");
 String str=br.readLine();
 if(str.equals(""))
 {
     System.out.print("\u000C");
     quiz obj= new quiz();
     obj.QUIZ_menu();
    }
}
}
}
