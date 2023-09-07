package puzzle;

public class running_allmethod_in_one_main {
    public static void main(String[] args){
        puzzle1();  //running puzzle1
        puzzle2();  //running puzzle2
    }
    public static void puzzle1(){
        int i = 25;
        if(i<50){
            System.out.println("puzzle1 line 1 running");
        }
        else if(i>50){
            System.out.println("puzzle1 line2 running");
        }
        else{
            System.out.println("else line is running");
        }
    }

    public static void puzzle2(){
        int j = 200;
        if(j<70){
            System.out.println("puzzle2 line1");
        }
        else if(j>70){
            System.out.println("puzzle2 line2");
        }
    }
}
