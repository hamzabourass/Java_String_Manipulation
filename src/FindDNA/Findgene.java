package FindDNA;

public class Findgene {
    public String findSimpleGene(String dna , int startCodon, int stopCodon){
        dna = dna.toUpperCase();
        if(startCodon == -1){
            return "the gen doesnt exist";
        }
        if(stopCodon  == -1 ){
            return "the gen doesnt exist";
        }
        if((stopCodon-startCodon)%3 == 0){
            return dna.substring(startCodon, stopCodon+3);
        }
        else return "the gen doesnt exist";
    }
    public void testSimpleGene(){
        String dna = "ATGGTACCGTTAA";
        dna = dna.toLowerCase();
        int startCodon = dna.indexOf("ATG");
        int stopCodon = dna.indexOf("TAA");
        String gen = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("the dna is : "+ dna);
        System.out.println(gen);
        System.out.println("----------------------------");
        dna = "ATG";
        startCodon = dna.indexOf("ATG");
        stopCodon = dna.indexOf("TAA");
        gen = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("the dna is : "+ dna);
        System.out.println(gen);
        System.out.println("----------------------------");
        dna = "TAA";
        startCodon = dna.indexOf("ATG");
        stopCodon = dna.indexOf("TAA");
        gen = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("the dna is : "+ dna);
        System.out.println(gen);
        System.out.println("----------------------------");
        dna = "ATGTAA";
        startCodon = dna.indexOf("ATG");
        stopCodon = dna.indexOf("TAA");
        gen = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("the dna is : "+ dna);
        System.out.println(gen);

    }
}