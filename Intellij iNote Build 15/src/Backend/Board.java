package Backend;

public class Board {

	//global Variables

	
	//Data Variables
	private String TITLE;
	private int WIDTH, HEIGHT;
	private boolean isVisible;
	
	public void setTitle(String title) {
		this.TITLE = title;
	}
	
	public String getTitle() {
		return TITLE;
	}
	
	public void setWidth(int width) {
		this.WIDTH = width;
	}
	
	public int getWidth() {
		return WIDTH;
	}
	
	public void setHeight(int height) {
		this.HEIGHT = height;
	}
	
	public int getHeight() {
		return HEIGHT;
	}
	
	public void isVisible(boolean visible) {
		this.isVisible = visible;
	}
	
	public boolean getVisible() {
		return isVisible;
	}
}
