package prac1;


class Ball
{
	private int radius;
	private String colour, type;
	
	public Ball(String colour,String type,int radius)
	{
		this.colour = colour;
		this.type = type;
		this.radius = radius;
	}
	
	public String toString()
	{
		return colour + type + radius;
	}
}
