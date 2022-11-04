import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {
        IRuner[] runners = new IRuner[]{
                new Human("Gosha", 50, 1200),
                new Human("Artyom", 30, 900),
                new Cat("Barsic", 100, 590),
                new Cat("Kesya", 9999, 1000000000),
                new Robot("T800", 100, 1400),
                new Robot("Toster", 1000, 7000)
        };;
        IObstacle[] obstacles = new IObstacle[]{
                new Track( 500),
                new Wall(25),
                new Track(900),
                new Wall(120)
        };
        for (IRuner r: runners) {
            for (IObstacle o: obstacles) {
                if(o.Contest(r)){
                    System.out.printf("%s преодолел препятствие\n", r.getName());
                }
                else {
                    break;
                }
            }
        }
    }
}