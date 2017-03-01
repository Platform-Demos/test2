/**
 * @author : Padmaka Wijayagoonawardena
 * @date : 3/1/17
 */
public class Main {
    private static Main ourInstance = new Main();

    public static Main getInstance() {
        return ourInstance;
    }

    private Main() {
    }
}
