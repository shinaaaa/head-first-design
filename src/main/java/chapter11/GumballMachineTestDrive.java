package chapter11;

import java.rmi.Naming;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = null;
        String location = "Ausein";
        int count = 12;
//        if (args.length < 2) {
//            System.out.println("GumballMachine <name> <inventory>");
//            System.exit(1);
//        }
//        count = Integer.parseInt(args[1]);
//        GumballMachine gumballMachine = new GumballMachine(args[0], count);
        try {
            gumballMachine = new GumballMachine(location, count);
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
