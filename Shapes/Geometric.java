
package supersub;


public class Geometric {
    private String color;
    private String name;
    private boolean filledIn;
    public Geometric(){
        color = "red";
        name = "Shape";
        filledIn = false;
    }
    public Geometric(String c, String n, boolean fI){
        color = c;
        name = n;
        filledIn = fI;
    }
    public void setColor(String c){
        color =c;
        
    }
    public void setName(String n){
        name = n;
    }
    public void setFilledIn(boolean fI){
        filledIn = fI;
    }
    public String getColor() {
        return color;
    }
    public String getName(){
        return name;
    }
    public boolean getFilledIn(){
        return filledIn;
    }
}
