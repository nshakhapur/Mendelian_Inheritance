import java.io.*;
class Blood_grp
 {
     String a1,a2,a3,a4,b1,b2,b3,b4;
    
   
    void input()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("                               MIX-MATCHING");
        System.out.println("Blood Groups that can be entered are A, B, AB and O (Please Donot Include Negative or Positive) ");
         
        
        System.out.println("Enter Mother's Blood Group");
        
        
        String h1=br.readLine();
        String p1="";
        String t1="A";
        String t2="B";
        String t3="AB";
        String t4="O";
        h1=h1.toUpperCase();
        
        if(h1.equals(t1))
         {p1="AA";}
       else if(h1.equals(t2))
         {
             p1="BB";
            }
        else  if(h1.equals(t3))
         {p1="AB";}
         else  if(h1.equals(t4))
         {p1="OO";}
         else
         {System.out.println("Invalid Entry");
             System.out.println("Please enter blood group again");
             h1=br.readLine();h1=h1.toUpperCase();
             if(h1.equals(t1))
         {p1="AA";}
       else if(h1.equals(t2))
         {
             p1="BB";
            }
        else  if(h1.equals(t3))
         {p1="AB";}
         else  if(h1.equals(t4))
         {p1="OO";}
        }
        
         char a1=p1.charAt(0);
         char a2=p1.charAt(1);
        
       
   
        
         System.out.println("Enter Father's Blood Group");
        
        
        String h2=br.readLine();
        
        h2=h2.toUpperCase();
        String p2="";
        
         if(h2.equals(t1))
         {p2="AA";}
       else if(h2.equals(t2))
         {
             p2="BB";
            }
        else  if(h2.equals(t3))
         {p2="AB";}
         else  if(h2.equals(t4))
         {p2="OO";}
         else
         {System.out.println("Invalid Entry");
             System.out.println("Please enter blood group again");
             h1=br.readLine();h1=h1.toUpperCase();
             if(h2.equals(t1))
         {p2="AA";}
       else if(h1.equals(t2))
         {
             p2="BB";
            }
        else  if(h1.equals(t3))
         {p2="AB";}
         else  if(h1.equals(t4))
         {p2="OO";}
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
         System.out.println("AA/AO/OA-Blood Group A");
         System.out.println("BB/BO/OB-Blood Group B");
         System.out.println("AB-Blood Group AB");
         System.out.println("OO-Blood Group O");
         System.out.println();
         System.out.println();
         
         int x=0;int y=0;
         int z=0,z2=0;
         
         
         
         
         
        
         
         if(s1.equals("BB")||s1.equals("OB")||s1.equals("BO"))
         { x+=1;}
           if(s2.equals("BB")||s2.equals("OB")||s2.equals("BO"))
         { x+=1;}
          if(s3.equals("BB")||s3.equals("OB")||s3.equals("BO"))
         { x+=1;}
          if(s4.equals("BB")||s4.equals("OB")||s4.equals("BO"))
         { x+=1;}
         
         if(s1.equals("AA")||s1.equals("AO")||s1.equals("OA"))
         { y+=1;}
           if(s2.equals("AA")||s2.equals("AO")||s2.equals("OA"))
         { y+=1;}
          if(s3.equals("AA")||s3.equals("AO")||s3.equals("OA"))
         { y+=1;}
          if(s4.equals("AA")||s4.equals("AO")||s4.equals("OA"))
         { y+=1;}
         
         
       
          if(s1.equals("AB")||s1.equals("BA"))
         {z +=1;}
         if(s2.equals("AB")||s2.equals("BA"))
         {z +=1;}
         if(s3.equals("AB")||s3.equals("BA"))
         {z +=1;}
         if(s4.equals("AB")||s4.equals("BA"))
         {z +=1;}
         
         
          if(s1.equals("OO"))
         {z2 +=1;}
         if(s2.equals("OO"))
         {z2 +=1;}
         if(s3.equals("OO"))
         {z2 +=1;}
         if(s4.equals("OO"))
         {z2 +=1;}
         
         
        double p=(100 / 4 * x);
        double p02=(100 / 4* y);
        double p03=(100 / 4 * z);
        double p04=(100 /4 *z2);
         
        if((h1.equals("A")&&h2.equals("AB")))
         {System.out.println("Probability of child having blood group A 50%");
        
         System.out.println("Probability of child having blood group B 0%");
         System.out.println("Probability of child having blood group AB 50%");
         System.out.println("Probability of child having blood group O 0%");
        }
        else if((h1.equals("AB")&&h2.equals("A")))
         {System.out.println("Probability of child having blood group A 50%");
        
         System.out.println("Probability of child having blood group B 0%");
         System.out.println("Probability of child having blood group AB 50%");
         System.out.println("Probability of child having blood group O 0%");
        }
        
        else{
         System.out.println("Probability of child having blood group A "+p02+"%");
        
         System.out.println("Probability of child having blood group B "+p+"%");
         System.out.println("Probability of child having blood group AB "+p03+"%");
         System.out.println("Probability of child having blood group O "+p04+"%");
         
        
        }
        
    
       
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
        input();
       
    }
}

           
            
            
           
            
            



         
         
        
        