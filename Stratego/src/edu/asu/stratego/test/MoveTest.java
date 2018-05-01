package edu.asu.stratego.test;
import org.testng.annotations.Test;
import edu.asu.stratego.game.Move;
import edu.asu.stratego.game.Piece;
import edu.asu.stratego.game.PieceColor;
import edu.asu.stratego.game.PieceType;

import java.io.Serializable;
import org.testng.annotations.BeforeClass;
import java.awt.Point;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class MoveTest {


@Test
  public void getColStart() {
	Move testConditions1 = new Move();
	int actual1 = testConditions1.getColStart(); 
    Assert.assertEquals(actual1, -1);
  }

  @Test
  public void getEnd() {
	 Move testConditions1 = new Move();
	 Point expected1 = new Point(-1, -1);
	 Assert.assertEquals(testConditions1.getEnd(), expected1);
  }

  @Test
  public void getEndPiece() {
	Move testConditions1 = new Move();
    Assert.assertNull(testConditions1.getEndPiece());
  }

  @Test
  public void getMoveColor() {
	Move testConditions1 = new Move();
	Assert.assertNull(testConditions1.getMoveColor());
  }

  @Test
  public void getRowStart() {
	Move testConditions1 = new Move();
	int actual1 = testConditions1.getRowStart(); 
	Assert.assertEquals(actual1, -1);
  }

  @Test
  public void getStart() {
	Move testConditions1 = new Move();
	Point expected1 = new Point(-1, -1);
	Assert.assertEquals(testConditions1.getStart(), expected1);
  }

  @Test
  public void getStartPiece() {
	Move testConditions1 = new Move();
	Assert.assertNull(testConditions1.getStartPiece());
  }

  @Test
  public void isAttackMove() {
	Move testConditions1 = new Move();
	Assert.assertFalse(testConditions1.isAttackMove());
  }

  @Test
  public void isAttackWin() {
	Move testConditions1 = new Move();
	Assert.assertFalse(testConditions1.isAttackWin());
  }

  @Test
  public void isDefendWin() {
	Move testConditions1 = new Move();
	Assert.assertFalse(testConditions1.isDefendWin());
  }

  @Test
  public void isPieceSelected() {
	Move testConditions1 = new Move();
	Assert.assertFalse(testConditions1.isPieceSelected());
  }

  @Test
  public void setAttackMove() {
	Move testConditions1 = new Move();
	testConditions1.setAttackMove(true);
	Assert.assertTrue(testConditions1.isAttackMove());
  }

  @Test
  public void setAttackWin() {
	Move testConditions1 = new Move();
	testConditions1.setAttackWin(true);
	Assert.assertTrue(testConditions1.isAttackWin());
  }

  @Test
  public void setDefendWin() {
	Move testConditions1 = new Move();
	testConditions1.setDefendWin(true);
	Assert.assertTrue(testConditions1.isDefendWin());
  }

  @Test
  public void setEndintint() {
	Move testConditions1 = new Move();
	Point expected1 = new Point(5, 5);
	testConditions1.setEnd(5,5);
	Assert.assertEquals(testConditions1.getEnd(), expected1);
  }

  @Test
  public void setEndPoint() {
	Move testConditions1 = new Move();
	Point expected1 = new Point(5, 5);
	testConditions1.setEnd(expected1);
	Assert.assertEquals(testConditions1.getEnd(), expected1);
  }

  @Test
  public void setEndPiece() {
	  	Piece expected1 = new Piece(PieceType.SCOUT, PieceColor.RED, false);
		Move testConditions1 = new Move();
		testConditions1.setEndPiece(expected1);
		Assert.assertEquals(testConditions1.getEndPiece(), expected1);
  }

  @Test
  public void setMoveColor() {
		Move testConditions1 = new Move();
		PieceColor expected1 = PieceColor.RED;
		testConditions1.setMoveColor(expected1);
		Assert.assertEquals(testConditions1.getMoveColor(), PieceColor.RED);
  }

  @Test
  public void setStartintint() {
		Move testConditions1 = new Move();
		Point expected1 = new Point(1, 1);
		testConditions1.setStart(1,1);
		Assert.assertEquals(testConditions1.getStart(), expected1);
  }

  @Test
  public void setStartPoint() {
		Move testConditions1 = new Move();
		Point expected1 = new Point(1, 1);
		testConditions1.setStart(expected1);
		Assert.assertEquals(testConditions1.getStart(), expected1);
  }

  @Test
  public void setStartPiece() {
	  	Piece expected1 = new Piece(PieceType.FLAG, PieceColor.RED, false);
		Move testConditions1 = new Move();
		testConditions1.setStartPiece(expected1);
		Assert.assertEquals(testConditions1.getStartPiece(), expected1);
  }
}
