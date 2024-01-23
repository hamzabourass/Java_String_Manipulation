package FindDNA;

public class Part3 {

    public boolean TwoOccurences(String stringa, String stringb){
        int count = 0;
        int i=0;
        int position;
        do {
            position = stringb.indexOf(stringa);
            count++;
            stringb = stringb.substring(position+stringa.length());
        }while(stringb.contains(stringa));
        if (count > 1){ return true;}
        else return false;
    }
    public String lastPart(String stringa , String stringb){
        int position;
        position = stringb.indexOf(stringa);
        if (position == -1 ){
            return stringb;
        }
        else return stringb.substring(position + stringa.length());
    }


    public void testing(){
        String str = "bgabtagteve";
        boolean two = TwoOccurences("agt",str);
        String exist = lastPart("agt",str);
        System.out.println(two);
        System.out.println(exist);  }




}
