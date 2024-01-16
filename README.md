# Java-Guessing-Game
This is a simple Java console-based guessing game where the player is prompted to guess the correct 
color out of three options: red, blue, or green. The game utilizes Java's Random class to randomly select a 
color as the correct answer, and the player's input is compared to this answer.

# How to play
Run the Java program.
Enter your guess when prompted (red, blue, or green).
If your guess matches the randomly selected color, you win and are treated to a surprise prize via a link!

# Getting Started
Prerequisites
Java Development Kit (JDK) installed on your machine.


# Running the Game
1. Clone the repository: git clone https://github.com/Deathbringer98/guessing-game-java.git

2. Compile and run the Java program: javac GuessingGame.java
                                     java GuessingGame

3. Follow the on-screen instructions to make your color guess.

# Code Structure
The main game logic is in the GuessingGame class.
The colors to guess from are stored in a String array named colors.
The Random class is used to select a random color as the correct answer.
The game prompts the user for input until the correct color is guessed.

# Prize
If the player guesses the correct color, they are declared a winner, 
and a surprise prize is revealed by opening a web browser window to 
a special link (in this case, a classic Rick Astley video).

# External Browser Opening
The openBrowser method uses the Desktop class to open a web browser window and navigate to the specified URL. 
This demonstrates how to integrate external actions within a Java application.

# License
Creative Commons






