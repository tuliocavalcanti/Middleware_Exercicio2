
public class LabirintoImpl {
	private static char [][] mapa={
			{'2','2','2','2','2','2','2','2','2','2','2','2'},
			{'2','1','1','1','2','2','1','1','2','2','2','2'}, 
			{'2','1','1','1','1','1','1','1','1','1','1','2'}, 
			{'2','1','1','1','2','1','2','2','1','1','1','2'}, 
			{'2','2','2','1','1','1','1','1','1','2','2','2'}, 
			{'2','2','2','2','1','1','2','2','2','2','2','2'}, 
			{'2','2','2','2','2','1','1','2','2','2','2','2'},
			{'2','1','1','1','1','1','1','1','2','2','2','2'},
			{'2','1','1','2','2','1','2','1','1','1','1','2'},
			{'2','2','2','2','2','1','2','2','1','2','1','2'},
			{'2','2','2','2','2','1','1','1','1','2','0','2'},
			{'2','2','2','2','2','2','2','2','2','2','2','2'}
			};

	public LabirintoImpl(){}
	
	public char canIMove(Coordinate cord){

		//char teste = mapa[1][2];
		char result = mapa[cord.getX()][cord.getY()];
		return result;	
	}
	
}