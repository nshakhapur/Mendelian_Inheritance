import java.io.*;
class application
{
    void quiz2()throws Exception
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("WELCOME TO QUIZ");
    System.out.println();
    System.out.println();
    System.out.println("PLEASE ENTER YOUR NAME");
        String name=br.readLine();
    
            String ans=""; int marks=0; String next="";
    
    
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
    System.out.println("1.What could be the eye colour of father, if mother has black eyes and child has black eyes?");
    System.out.println();
    System.out.println("a.Black");
    System.out.println("b.Blue");
    System.out.println("c.Grey");
    System.out.println("d. a or b");
    ans=br.readLine();
    if(ans.equals("d"))
    {
       System.out.println("CORRECT! YOU DID IT!\n Press Enter to continue");
    next=br.readLine();
        
           marks+=20;
}
else
{ System.out.println("SORRY! WRONG ANSWER :-( ! \n THE CORRECT ONE IS d\nPress Enter to continue");
 next=br.readLine();}
 System.out.print("\u000C");
    if( next.equals(""))
{
            ans="";
 System.out.println("2.which one is dominant right-handedness or left-handedness");
    System.out.println();
    System.out.println("a.left-handedness");
    System.out.println("b.right-handedness");
    System.out.println("c.both and b");
    System.out.println("d.Not sure");
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
ans="";System.out.print("\u000C");
 System.out.println("3.Mother is carrier of colour-blind,so what is probability of her son being normal");
    System.out.println();
    System.out.println("a.100%");
    System.out.println("b.0%");
    System.out.println("c.25%");
    System.out.println("d.50%");
    ans=br.readLine(); ans=ans.toLowerCase();          
if(ans.equals("c"))
    {
        System.out.println("CORRECT! YOU DID IT!\n Press Enter to continue");
    next=br.readLine();
        
           marks+=20;
}
else
{ System.out.println("SORRY! WRONG ANSWER :-( ! \n THE CORRECT ONE IS c\nPress Enter to continue");
 next=br.readLine();}
 }
    if( next.equals(""))
{
            ans="";System.out.print("\u000C");
 System.out.println("4.Father has factor baldness,what is probability of daughter being normal? ");
    System.out.println();
    System.out.println("a.50%");
    System.out.println("b.0%");
    System.out.println("c.100%");
    System.out.println("d.10%");
    ans=br.readLine(); ans=ans.toLowerCase();          
if(ans.equals("c"))
    {
        System.out.println("CORRECT! YOU DID IT!\n Press Enter to continue");
    next=br.readLine();
        
           marks+=20;}
else
{ System.out.println("SORRY! WRONG ANSWER :-( ! \n THE CORRECT ONE IS c\nPress Enter to continue");
 next=br.readLine();}
 }
    if( next.equals(""))
{
  ans="";System.out.print("\u000C");
 System.out.println("5.which is/are mother linked-disease(s)");
    System.out.println();
    System.out.println("a.Haemophilia");
    System.out.println("b.Colour-blindness");
    System.out.println("c.Luekemia(Blood Cancer)");
    System.out.println("d.both a and b");
    ans=br.readLine(); ans=ans.toLowerCase();          
if(ans.equals("d"))
    {
        System.out.println("CORRECT! YOU DID IT!\n Press Enter to continue");
    next=br.readLine();
        
           marks+=20;
        }
else
{ System.out.println("SORRY! WRONG ANSWER :-( ! \n THE CORRECT ONE IS d\nPress Enter to continue");
 next=br.readLine();}
 }System.out.print("\u000C");
    if( next.equals(""))
{

    Thread.sleep(5000);
     
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
 System.out.println("\t\t the Applications Of Genetics as Quiz and has been qualified for next round");
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