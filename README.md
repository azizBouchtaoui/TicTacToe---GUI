# TicTacToe---GUI

Build Tic Tac Toe Game With JAVA using AWT

Tic-tac-toe for American English, noughts and crosses for British English, or Xs and Os is a paper-and-pencil game for two players, X and O, who take turns filling the spaces in a 3×3 grid (2D Array in JAVA). The player who succeeds in placing three of their symbols in a horizontal, vertical, or diagonal row is the winner.

For the tutorial and like always, I'm going to start with the logic part, and after we understand that, then I will open the text editor and try the build the game from scratch.

This JAVA Project may seems easy to build, but trust me there a lot of things to learn though.

Anyone with JAVA Basics (For loops, variables, functions, Arrays, if statements ... etc) can build this game.


I will start the tutorial with a preview of the Tic Tac Toe game, and then talk a little bit about the panel, how to draw on the panel. Then we will talk about the Frame elements we're going to need for our game.

For JAVA we will need to files  GUI.java and Tic_Tac_Toe.java they are self explanatory. Tic_Tac_Toe.java is where the code that handles the player's options lives, like what is the opponent and symbol it has chosen. GUI.java  is where our game code lives.

In general in our GUI.java all what we need to do, is:

First Field called "Username" to store the player name.
Second Field called "password" the password is Key just morracan people can knows it is 'tiwliwla' just for make some fun 😄.
Check if the Kay is valid ✔️, else if player cant reply just need to enter name and click ok, thek wwill display under 😝 ( isay it its jst for fun 😏).
and Redirect to Tic_Tac_Toe.java 💨.

our Tic_Tac_Toe.java is:
Determine which Button on THE BOARD the player has clicked on.
Update the gameData array. (if the button clicked by the player is empty)
Draw the player's move on the board.
check if this player wins. if wins we show the game over message 😵. and stop the game.
If it doesn't win, we check for a tie game, if it's a tie we show the game over message. and stop the game.
If there is no winner and it's not a tie game, we give the turn to other player 😉. 
If There is a winner. we show bravoo🎉🎉! the X / O is Win .

