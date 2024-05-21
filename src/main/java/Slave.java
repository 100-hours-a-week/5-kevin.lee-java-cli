public class Slave {
    private int computeSkill;

    public Slave(int input) {
        this.computeSkill = input;
    }

    public int getComputeSkill() {
        return computeSkill;
    }

    public void setComputeSkill(int computeSkill) {
        this.computeSkill = computeSkill;
    }

    public void decreaseSkill() {
        if (computeSkill > 0) {
            computeSkill= computeSkill - 10;
        }
    }

    public void whipping(){
        if(this.computeSkill <= 90){
            computeSkill +=10;
        }else{
            System.out.println("Slave is angry. it was his limit");
            computeSkill -= 5;
        }
    }

    public void drug(){
        if(this.computeSkill <= 80){
            computeSkill +=20;
        }else{
            System.out.println("Slave is slept. Drug was too powerful");
            computeSkill -= 40;
        }
    }

    public void praise(){
        if(this.computeSkill <= 95){
            System.out.println("Praise breeds willingness");
            computeSkill +=5;
        }
    }

    public void beating(){
        if(this.computeSkill <= 40){
            computeSkill +=10;
        }else{
            System.out.println("Slave is knocked out. terrible outcome it is hahahha");
            computeSkill = 0;
        }
    }

    public boolean tryToSolveProblem() {
        int successChance = (int) (Math.random() * 100);
        double slaveAns;

        ShapeCalculator calculator = new ShapeCalculator();

        if(successChance >= computeSkill){
            slaveAns = calculator.run();
            return true;
        }else{
            System.out.println("Unnerved, unbalanced...");
            return false;
        }
    }
}
