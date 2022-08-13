import java.io.*;
class Basics_quiz
{
    void quiz1()throws Exception
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
    System.out.println("1.What is the study of heredity?");
    System.out.println();
    System.out.println("a.Hereditology");
    System.out.println("b.Genetology");
    System.out.println("c.Genetics");
    System.out.println("d.Biology");
    ans=br.readLine();
    if(ans.equals("c"))
    {
       System.out.println("CORRECT! YOU DID IT!\n Press Enter to continue");
    next=br.readLine();
        
           marks+=20;
}
else
{ System.out.println("SORRY! WRONG ANSWER :-( ! \n THE CORRECT ONE IS c\nPress Enter to continue");
 next=br.readLine();}
 System.out.print("\u000C");
    if( next.equals(""))
{
           
            ans="";
 System.out.println("2.What are genes?");
    System.out.println();
    System.out.println("a.A double helix");
    System.out.println("b.DNA");
    System.out.println("c.RNA");
    System.out.println("d.Units Of Heredity");
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
 System.out.print("\u000C");
    if( next.equals(""))
{
ans="";
 System.out.println("3.What are alleles?");
    System.out.println();
    System.out.println("a.The colour of eye");
    System.out.println("b.DNA");
    System.out.println("c.Not part of Genetics");
    System.out.println("d.Available Forms of Genes");
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
 System.out.print("\u000C");
    if( next.equals(""))
{
            ans="";
 System.out.println("4.Alleles determine_______");
    System.out.println();
    System.out.println("a.Your Eye colour");
    System.out.println("b.Your Skin colour");
    System.out.println("c.Both a and b");
    System.out.println("d.Only a");
    ans=br.readLine(); ans=ans.toLowerCase();          
if(ans.equals("c"))
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
 System.out.println("5.Alleles Can be_____");
    System.out.println();
    System.out.println("a.Strong acid");
    System.out.println("b.Domianant or recessive");
    System.out.println("c.Carbohydrate");
    System.out.println("d.Acetic acid");
    ans=br.readLine(); ans=ans.toLowerCase();          
if(ans.equals("b"))
    {
       System.out.println("CORRECT! YOU DID IT!\n Press Enter to continue");
    next=br.readLine();
        
           marks+=20;}
else
{ System.out.println("SORRY! WRONG ANSWER :-( ! \n THE CORRECT ONE IS b\nPress Enter to continue");
 next=br.readLine();}
 System.out.print("\u000C");
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
          if(p>=40)
          {
       
 System.out.println("\t\t\t\t CERTIFICATE OF GENETICAL SCIENCES");
 System.out.println("\t \t\tThis is to certify that "+name+" has successfully completed");
 System.out.println("\t\t the Basics Of Genetics as Quiz and has been qualified for next round");
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
else
{
    System.out.println("TRY AGAIN");
}
    }
}
}
}
}
}
}

