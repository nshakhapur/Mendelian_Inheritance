



import java.io.*;
class definitions

{
    public static void main()throws Exception
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Genetics is a field of biology that studies how traits are passed from parents to their offspring. The passing of traits from parents to");
System.out.println(" offspring is known as heredity,therefore, genetics is the study of heredity.Heredity is what makes children look like their parents.");
  System.out.println("Gregor Mendel is known as Father of Genetics.");
  System.out.println();
  Thread.sleep(6000);
System.out.println("The fun way to learn a little about genetics is to understand heredity first hand, your own heredity;");
System.out.println("and you can do that by examining the actual dominant and recessive traits that you possess.");
System.out.println("Genes are the basic unit of heredity. The genes of an individual are determined by their parent or parents.");
System.out.println("Different forms of the same gene are called alleles. For each gene, a human can have two different alleles or two of the same"); 
System.out.println("alleles – one from each parent.");
System.out.println("For example, if your mother has black eyes and your father has blue eyes (non-black), you may have ended up with black eyes.");
System.out.println("Your father's blue eyes are a recessive trait, and although you have an allele for blue eyes, the black eye allele is dominant"); 
System.out.println("that you received from your mother, and thus you have got black eyes. ");
 System.out.println();
  Thread.sleep(6000);
System.out.println("Now lets take a look in what way an allele of gene is present");
System.out.println("Allele of dominant trait is represented by capital letter while a recessive trait is represented in small letters");
System.out.println("For example, black eye allele(trait)is dominant hence is represented as BB");
System.out.println("             blue eye allele(trait)is recessive hence is represented bb");
 System.out.println();
  Thread.sleep(6000);
System.out.println("Dominant trait expresses itself in child even when it is present in single form i.e, for example Bb,");
System.out.println("in this Case there is single form of dominant and recessive trait, hence dominant trait shows up andrecessive trait also shows up slightly");
System.out.println("so the child gets brown eyes. Well this is not true in all the cases, such as left-right handedness. It is true in traits involving colours such as eye/hair colour ");
System.out.println("To study the distribution of traits in children, we use Punnett pattern/square");

System.out.println("An example of black&blue colour of eye:");
System.out.println("                           PUNNETT PATTERN(SQUARE)");
         System.out.println("                     ♂|♀|  B  | B" );
         
         System.out.println("                    b   |  Bb  |  Bb");
         System.out.println("                    b   |  Bb  |  Bb");
          System.out.println();
  Thread.sleep(6000);
         System.out.println("How to use punnett square?");
         System.out.println("The letters of allele of one parent separate and join with a letter of an allele of another parent.");
         System.out.println("One letter from father's allele( ♂)join to another letter from mother's allele(♀)");
          System.out.println("The new combination of the two letters form the child's gene");
           System.out.println("Horizontal line(♀|  B  | B)represents mother's allele");
          System.out.println("Vertical line(♂)  represents father's allele"); 
          System.out.println("             (b)");
          System.out.println("             (b)");
           System.out.println();
  Thread.sleep(6000);
          System.out.println("While studying the father/mother-linked diseases, we represent the distribution of alleles using XX/XY.");
          System.out.println("So what are they?");
          System.out.println("XX represents the female(daughter/mother) while XY represents the male(son/father).");
          System.out.println("We use '°' to represent the presence of genes of the disease");
          System.out.println("Females are the carriers i.e, they sometimes donot show up the disease, but carry the disease.They are represented as X°X");
          System.out.println("Males can never be carriers,if they are represented as X°Y or XY°, that means they have the disease and show its symptoms");
          
  System.out.println();
  Thread.sleep(3000);
System.out.println("In this application, you get to study about the types of traits you can inherit from parents.");
System.out.println("NOW IF YOU ARE READY JUST GIVE IT A GO BY PRESSING ENTER");
String s=br.readLine();
if(s.equals(""))
{

        
            System.out.println(" \u000c");
            MAIN obj=new MAIN();
            obj.display();
            
        
    }
}
}

        