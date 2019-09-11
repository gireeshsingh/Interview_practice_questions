

public class OriginRobo{
	public static void main(String args[]){
		String move="UULLDDRR";
		OriginRobo or= new OriginRobo();
		System.out.println("Robot returns back to start position: "+or.check(move));
	}
	
	public boolean check(String move){
		int x=0, y=0;
				
		for(String i: move.split("")){
			if(i.equals("U"))
				y++;
			else if(i.equals("D"))
				y--;
			else if(i.equals("L"))
				x--;
			else if(i.equals("R"))
				x++;   
		}
		
		return (x==0 && y==0);
	}
}
