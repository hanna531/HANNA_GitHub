package ex1;

public class Ex05_MethodDemo {
	private String color;
	
	public void paintColor(String color)
	{
		this.color = color;
	}
	
	public String viewColor()
	{
		return "����� ������ ������: "+color;
	}
	
	public void jobPaint(Ex05_MethodDemo em, String color) 
	{
		em.paintColor(color);
	}
}
