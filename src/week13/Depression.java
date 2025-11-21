package week13;

public class Depression extends MentalState{
    public Depression(Student brain){
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
    public void passClass() {
        System.out.println("It was just a dream that I passed");
    }
    public void newSemester(){
        this.brain.setState(new Panic(this.brain));
    }
}
