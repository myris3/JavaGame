import java.util.ArrayList;
import java.util.HashMap;
		
public class GameState {
	char[] board;
	char emptySpace = '0';
	char wP = 'p';
	char bP = 'P';
	char wK = 'k';
	char bK = 'K';
	char wQ = 'q';
	char bQ = 'Q';
	char wR = 'r';
	char bR = 'R';
	char wN = 'n';
	char bN = 'N';
	char wB = 'b';
	char bB = 'B';
	HashMap moveMapper;


	GameState(){
		this.board = new char[64];
		
		//Initialize array with empy space char
		for (int i = 0; i < 64; i++){
			board[i] = emptySpace;
		}
		
		//Place black pieces
		for (int i = 8; i < 16; i++){
			board[i] = this.bP;
		}
		
		this.board[0] = this.bR;
		this.board[1] = this.bN;
		this.board[2] = this.bB;
		this.board[3] = this.bQ;
		this.board[4] = this.bK;
		this.board[5] = this.bB;
		this.board[6] = this.bN;
		this.board[7] = this.bR;

		//Place white pieces
		for (int i = 48; i < 56; i++){
			board[i] = this.wP;
		}
		this.board[56] = this.wR;
		this.board[57] = this.wN;
		this.board[58] = this.wB;
		this.board[59] = this.wQ;
		this.board[60] = this.wK;
		this.board[61] = this.wB;
		this.board[62] = this.wN;
		this.board[63] = this.wR;

		//Initialize algebra to coordinate map
		this.moveMapper = new HashMap();
		char[] letterSequence = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		char[] numberSequence = {'8', '7', '6', '5', '4', '3', '2', '1'};
		
		int index = 0;
		for (char number : numberSequence){
			for (char letter : letterSequence){
				String note = new StringBuilder()
					.append(letter)
					.append(number)
					.toString();

				this.moveMapper.put(note, index);
				//this.moveMapper.put(index, note)
				index++;

			}
		}	

		

	}

	public void printBoard(){
		for (int i = 0; i < 64; i+=8){
			System.out.println("");
			for (int j = 0; j < 8; j++){
				System.out.print(this.board[i+j]);
			}
		}
		System.out.println("");
	}

	public void checkCoordinate(String note){
		//Create a map in object fields, 
		//to map algebraic notation to array index 
		//of the board char array			
		char piece = this.board[(int)this.moveMapper.get(note)];
		System.out.println(piece);

	}
	
	public void movePiece(String from, String to){
		//cases for each piece, check if the moves are legal
		// if legal, do the move
		//
		// Account for black/white to move	
	}

	public static void main(String[] args){
		System.out.println("Hello World!");	
		
		GameState game = new GameState();

		game.printBoard();	
		
		//game.checkCoordinate("a1");
		//game.checkCoordinate("a8");
		//game.checkCoordinate("a2");


		
	}
}




	






