import java.util.InputMismatchException;
import java.util.Scanner;

public class TikTatToe {

    String player1;

     char emptySpace = 'z';
    String player2;
    private Boolean player1Move = true;
    private Boolean player2Move = false;
    private int slots = 9;
    Scanner scanner;

    char [][] board = new char[3][3];

    public TikTatToe(String player1, String player2)
    {
        this.player1 = player1;
        this.player2 = player2;
        initializeBoard();
        System.out.println("welcome to tick tak toe");
        System.out.println("enter coordinate in the console to start the game!");
        this.scanner = new Scanner(System.in);
    }

    private void getPlayerMove()
    {
        if (this.player1Move)
        {
//            player 1 user X
            System.out.println("please enter move for " + this.player1);
            makeMove('x');
        }
        else
        {
//            player 2 uses O
            System.out.println("please enter move for " + this.player2);
            makeMove('o');
        }
        this.player2Move = !this.player2Move;
        this.player1Move = !this.player2Move;
        this.slots -=1;
    }

    private Boolean checkExists(int row, int col)
    {
        if ((row < 3 && row >= 0) && (col < 3 && col >= 0) )
        {
           if  (this.board[col][row] == emptySpace)
           {
               return true;
           }
            System.out.println("position already taken, pick another one");
        }
        else
        {
            System.out.println("invalid position");
        }


        return false;
    }

    private void makeMove(char marker)
    {
        int row;
        int col;
        do
        {
            try {
                System.out.println("enter row");
                row = scanner.nextInt();
                System.out.println("enter column");
                col = scanner.nextInt();
            } catch (Exception InputMismatchException)
            {
                row = -1;
                col = -1;
                System.out.println("invalid coordinate");
            }

        } while (!this.checkExists(row, col));
        this.board[col][row] = marker;
    }

    private void printBoard()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j <3; j++)
            {
                System.out.print(this.board[j][i] + " ");
            }

            System.out.println("");
        }
    }

    private void initializeBoard()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j <3; j++)
            {
                this.board[j][i] = emptySpace;
            }
        }
    }

    public void startGame()
    {
        while (this.slots > 0)
        {
            this.getPlayerMove();
            this.printBoard();
        }
        System.out.println("game ended");
    }
}

//x x x
//x x x
//x x x
