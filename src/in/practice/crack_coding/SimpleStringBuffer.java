public class SimpleStringBuffer{
	private int length;
	private int capacity;
	private char []buffer;

	public SimpleStringBuffer()
	{
		this(16);	
	}
	public SimpleStringBuffer(int l)
	{
		this.capacity = l;
		buffer = new char[capacity];
		length = 0;
	}
	public synchronized SimpleStringBuffer append(String str)
	{
		if(length+str.length()>capacity)
		{
			int l = Math.max(length+str.length(), 2*capacity);
			char []b = new char[l];
			for(int i=0; i<length; i++)
				b[i] = buffer[i];
			buffer = b;
			capacity = l;
		}
		for(int i=0; i<str.length(); i++)
			buffer[length+i] = str.charAt(i);
		length +=str.length();
		return this;
	}
	public String toString()
	{
	 return new String(buffer, 0, length);
	}

}
