package week5;

public class MultiplyTestCase {
    private int inputOne;
    private int inputTwo;
    private int expectedOutput;

    public MultiplyTestCase(int in1,int in2,int out){
        this.inputOne=in1;
        this.inputTwo=in2;
        this.expectedOutput=out;
    }
    public int getInputOne(){
        return this.inputOne;
    }
    public int getInputTwo(){
        return this.inputTwo;
    }
    public int getExpectedOutput(){
        return this.expectedOutput;
    }
}
