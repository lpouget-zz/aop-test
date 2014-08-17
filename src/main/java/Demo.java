/**
 * Created by laurent on 17/08/14.
 */
public class Demo {
    Integer id;
    String name;

    @Stats
    Demo(Integer id, String name) {
        this.id = id;
        this.name = name;

        System.out.println("I'm here");
    }
}
