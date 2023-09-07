package charvalue;

public class Mychar {

    private char ch;

    Mychar(char letter){
        this.ch = letter;
    }

    boolean isVowel(){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
        ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        else{
            return false;
        }
    }

    boolean isNumber(){
        if(ch<=57 && ch>=48){  // between 0 and 9
            return true;
        }
        return false;
    }

    boolean isAlphabet(){
        if(ch<=90 && ch>=65){  //between 'A' and 'Z'
            return true;
        }
        if(ch<=122 && ch>=97){  // between 'a' and 'z'
            return true;
        }
        else{
            return false;
        }
    }

    void printLowerCaseAlphabet(){
        if(ch<=122 && ch>=97){  // between 'a' and 'z'
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    void printUpperCaseAlphabet(){
        if(ch>=65 && ch<=90){    //between 'A' and 'Z'
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    boolean isConsonant(){
        if(isAlphabet() && !isVowel()){
            return true;
        }
        else{
            return false;
        }
    }

    void print_all_lowercase(){
        for(char c=97; c<=122; c++){  // between 'a' and 'z'
            System.out.println(c);
        }
    }

    void print_all_uppercase(){
        for(char d=65; d<=90; d++){  //between 'A' and 'Z'
            System.out.println(d);
        }
    }
}
