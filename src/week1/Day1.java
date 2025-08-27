package week1;
//here works
public class Day1 {
    /*
    I am a multiline comment
     */
    public static double multiplyByTwo(double input){
        double num=input*2;
        return num;
    }
    public static void main(String[] args) {
        System.out.println("Look, I can type!");//I am an inline comment
        int num=4;
        double num2=2.4;
        num=8;
        String str1="A String";
        double num3=6.0/4.0;
        System.out.println("num3 is: "+num3);
        double temp=multiplyByTwo(3.3);
        System.out.println(temp);
        temp=multiplyByTwo(4);
        System.out.println(temp);
    }
}
