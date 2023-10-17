package commandPattern;

import java.util.Scanner;

public class ViewerApp {

    public static void main (String[] args) {

        Tv tv = new Tv();
        Aircon acCommand = new Aircon();
        Aircon aircon;
        Fan fanCommand = new Fan();
        Fan fan;
        Scanner s = new Scanner(System.in);
        int choice;


        do {
            RemoteControl rc = new RemoteControl();

            PowerOn powerOn = new PowerOn(tv);
            PowerOff powerOff = new PowerOff(tv);

            System.out.println("1. Turn on TV: ");
            System.out.println("2. Turn off TV: ");
            System.out.println("3. Turn on aircon: ");
            System.out.println("4. Turn off aircon: ");
            System.out.println("5. Increase temperature: ");
            System.out.println("6. Dncrease temperature: ");
            System.out.println("7. Turn on Fan: ");
            System.out.println("8. Turn off Fan: ");
            System.out.println("9. Increase Fan Speed: ");
            System.out.println("10. Decrease Fan Speed: ");
            System.out.println("11. EXIT: \n");
            System.out.print("Select a command: ");
            choice = s.nextInt();

            if (choice == 1)
            {
                System.out.println(powerOn.execute()+"\n");
            }
            else if (choice == 2)
            {
                System.out.println(powerOff.execute()+"\n");
            }
            else if (choice ==3)
            {
                System.out.println(acCommand.turnOn()+"\n");
            }
            else if (choice ==4)
            {
                System.out.println(acCommand.turnOff()+"\n");
            }else if (choice == 5)
            {
                System.out.println(acCommand.tempInc()+"\n");
            }
            else if (choice ==6)
            {
                System.out.println(acCommand.tempDec()+"\n");
            }
            else if (choice ==7)
            {
                System.out.println(fanCommand.turnOnFan()+"\n");
            }else if (choice == 8)
            {
                System.out.println(fanCommand.turnOffFan()+"\n");
            }
            else if (choice ==9)
            {
                System.out.println(fanCommand.IncSpeedFan()+"\n");
            }
            else if (choice ==10)
            {
                System.out.println(fanCommand.DecSpeedFan()+"\n");
            }
            else if (choice >=11)
            {
                System.out.println("INVALID");
            }
        }
        while(choice !=11);
        System.out.println("EXITING");
    }
}
