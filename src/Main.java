import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int row, col;
        System.out.println("Welcome to the MainSweeper! ");
        System.out.print("Enter the row number: ");
        row= scan.nextInt();
        System.out.print("Enter the col number: ");
        col = scan.nextInt();

        MineSweeper mine = new MineSweeper(row,col);

        mine.run();
    }
}