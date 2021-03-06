import org.apache.commons.math3.linear.*;
import java.io.*;

public class Analysis {
  
  public static MegaMonopoly game = new MegaMonopoly();
  
  public static void main(String [] args) throws Exception {
    
    int numberOfRolls = 250;
    
    game.exportTransitionMatrix("general_transition_matrix");
    game.printStats(numberOfRolls);
    
    game.adjustForJail();
    game.exportTransitionMatrix("jail_adjusted_matrix");
    game.printStats(numberOfRolls);
    
    game.adjustForChanceAndChest();
    game.printStats(numberOfRolls);
    game.exportTransitionMatrix("chance_and_chest_adjusted_matrix");
  }
}