import java.io.*;
class eye_colour
 {
     String a1,a2,a3,a4,b1,b2,b3,b4;
    
    void a()
    {
    System.out.println("                               MIX-MATCHING");
        System.out.println("eye colours that can be entered are Black, Grey and Blue ");
         
    }
    void input()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        
        System.out.println("Enter Mother's Details");
        
        System.out.println("eye colour");
        String h1=br.readLine();
        String p1="";
        String t1="black";
        String t2="grey";
        String t3="blue";
        h1=h1.toLowerCase();
        
        if(h1.equals(t1))
         {p1="BB";}
       else if(h1.equals(t2))
         {
             p1="Bb";
            }
        else  if(h1.equals(t3))
         {p1="bb";}
         else
         {System.out.println("Invalid Entry");
             System.out.println("Please enter eye colour again");
             h1=br.readLine();
             if(h1.equals(t1))
         {p1="BB";}
        else if(h1.equals(t2))
         {
             p1="Bb";
            }
        else  if(h1.equals(t3))
         {p1="bb";}
            }
         char a1=p1.charAt(0);
         char a2=p1.charAt(1);
        
       
   
        
         System.out.println("Enter Father's Details");
        
        System.out.println("eye colour");
        String h2=br.readLine();
        
        h2=h2.toLowerCase();
        String p2="";
        
        if(h2.equals(t1))
         {p2="BB";}
        else if(h2.equals(t2))
         {
             p2="Bb";
            }
        else  if(h2.equals(t3))
         {p2="bb";}
         else
         {System.out.println("Invalid Entry");
             System.out.println("Please enter again");
             h2=br.readLine();
             if(h2.equals(t1))
         {p2="BB";}
         else if(h2.equals(t2))
         {
             p2="Bb";
            }
        
        else  if(h2.equals(t3))
         {p2="bb";}
            }
         char b1=p2.charAt(0);
         char b2=p2.charAt(1);
        for(int i=1;i<7;i++)
           { 
               System.out.print("Loading");
             for(int j=1;j<=5;j++)
                {
                  System.out.print(".");
                  Thread.sleep(70);
                }
                Thread.sleep(10);
             System.out.print("\u000C");
           }
         
         String s1=""+a1+b1;
         String s2=""+a1+b1;
         String s3="" +a2+b1;
         String s4=""+a2+b2;
                              
         System.out.println("This pattern represents how children inherit the trait");
         System.out.println("                     PUNNETT PATTERN(SQUARE)");
         System.out.println("                 ♂/♀ | "+ a1 +" | "+ a2 );
         
         System.out.println("                "+ b1+"   |  "+a1+b1+"  |  "+a2+b1);
         System.out.println("                "+ b2+"   |  "+a1+b2+"  |  "+a2+b2);
         System.out.println();
         System.out.println();
         System.out.println("KEYS");
         System.out.println("♂-Father");
         System.out.println("♀-Mother"); 
         System.out.println("BB-Black eye");
         System.out.println("Bb-Grey eye");
         System.out.println("bb-Blue eye");
         System.out.println();
         System.out.println();
         
         int x=0;int y=0;
         int z=0;
         
         
         
         
         
         
         if((h1.equals("grey")&&h2.equals("grey"))||(h2.equals("grey")&&h1.equals("grey")))
         {
              System.out.println("Probability of child having black eye"+"25%");
         System.out.println("Probability of child having grey eye"+"50%");
         System.out.println("Probability of child having blue eye"+"25%");
        }
        else if((h1.equals("blue")&&h2.equals("grey"))||(h1.equals("grey")&&h2.equals("blue")))
         {
              System.out.println("Probability of child having black eye"+"0%");
         System.out.println("Probability of child having grey eye"+"50%");
         System.out.println("Probability of child having blue eye"+"50%");
        }
        else if((h1.equals("black")&&h2.equals("grey"))||(h1.equals("grey")&&h2.equals("black")))
         {
              System.out.println("Probability of child having black eye"+"50%");
         System.out.println("Probability of child having grey eye"+"50%");
         System.out.println("Probability of child having blue eye"+"0%");
        }
        else
        {
         
         
         
         
         
         if(s1.equals("BB"))
         { x+=1;}
           if(s2.equals("BB"))
         { x+=1;}
          if(s3.equals("BB"))
         { x+=1;}
          if(s4.equals("BB"))
         { x+=1;}
         
         if(s1.equals("Bb")||s1.equals("bB"))
         { y+=1;}
           if(s2.equals("Bb")||s2.equals("bB"))
         { y+=1;}
          if(s3.equals("Bb")||s3.equals("bB"))
         { y+=1;}
          if(s4.equals("Bb")||s4.equals("bB"))
         { y+=1;}
         
         
       
          if(s1.equals("bb"))
         {z +=1;}
         if(s2.equals("bb"))
         {z +=1;}
         if(s3.equals("bb"))
         {z +=1;}
         if(s4.equals("bb"))
         {z +=1;}
        double p=(100 / 4 * x);
        double p02=(100 / 4* y);
        double p03=(100 / 4 * z);
         
         System.out.println("Probability of child having black eye"+p+"%");
         System.out.println("Probability of child having grey eye"+p02+"%");
         System.out.println("Probability of child having blue eye"+p03+"%");
        
        }
            
         
        }
        void exiting()throws Exception
        {
            
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
            System.out.println("Please press E to go back to mix-matching menu");
            String back=br.readLine();
            back=back.toLowerCase();
            if(back.equals("e"))
            {
                System.out.print("\u000C");
                mix_matching obj= new mix_matching();
                obj.input();
            }
            
        
    }
    void main()throws Exception
    {
        a();
        input();
        exiting();
    }
}

           
            
            
           
            
            



         
         
        
        