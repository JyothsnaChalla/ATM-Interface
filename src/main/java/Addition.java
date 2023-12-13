
public class Addition implements IArithemetic{

	@Override
	public double cal(int x, int y) {
		int result = x+y;
		System.out.println("addition = " + result);
		return 0;
	}
	

	
}
