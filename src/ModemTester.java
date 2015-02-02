public class ModemTester{
    public static void main(String[] args){
        CableModem surfboard = new CableModem();
        DslModem gateway = new DslModem();
        
        surfboard.speed = 500000;
        gateway.speed = 400000;
        
        System.out.println("Trying the cable modem:");
        surfboard.displaySpeed();
        surfboard.connect();
        
        System.out.println("Trying the DSL modem");
        gateway.displaySpeed();
        gateway.connect();
    }
}