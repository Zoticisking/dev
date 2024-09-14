import org.code.neighborhood.Painter;

public class EmojiPainter extends PainterPlus {


  // Takes the painter to the location to start 
public void paintHead(String color) {

  move();
  move();
 move();
  move();
  move();
 move();

  }
  

// moves to the row for the eyes 
  public void paintRightEye(String color){
    turnRight();
  move();
  move();
  }
// moves to the exact location of the eye so it can paint
  public void paintLeftEye(String color){
move();
    turnLeft();
  move();
    turnLeft();
  move();
  }

  // paints the eye
public void paintEyes(String color) {
  turnRight();
  move();
  paint(color);
  turnLeft();
  move();
 paint(color);
 

  
  turnRight();
  move();
  move();
  move();
    paint(color);
turnRight();
  move();
  paint(color);
}
// paints the mouth
public void paintMouth(String color){
  move();
  move();
  move();
  turnLeft();
  move();
 paint(color);
  move();
 paint(color);
  move();
 paint(color);
  move();
 paint(color);
  move();
  move();
  turnLeft();
  turnLeft();
  turnLeft();
  move();
  move();
}
  
  
}