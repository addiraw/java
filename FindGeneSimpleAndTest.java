import java.io.*; 

public class FindGeneSimpleAndTest

{   
    FindGeneSimpleAndTest()
    {

    }
    public String findGeneSimple(String dna)
    {   
        String result="";
        int StartIndex = dna.indexOf("atg");
        int StopIndex = dna.indexOf("taa");
        if(dna=="")  //|(dna.indexOf("atg")|dna.indexOf("taa"))==-1
        {
            System.out.println("The string is null");
            return result;

        }
        else if ((StartIndex-StopIndex)%3!=0) {
            
            System.out.println("short string");
            System.out.println(StartIndex);
            System.out.println(StopIndex);
            return result;
          
        } 
else
{
        result = dna.substring(StartIndex+3, StopIndex);
        return result;
}


    
    }
    public  static void main(String[] args)
    {   
        FindGeneSimpleAndTest newGene = new FindGeneSimpleAndTest();
        String dna = "aaatgccc#aactagattaagaaacc";
        //String dna = "atgoootaa";

        String finalResult = newGene.findGeneSimple(dna);
        System.out.println(finalResult);
    
    }
}
