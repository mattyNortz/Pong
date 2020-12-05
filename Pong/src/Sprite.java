import java.awt.Color;

public class Sprite {
	private int xPosition, yPosition, xVelocity, yVelocity, width, height;
	private int initialXPosition, initialYPosition;
	private Color colour;

	public int getxPosition() {
		return xPosition;
	}
	public int getyPosition() {
		return yPosition;
	}
	public int getxVelocity() {
		return xVelocity;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getyVelocity() {
		return yVelocity;
	}
	public Color getColour() {
		return colour;
	}


	public void setxPosition(int newX, int panelWidth) {
		this.xPosition = newX;
		if (xPosition < 0) {
			xPosition = 0;
		}else if (xPosition + width > panelWidth) {
			this.xPosition = panelWidth - width;
		}
	}
	public void setyPosition(int newY, int panelHieght) {
		this.yPosition = newY;
		if (yPosition < 0) {
			yPosition = 0;
		}else if (yPosition + width > panelHieght) {
			this.yPosition = panelHieght - width;
		}
		
	}
	public void setxPosition(int newX) {
		this.xPosition = newX;
	}
	public void setyPosition(int newY) {
		this.yPosition = newY;
	}
	public void setxVelocity(int xVelocity) {
		this.xVelocity = xVelocity;
	}
	public void setyVelocity(int yVelocity) {
		this.yVelocity = yVelocity;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setColour(Color newColour) {
		this.colour = newColour;
	}
	public void setInitialPosition(int initialX, int initialY) {
		this.initialXPosition = initialX;
		this.initialYPosition = initialY;
	}
	public void restToInitalPosition() {
		setxPosition(initialXPosition);
		setyPosition(initialYPosition);
	}
	
	
}
