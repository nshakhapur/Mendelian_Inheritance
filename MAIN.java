import java.io.*;
class MAIN
{
    void open()throws Exception
    {
        Display_page obj=new Display_page();
        obj.main();
    }
    void display()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        
        System.out.println("\t\t\t\t\t THE GENE APP");
        System.out.println("\n\n To choose your option, just enter the serial number of your choice");
        System.out.println("1.Basics to understand the genetics: Here it gives you a clear concept about the heredity \n  and terms related to it");
        System.out.println("2.Mix-Matching: Here you can give the traits of parents and we give you the probability of traits\n  being showcased in child");
        System.out.println("3.Take up a quiz: Just a five question quiz to know your general knowledge in genetics");
        System.out.println("4.Small Family tree: To more clear idea about how the genes of parents are inherited by parents");
        System.out.println("5.FAQ's: To know the general questionings of people");
        System.out.println("6.Exit");
        int n=Integer.parseInt(br.readLine());
        System.out.println(" \u000c");
        java.lang.Thread.sleep(100);
        System.out.print("\u000C");
        double  a=(Math.random());String S="";
             if(a<0.25)
               S="\t\t  Laws Of Genetics Apply even if people dont want to Learn\n\t\t";
               if(a>0.25 && a<0.50)
               S="\t\t  Your Genetics load the Gun, but your Lifestyle pulls the trigger";
               if(a>0.50&&a<0.75)
               S="\t\t Please Genetics is not an excuse always";
               if(a>0.75&&a<1.0)
               S="\t\t If you think you understood the entire Genetics, then you have understood only 1% of it";
         for(int i=1;i<7;i++)
           { 
               System.out.println(S);
             for(int j=1;j<=11;j++)
                {
                  System.out.print("*");
                  Thread.sleep(70);
                }
                Thread.sleep(10);
             System.out.print("\u000C");
           }
           System.out.print("\u000C");
        switch(n)
        { case 1:
          definitions o= new definitions();
             o.main();
            break;
            
           case 2:
            
                mix_matching ob=new mix_matching();
                ob.input();
            break;
           case 3:
                quiz obj=new quiz();
                obj.QUIZ_menu();
            break;
            case 4:family_tree objc=new family_tree();
            objc.main();
            break;
            
            case 5:
            FAQs obt=new FAQs();
            obt.main();
            break;
                
            
            case 6:
             System.out.print("\u000C");
               end object=new end();
               object.a();
              
               break;
                
    
    
}
}

void main()throws Exception
{
    open();
    display();
}
}

    