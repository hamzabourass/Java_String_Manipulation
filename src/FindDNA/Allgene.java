package FindDNA;

public class Allgene {

    public int findStopGene(String dna, int startCodon, String stopCodon) {

        int currIndex = dna.indexOf(stopCodon, startCodon + 3);
        while (currIndex != -1) {
            if ((currIndex - startCodon) % 3 == 0) {
                return currIndex;
            } else {
                currIndex = dna.indexOf(stopCodon, currIndex + 1);
            }
        }
        return -1;
    }
    public String findGene(String dna, int where) {
        int minIndex = dna.length();
        int startCodon = dna.indexOf("ATG", where);
        if (startCodon == -1) {
            return "";
        }
        int taaIndex = findStopGene(dna, startCodon, "TAA");
        int tagIndex = findStopGene(dna, startCodon, "TAG");
        int tgaIndex = findStopGene(dna, startCodon, "TGA");
        if (taaIndex != -1 && taaIndex < minIndex) {
            minIndex = taaIndex;
        }
        if (tagIndex != -1 && tagIndex < minIndex) {
            minIndex = tagIndex;
        }
        if (tgaIndex != -1 && tgaIndex < minIndex) {
            minIndex = tgaIndex;
        }
        if (minIndex != dna.length()) {
            return dna.substring(startCodon, minIndex + 3);
        } else {
            return "";
        }
        }




    public void printAllgenes(String dna) {
        int startIndex = 0;
        String gene;
        while (true) {
            gene = findGene(dna, startIndex);
            if (gene.isEmpty()) {
                break;
            }
            System.out.println(gene);
            startIndex = dna.indexOf(gene, startIndex) + gene.length();
        }
    }
    public  int countGenes(String dna){
        int startIndex = 0;
        String gene; int count = 0;
        while (true) {
            gene = findGene(dna, startIndex);
            if (gene.isEmpty()) {
                break;
            }
            startIndex = dna.indexOf(gene, startIndex) + gene.length(); count++;
        } return count;
    }

    public void testing() {
        String dna = "AATGCTAACTAGCTGACTAAT";
       System.out.println(countGenes(dna)); printAllgenes(dna);
    }
}
