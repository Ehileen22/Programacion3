
public class Player {
	private int x;
	private int y;
	private int w;
	private int h;
	private String color;
	
	public Player(int x, int y, int w,int h, String color)
	{
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
		this.color=color;
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public boolean colision(Player p)
	{
		
		//if (this.c+this.w>p.x+p.y) o sin lo otro
		if(this.getX()<(p.getX()+p.getW())&&(this.getX()+this.getW())>p.getX()&&this.getY()<(p.getY()+p.getH())&&(this.getY()+this.getH())>p.getY())
		{
			
			return true;
			
		}
		else	
		{
			return false;
		}
			
	}

}
