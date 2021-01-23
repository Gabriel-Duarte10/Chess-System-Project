package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // Poderia deixar sem isso, pois por padrao uma variavel vazia e nulla
	}
	
	protected Board getBoard() {
		return board;
	}
	
	
	
		
	
	
	
	
}
