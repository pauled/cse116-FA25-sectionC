package week13;

public class Chillin extends MentalState{
    public Chillin(Student brain){
        super(brain);
    }
    public  void study(){
        System.out.println("I am such a good student I study without classes");
    }
    public  void getCloserExam(){
        System.out.println("I am so good I take exam even when done");
    }
    public  void expressFeelings(){
        System.out.println("I am done");
    }
}
