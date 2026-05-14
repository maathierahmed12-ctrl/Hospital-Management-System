package Utils;

import java.util.Scanner;

public class InputHandler {

    private Scanner input;

    public InputHandler() {

        input = new Scanner(System.in);
    }

    public int readInt(String message) {

        System.out.print(message);

        return input.nextInt();
    }

    public double readDouble(String message) {

        System.out.print(message);

        return input.nextDouble();
    }

    public String readString(String message) {

        System.out.print(message);

        return input.next();
    }

    public String readLine(String message) {

        System.out.print(message);

        input.nextLine();

        return input.nextLine();
    }

    public boolean readBoolean(String message) {

        System.out.print(message);

        return input.nextBoolean();
    }
}
