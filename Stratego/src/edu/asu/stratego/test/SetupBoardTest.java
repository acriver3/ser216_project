package edu.asu.stratego.test;
import org.testng.annotations.Test;
import edu.asu.stratego.game.*;
import edu.asu.stratego.game.board.ClientBoard;

import org.testng.Assert;


public class SetupBoardTest {

  @Test
  public void getPiece() {
	SetupBoard test1 = new SetupBoard();	
    Assert.assertNull(test1.getPiece(1, 1));
  }

  /*
  @Test
  
  need to create mock board
  
  public void getPiecePositions() {
	  
	  
  }
	*/
  @Test
  public void setPiece() {
		SetupBoard test1 = new SetupBoard();
		Piece expected1 = new Piece(PieceType.SCOUT, PieceColor.RED, false);
		test1.setPiece(expected1, 2 , 2);
		Piece unexpected = new Piece(PieceType.SCOUT, PieceColor.RED, false);
		test1.setPiece(unexpected, 3 , 8);
		Piece expected3 = new Piece(PieceType.FLAG, PieceColor.BLUE, false);
		test1.setPiece(expected3, 3 , 8);
	    Assert.assertEquals(test1.getPiece(2, 2), expected1);
	    Assert.assertEquals(test1.getPiece(3, 8), expected3);
  }
}
