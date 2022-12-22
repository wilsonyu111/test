package StaticAndFinal;

public class Sensors {
    static String setting = "1.1.1.1";
    static int count = 1;
    String sensor_id = "sensor-id-" + (count++);

    void printID(){
        System.out.println(sensor_id);
    }

    void generateID()
    {

    }

}
