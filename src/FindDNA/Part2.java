package FindDNA;

public class Part2 {
    public int howMany(String stringa, String stringb){
       int currIndex = stringb.indexOf(stringa);
        int count = 0;
        while (true){
            if (currIndex == -1){
                break;
            }
            count++;
            currIndex = stringb.indexOf(stringa,currIndex + stringa.length());

        }
        return count;

    }
    public void testHow(){
        String str1 ="ATGAACGAATTGAATC";
        String str2 = "ATAAAA";
        int howmany = howMany("GAA", str1);
        System.out.println("the is " + howmany);
        int howmany2 = howMany("AA", str2);
        System.out.println("there is : " + howmany2);

    }
}
