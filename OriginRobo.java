

public class OriginRobo{
	public static void main(String args[]){
		String move="UULLDDRR";
		OriginRobo or= new OriginRobo();
		System.out.println("Robot returns back to start position: "+or.check(move));
	}
	
	public boolean check(String move){
		int x=0, y=0;
		int[] movement= new int[8];
		
		for(String i: move.split("")){
			if(i=="U")
				y++;
			else if(i=="D")
				y--;
			else if(i=="L")
				x--;
			else if(i=="R")
				x++;
		}
		
		return (x==0 && y==0);
	}
}