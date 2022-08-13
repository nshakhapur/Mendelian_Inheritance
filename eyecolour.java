import java.io.*;
class eyecolour
{
    void main()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        
            Thread.sleep(2000);
        for(int i=1;i<7;i++)
           { 
               System.out.println("Loading");
             for(int j=1;j<=11;j++)
                {
                  System.out.print("=>");
                  Thread.sleep(70);
                }
                Thread.sleep(10);
             System.out.print("\u000C");
           }
        System.out.println("Enter Mother's eye colour");
        String mom=br.readLine();
          String e1="",e2=""; 

char a1,a2,b1,b2;
         if(mom.equals("brown"))
         { e1="Bb";}
         else if(mom.equals("black"))
         { e1="BB";}
         else if(mom.equals("blue"))
         {
             e1="bb";
            }
            else  
            {  System.out.println("Invalid. Enter Again");
                mom=br.readLine();
            if(mom.equals("brown"))
         { e1="Bb";}
         else if(mom.equals("black"))
         { e1="BB";}
         else if(mom.equals("blue"))
         {
             e1="bb";
            }}
           System.out.println("Enter  father's eye colour");         
           String dad=br.readLine();
         if(dad.equals("brown"))
         { e2="Bb";}
         else if(dad.equals("black"))
         { e2="BB";}
         else if(dad.equals("blue"))
         {
             e2="bb";
            }
            else  
            {  System.out.println("Invalid. enter again");
            dad=br.readLine();
        if(dad.equals("brown"))
         { e2="Bb";}
         else if(dad.equals("black"))
         { e2="BB";}
         else if(dad.equals("blue"))
         {
             e2="bb";
            }}
             
            a1=e1.charAt(0);  

String c1="";
            a2=e1.charAt(1);  

String c2="";
            b1=e2.charAt(0);  

String c3="";
            b2=e2.charAt(1);  

String c4="";
            
             String s1=""+a1+b1;   //son 1
            String s2=""+a2+b1;   //son 2
            String s3=""+a1+b2;  //daughter 1
            String s4=""+a2+b2; //daughter 2
            
            if(s1.equals

("bB")||s1.equals("Bb"))
         { c1="brown";}
         else if(s1.equals

("BB"))
         { c1="black";}
         else if(s1.equals

("bb"))
         {
             c1="blue";
            }
            
                       if(s2.equals

("bB")||s2.equals("Bb"))
         { c2="brown";}
         else if(s2.equals

("BB"))
         { c2="black";}
         else if(s2.equals

("bb"))
         {
             c2="blue";
            }
                        if(s3.equals

("bB")||s3.equals("Bb"))
         { c3="brown";}
         else if(s3.equals

("BB"))
         { c3="black";}
         else if(s3.equals

("bb"))
         {
             c3="blue";
            }
                        if(s4.equals

("bB")||s4.equals("Bb"))
         { c4="brown";}
         else if(s4.equals

("BB"))
         { c4="black";}
         else if(s4.equals

("bb"))
         {
             c4="blue";
            }
            
System.out.println("    Mother---------Father"); 
System.out.println("  ("+mom+")       ( "+dad+")");
System.out.println("              |");
System.out.println("              |");
System.out.println("   -----------------------");
System.out.println("    |      |       |      |");
System.out.println("    |      |       |      |");
System.out.println("   SON 1   SON 2 Daughter Daughter");
System.out.println( "                    1         2   ");
System.out.println(" ("+c1+")   ("+c2+")   ("+c3+")   ("+c4+")");

Thread.sleep(2500);
System.out.println("To go back press enter");
String exit=br.readLine();
if(exit.equals(""))
{
   family_tree obj=new family_tree();
    obj.main();
}
}
   }