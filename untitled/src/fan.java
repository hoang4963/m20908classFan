public class fan{
    private boolean status = false;
    private int speed = 1;
    private double radius ;
    private String color;
    public fan(String color, double radius){
        this.radius=radius;
        this.color = color;
    }
    public void turnOn(){
        this.status = true;
    }
    public void plusSpeed(){
        if (this.status == true) {
            if (this.speed < 3)
                this.speed++;
            else if (this.speed >= 3) {
                this.speed = 3;
            }
        }
    }
    public void SubSpeed(){
        if (this.status == true) {
            if (this.speed > 0)
                this.speed--;
            if (this.speed <= 1)
                this.speed = 1;
        }
    }
    public void turnOff(){
        this.status=false;
    }
    public String showStatus(){
        if (this.status == true){
            return "Quat dang bat (toc do: " + this.speed + ", mau sac: " + this.color + ", ban kinh: " +radius ;
        }
        else
            return "quat dang tat";
    }
}