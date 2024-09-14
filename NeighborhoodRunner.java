import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    MuralPainter jem = new MuralPainter();
EmojiPainter myEmojiPainter = new EmojiPainter();
    
    //Paints backround
    jem.paintBackground("Yellow", 16);

    
    // the commands for what color each part will paint
myEmojiPainter.setPaint(1000);
myEmojiPainter.paintHead("yellow");
    myEmojiPainter.paintRightEye("yellow");
    myEmojiPainter.paintEyes("black");
    myEmojiPainter.paintLeftEye("yellow");
myEmojiPainter.paintMouth("black");
 
  
  
  }
}