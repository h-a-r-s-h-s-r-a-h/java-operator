package charvalue;

public class Mycharrunner {
    public static void main(String[] args){
        Mychar mychar = new Mychar('a');
        System.out.println(mychar.isVowel());
        System.out.println(mychar.isNumber());
        System.out.println(mychar.isAlphabet());
        mychar.printLowerCaseAlphabet();
        mychar.printUpperCaseAlphabet();
        System.out.println(mychar.isConsonant());
        mychar.print_all_lowercase();
        mychar.print_all_uppercase();
    }
}
