package week13;

public abstract class MentalState {
    protected Student brain;

    public MentalState(Student brain){
        this.brain=brain;
    }
    public abstract void study();
    public abstract void getCloserExam();
    public abstract void expressFeelings();
    public void passClass(){
        this.brain.setState(new Chillin(brain));
    }
    public void failClass(){
        this.brain.setState(new Depression(brain));
    }
    public void newSemester(){
        System.out.println("My head space hasn't changed");
    }
}
