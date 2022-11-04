public class Track implements IObstacle{
    private int distance;
    public Track( int distance) {
        this.distance = distance;
    }
    public int getDistance(){
        return this.distance;
    }
    @Override
    public boolean Contest(IRuner runer){
        if(runer.Run(this) == 1){
            return true;
        }
        else {
            return false;
        }
    }
}
