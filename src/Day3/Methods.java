package Day3;

class computer
{
	public void playMusic(){
		System.out.println("Music playing..");
	}
	
	public String getMeAPen(int cost) {
		if (cost >=10)
			return "Pen";
		else 
			return "Nothing";
	}
}

public class Methods {
	
	public static void main(String[] args) {
		
		computer obj = new computer();
		obj.playMusic();
		String str = obj.getMeAPen(10);
		System.out.println(str);
		
	}

}
