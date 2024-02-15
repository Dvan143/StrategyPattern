class Main {
    public static void main(String[] args) {
    }
}
interface ITransport{
    void startEngine();
}
class Transport implements ITransport {
    private int maxSpeed;
    private boolean engineCanWork;
    private int weight;
}
class Auto extends Transport {
    private int wheels;
    @Override
    public void startEngine(){
        //
    }
    public Auto(int maxSpeed, boolean engineCanWork, int weight, int wheels){
    }
}
class Train extends Transport {
    private boolean onRailway;
    public void startEngine(){
        //
    }
    public Train(int maxSpeed, boolean engineCanWork, int weight, boolean onRailway){
    }
}
class Helicopter extends Transport {
    private boolean inAir;
    public void startEngine(){
        //
    }
    public Helicopter(int maxSpeed, boolean engineCanWork, int weight, boolean inAir){
    }
}
