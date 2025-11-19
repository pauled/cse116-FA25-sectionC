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
}
