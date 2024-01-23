package FindDNA;

import java.lang.reflect.Array;

public class AllCodons {
    public int findStopGene(String dna, int startCodon, String stopCodon) {

        int currIndex = dna.indexOf(stopCodon, startCodon + 3);
        while (currIndex != -1) {
            if ((currIndex - startCodon) % 3 == 0) {
                return currIndex;
            } else {
                currIndex = dna.indexOf(stopCodon, currIndex + 1);
            }
        }
        return dna.length();
    }

    public String findGene(String dna) {
        int minIndex = 0;
        int startCodon = dna.indexOf("ATG");
        if (startCodon == -1) {
            return "there is no start for the gen";
        }
        int taaIndex = findStopGene(dna, startCodon, "TAA");
        int tagIndex = findStopGene(dna, startCodon, "TAG");
        int tgaIndex = findStopGene(dna, startCodon, "TGA");
        if (taaIndex < tagIndex && taaIndex < tgaIndex ){
            minIndex = taaIndex;
        }
        else if (tagIndex < taaIndex && tagIndex < tgaIndex ){
            minIndex = tagIndex;
        }
        else minIndex = tgaIndex;

        return dna.substring(startCodon, minIndex +3);



    }

    public void testing() {
        String dna = "ATGTAATGATAATGCCCTGATAGTGACCTGAATGATAG";
        String gene = findGene(dna);
        System.out.println("the shortest gene is : " + gene);

    }
}










