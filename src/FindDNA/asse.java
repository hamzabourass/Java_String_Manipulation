package FindDNA;

public class asse {
    public void findAbc(String input){
        int index = input.indexOf("abc");
        System.out.println(index);
        while (true){
            if (index == -1 || index >= input.length() - 3){
                break;
            }
            System.out.println(index);

            String found = input.substring(index+1, index+4);
            System.out.println(found);

            index = input.indexOf("abc",index+4);

        }

    }

    public void test(){
        //findAbc("abcd");
        findAbc("abcdkfjsksioehgjfhsdjfhsdfhksdfhuwabcabcajfieowj");
    }
}
