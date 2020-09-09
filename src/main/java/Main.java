import processing.core.PApplet;

public class Main extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Main");
    }
    String[] data;
    String[] liste;
    @Override
    public void setup() {
        super.setup();
       data =loadStrings("business.csv");

        for(int i =0;i<data.length;i++){
          println(data[i]);
         liste = split(data[i],",");
          println(liste[liste.length-2]);
        }
    }
}
