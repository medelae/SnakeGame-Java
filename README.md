# SnakeGame-JavaGUI
A pretty simple game of snake I put together back in university! Made with Java's GUI.

<img src="https://user-images.githubusercontent.com/80881875/114850451-c5015000-9dae-11eb-8d67-45d0649887c9.png" alt="Screenshot of my simple Snake game!" width="342" height="400">

Video Preview: 
https://user-images.githubusercontent.com/80881875/114849370-ab133d80-9dad-11eb-98e6-c09dcea12be0.mp4



![fruit](https://user-images.githubusercontent.com/80881875/114849593-e877cb00-9dad-11eb-9ea3-4ebb7c09d7ba.gif) *Notes and Controls* ![fruit](https://user-images.githubusercontent.com/80881875/114849593-e877cb00-9dad-11eb-9ea3-4ebb7c09d7ba.gif)
- Basic Rules: The object of the game is to eat as many apples as possible for a high score. The snake grows in length with each apple it consumes. Its speed also gradually increases. The game ends if the snake collides with itself or the game border.
- Controls: Move the snake with the traditional arrow keys ⬆⬇⬅➡. Press SPACEBAR any time to pause.
- Source code isn't included here because this is a common homework assignment, but here's how it's structured: four class files make up this project. Two of the classes are JPanel extensions (the ScorePanel at the top, and GamePanel with snake and apples); one class, 'Square', represents each segment of the snake; and the last class Snake.java puts them all together, starting the game.
- For the increasing Snake speed (decreasing time interval t between square movements): I thought an asymptotic function would work well, but after play-testing it a bunch, I ended up hard-coding the speed levels instead for an improved UX. There are 8 total levels including the default.

Feel free to use the apple (or uh, tomato) pixel for anything. I release it to the public domain.
