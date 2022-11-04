import javax.naming.Name;

public class Wall implements IObstacle{
    private int height;

    public Wall(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    @Override
    public boolean Contest(IRuner runer){
        if (runer.Jump(this) == 1){
            return true;
        }
        else {
            return false;
        }
    }
}
