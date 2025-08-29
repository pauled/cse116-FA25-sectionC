package week1;

public class PlusMinus {
    public static String letter(int score){
        int tens=score/10;
        if (tens>=9){
            return "A";
        } else if (tens>=8){
            return "B";
        } else if (tens>=7){
            return "C";
        } else if (tens>=6){
            return "D";
        } else{
            return "F";
        }
    }

    public static void main(String[] args) {
        String letterTemp=letter(81);

        double val=10;
        while(val>1){
            System.out.println(val);
            val/=2;
        }

        for (int x=0; x<3; x++){
            System.out.println(x);
            x--;
        }
    }
}
