import java.io.*;
class FAQs
{
    void main()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("\t\t\tFREQUENTLY ASKED QUESTIONS");


 System.out.println("1.What are genes?");
 
 System.out.println();
 System.out.println("Genes are small units of DNA, which contain instructions for how to make proteins.");
 System.out.println(" A chromosome contains many genes."); int r1=(int)Math.random()*100;
  System.out.println("1K people found this helpful");
 System.out.println();
 System.out.println();
 System.out.println("2.What is junk DNA?");
 System.out.println();
 System.out.println("Only 1% of DNA is made up of genes. The rest -- previously called junk DNA");
 System.out.println("is noncoding DNA that is very important for turning genes on and off.");
  System.out.println("4K found this helpful");
 System.out.println();
 System.out.println();
 System.out.println("3.What are mutations?");
 System.out.println();
 System.out.println("Mutations are permanent changes to the DNA. While some mutations cause disease,");
 System.out.println(" many other mutations do not impact health.");
   System.out.println("5K found this helpful");
   Thread.sleep(2500);
 System.out.println();
  System.out.println();
System.out.println("4.What is recombination?");
 System.out.println();
System.out.println("Recombination is an important process that can help repair broken DNA, and help shuffle the DNA"); 
System.out.println("when making new cells");
 System.out.println("4K found this helpful");
 System.out.println();
  System.out.println();
System.out.println("5.What does dominant vs recessive mean?");
 System.out.println();
System.out.println("A dominant trait can overpower and hide another (the recessive trait)."); 
System.out.println("The dominant trait is not always the most common one --");
System.out.println("how common a trait is has to do with how many copies of that DNA are present in a population.");
 System.out.println("8K found this helpful"); 
 System.out.println();
  System.out.println();


System.out.println("6.How do scientists figure out what gene controls a trait?");int r6=(int)Math.random()*100;
 System.out.println();
System.out.println("Scientists compare DNA from people (or animals!) with different versions of the trait,"); 
System.out.println("to figure out what piece of DNA is correlated with the trait.");
 System.out.println("10K found this helpful");
 
  System.out.println();
   System.out.println();
    System.out.println("If you have also found it useful please press S or if you have not found it useful pls press N ");
     System.out.println("or simply press enter to continue...");
     String accept=br.readLine(); accept=accept.toLowerCase();
     if(accept.equals("s"))
     { System.out.println("Thank You So Much! Going back to main menu");
         Thread.sleep(1500);System.out.println("\u000C");MAIN obj=new MAIN();
                 obj.display();
         }
     if(accept.equals("n"))
     {
          System.out.println("Enter your review to give us an oppurtunity to help you");
          String rew=br.readLine();
           System.out.println("Thank You...Going Back To main menu");
           Thread.sleep(1500);System.out.println("\u000C");
           MAIN obj=new MAIN();
                 obj.display();
        }
        if(accept.equals(""))
        {
             System.out.println("Please press e to go to main menu");
             String s=br.readLine();
             s=s.toLowerCase();
             if(s.equals("e"))
             {  System.out.println("\u000C");
                 MAIN obj=new MAIN();
                 obj.display();
                }
            }
        }
    }
    
            

        
    