public class SimpleStringBufferTest{
	public static void main(String []a)
	{
		SimpleStringBuffer s = new SimpleStringBuffer();
		s = s.append("Hello");
		s = s.append("World");
		s = s.append("Whatsup Dude!!!!");
		System.out.println("Ans-->"+s.toString());


	}
}
