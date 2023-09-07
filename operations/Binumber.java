package operations;

public class Binumber {
    private int first_number;
    private int second_number;

    Binumber(int first_input, int second_input){
        this.first_number = first_input;
        this.second_number = second_input;
    }

    int add(){
        return (first_number + second_number);
    }

    int multiply(){
        return (this.first_number * this.second_number);
    }

    void double_numbers(){
        System.out.println(2*first_number);
        System.out.println(2*second_number);
    }

    int get_Number1(){
        return this.first_number;
    }

    int get_number2(){
        return this.second_number;
    }
}
