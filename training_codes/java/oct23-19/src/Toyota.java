
public class Toyota implements AutoMobile{
	@Override
	public int gear() {
		System.out.println("gear() of toyota");
		return 10;

	}
	@Override
	public void gps()
	{
		System.out.println("gps() method of toyota");
	}
}
