import java.util.Scanner;

public class Interface {

    Scanner sc = new Scanner(System.in);

    public void startup() {
        boolean programInUse = true;

        System.out.println("Welcome to Martins data sheet reader!");
        System.out.println("whould you like to read the data sheet in the data folder?");


        while (programInUse) {
            System.out.println("--------------------- ");
            System.out.println("1 to read data sheet");
            System.out.println("2 to quit program");

            String input;

            input = sc.nextLine().toLowerCase();

            switch (input) {
                case "1":
                    FileHandler handler = new FileHandler();
                    handler.loadData();
                    break;

                case "2":
                        programInUse = false;
                    break;

                default:
                    System.out.println(input + " is not a valid user input");
                    break;
            }
        }
    }
}
