  public class Drone{
    int droneId;
    int batteryPercentage;
    int range;
    static String companyName = "Asmaa";

    public Drone(int droneId,int batteryPercentage , int range){
        this.droneId=droneId;
        this.batteryPercentage=batteryPercentage;
        this.range=range;
    }

    public void startDelivery(){
        if(batteryPercentage>=20){
            System.out.println("delivery started!");
        }else if(batteryPercentage<20){
            System.out.println("can not deliver, battery low!");
        }else{
            System.out.println("System error");
        }
    }

    public void displayStatus(){
        System.out.println("droneId" + droneId);
        System.out.println("batteryPercentage"+ batteryPercentage);
        System.out.println("companyName"+ companyName);
        // System.out.println();
    }

    public void trackStatus(){
        if(range<=50){
            System.out.println("just out for delivery");
        }else if(range>=50 && range<=200){
            System.out.println("have patience");
        }else{
            System.out.println("soon outside your doorstep");
        }

    }

    public static void main(String[] args){

        Drone d1 = new Drone(101, 0,50);
        Drone d2 = new Drone(102, 20,101);
        Drone d3 = new Drone(100,19,220 );
        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        System.out.println(" Drone Status ");

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();

        System.out.println("location");
        d1.trackStatus();
        d2.trackStatus();
        d3.trackStatus();
    }

}
