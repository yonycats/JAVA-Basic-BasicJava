package codingtest;
import java.util.Scanner;

public class BirthdayMessage {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("이름을 입력해주세요 🖥️: ");
        String name = scanner.nextLine();
        System.out.println();
        
        System.out.println(""
        		+ "        _   _   ___  ______ ______ __   __\r\n"
        		+ "       | | | | / _ \\ | ___ \\| ___ \\\\ \\ / /\r\n"
        		+ "       | |_| |/ /_\\ \\| |_/ /| |_/ / \\ V / \r\n"
        		+ "       |  _  ||  _  ||  __/ |  __/   \\ /  \r\n"
        		+ "       | | | || | | || |    | |      | |  \r\n"
        		+ "       \\_| |_/\\_| |_/\\_|    \\_|      \\_/  \r\n"
        		+ "");
        System.out.println("\r\n"
        		+ "______  _____ ______  _____  _   _ ______   ___  __   __\r\n"
        		+ "| ___ \\|_   _|| ___ \\|_   _|| | | ||  _  \\ / _ \\ \\ \\ / /\r\n"
        		+ "| |_/ /  | |  | |_/ /  | |  | |_| || | | |/ /_\\ \\ \\ V / \r\n"
        		+ "| ___ \\  | |  |    /   | |  |  _  || | | ||  _  |  \\ /  \r\n"
        		+ "| |_/ / _| |_ | |\\ \\   | |  | | | || |/ / | | | |  | |  \r\n"
        		+ "\\____/  \\___/ \\_| \\_|  \\_/  \\_| |_/|___/  \\_| |_/  \\_/  \r\n"
        		+ "                                                        \r\n"
        		+ "                                                        \r\n"
        		+ "");

        
        for (int i = 3; i > 0; i--) {
            System.out.print(i + "\t");
            Thread.sleep(1000);
        }

        for (int i = 0; i<2; i++) {        	
        	System.out.println();
        }
        

        String[] messages = {
            "생일 축하합니다~ 생일 축하합니다~",
            "사랑하는 " + name + "(언니)",
            "생일 축하합니다~",
            "와아아아아~~",
            "생일축하해용 라뷰❤️😘"
        };

        
        for (String message : messages) {
            printWithDelay(message, 250);
        }
    }

    public static void printWithDelay(String message, long delay) throws InterruptedException {
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
            Thread.sleep(delay);
        }
        System.out.println();
    }
}