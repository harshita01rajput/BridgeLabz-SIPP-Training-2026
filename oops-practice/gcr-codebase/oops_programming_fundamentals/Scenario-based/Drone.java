  public class Drone{
    int droneId;
    int batteryPercentage;
    static String companyName = "Asmaa";

    public Drone(int droneId,int batteryPercentage){
        this.droneId=droneId;
        this.batteryPercentage=batteryPercentage;
    }

    public void startDelivery(){
        if(batteryPercentage>20){
            System.out.println("delivery started!");
        }else{
            System.out.println("can not deliver, battery low!");
        }
    }

    public void displayStatus(){
        System.out.println("droneId" + droneId);
        System.out.println("batteryPercentage"+ batteryPercentage);
        System.out.println("companyNmae"+ companyName);
        System.out.println();
    }

    public static void main(String[] args){

        Drone d1 = new Drone(101, 80);
        Drone d2 = new Drone(102, 60);
        Drone d3 = new Drone(100,200);
        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        System.out.println(" Drone Status ");

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
    }

}
