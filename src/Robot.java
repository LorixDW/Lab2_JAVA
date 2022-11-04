public class Robot implements IRuner{
    private int jump_height;
    private int run_distance;
    String name;
    public Robot(String Name, int jump_dist, int run_dist) {
        this.jump_height = jump_dist;
        this.run_distance = run_dist;
        this.name = Name;
    }
    @Override
    public int Run(Track tr) {
        if(tr.getDistance() < run_distance){
            return 1;
        }
        else {
            return 0;
        }
    }
    @Override
    public int Jump(Wall wl) {
        if (wl.getHeight() < jump_height){
            return 1;
        }
        else {
            return 0;
        }
    }
    public String getName(){
        return name;
    }
    public int getJump_height() {
        return jump_height;
    }
    public int getRun_distance() {
        return run_distance;
    }
}
