import java.io.*;
class Display_page
{
    void opening_page()
    {
        System.out.println("                   ______________________");
        System.out.println("                   |    | |  INDIA       |   ");
        System.out.println("                   |____| |______________|");
        System.out.println("                   |----| |--------------|");
        System.out.println("                   |    | |  DENMARK     |");
        System.out.println("                   |____|_|______________|");
        
        
        
        
        
           
       System.out.println("                     INDO-DANISH ASSOCIATION OF SCIENCE");
                             
       System.out.println("                     \n\n ");
       System.out.println("                               PRESENTS...");
       System.out.println("\n\n\n\n Note:The name of association is fictional, created only for project purposes");
    }
    static void time()throws Exception
    {  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Thread.sleep(4500);
        System.out.println(" \u000c");
    }
        
    void display_app()throws Exception
    {
        
     
    

System.out.println("                                 O------O");
System.out.println("                                  O----O");
System.out.println("                                   O--0");
System.out.println("                                    OO");
System.out.println("                                    OO");
System.out.println("                                   O--O");
System.out.println("                                  O-THE-O");
System.out.println("                                 O--GENEO");
System.out.println("                                 O--APP-O");
System.out.println("                                  O----O");
System.out.println("                                   O--O");
System.out.println("                                    OO");
System.out.println("                                    OO");
System.out.println("                                   O--O");
System.out.println("                                  O----O");
System.out.println("                                 O------O");
System.out.println("                                 O------O                                         ");
     System.out.println("THE GENE APP: First App to find heredities of a human");
     Thread.sleep(4500);
     System.out.println(" \u000c");
    }
     void main()throws Exception
    {  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        opening_page();
        time();
        display_app();
        MAIN obj=new MAIN();
        obj.display();
}
}

    
    