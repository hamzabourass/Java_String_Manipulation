package FindDNA;

public class Part1 {
    public String findSimpleGen(String dna){

        int StartCodon =dna.indexOf("ATG");
        if(StartCodon == -1){
            return "the gen doesnt exist";
        }
        int StopCodon = dna.indexOf("TAA", StartCodon+3);
        if(StopCodon  == -1 ){
            return "the gen doesnt exist";
        }
        if((StopCodon-StartCodon)%3 == 0){
            return dna.substring(StartCodon, StopCodon+3);
        }
        else return "the gen doesnt exist";
    }
    public void testSimpleGene(){
        String dna = "ATGGTACCGTTAA";
        String gen = findSimpleGen(dna);
        System.out.println("the dna is : "+ dna);
        System.out.println(gen);
        System.out.println("----------------------------");
        dna = "ATG";
        gen = findSimpleGen(dna);
        System.out.println("the dna is : "+ dna);
        System.out.println(gen);
        System.out.println("----------------------------");
        dna = "TAA";
        gen = findSimpleGen(dna);
        System.out.println("the dna is : "+ dna);
        System.out.println(gen);
        System.out.println("----------------------------");
        dna = "ATGTAA";
        gen = findSimpleGen(dna);
        System.out.println("the dna is : "+ dna);
        System.out.println(gen);

    }

}
