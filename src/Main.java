import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Random tacoBell = new Random();
    public static JFrame mainMenuWindow;
    public static String[] possibleMoves = {
            "rock",
            "paper",
            "scissors"
    };
    public static String pickRandomMove() {
        int randomMoveIndex = tacoBell.nextInt(possibleMoves.length - 1);
        return possibleMoves[randomMoveIndex];
    }

    public static String playerChoice;
    public static String computerChoice;
    public static int streak;
    public static int playerScore;
    public static int computerScore;



    //create the window
    public static void setupMainMenuWindow() {
        mainMenuWindow = new JFrame("Window" + "");
        mainMenuWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMenuWindow.setSize(600, 400);
        mainMenuWindow.setLayout(null);

        mainMenuWindow.setLocationRelativeTo(null);
        JButton newGameButton = new JButton("New Game");
        newGameButton.setSize(100, 100);
        newGameButton.setLocation(75, 75);
        newGameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainMenuWindow.setVisible(false);

                gameWindow.setVisible(true);//makes the window visible
            }
        });


        mainMenuWindow.getContentPane().add(newGameButton); // Adds Button to content pane of frame






        mainMenuWindow.setVisible(true);//makes the window visible
    }

    public static void setupGameWindow() {
        gameWindow = new JFrame("Window" + "");
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setSize(600, 400);
        gameWindow.setLayout(null);

        gameWindow.setLocationRelativeTo(null);

        //create a button
        JButton rockbutton = new JButton("rock");
        rockbutton.setSize(100, 100);


        //runs this code when button is clicked
        rockbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rockbuttonclicked();
            }
        });

        //adding button to window
        gameWindow.getContentPane().add(rockbutton); // Adds Button to content pane of frame

        // creting a new button
        JButton Paperbutton = new JButton("paper");
        Paperbutton.setSize(100, 100);
        Paperbutton.setLocation(150, 150);
        //runs this code when button is clicked
        Paperbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                paperbuttonclicked();
            }
        });

        gameWindow.getContentPane().add(Paperbutton); // Adds Button to content pane of frame
        // creting a new button
        JButton scissorsbutton = new JButton("scissors");
        scissorsbutton.setSize(100, 100);
        scissorsbutton.setLocation(75, 75);
        scissorsbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                scissorsbuttonclicked();
            }
        });

        gameWindow.getContentPane().add(scissorsbutton); // Adds Button to content pane of frame




    }

    public static JFrame gameWindow;

    public static void rockbuttonclicked() {
        playerChoice = "rock";




    }

    public static void scissorsbuttonclicked() {
        gameWindow.setSize(300, 300);


    }

    public static void paperbuttonclicked() {


    }


    public static void main(String[] args) {
        setupMainMenuWindow();
        setupGameWindow();
        //create the window


    }
}