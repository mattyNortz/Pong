import javax.swing.JFrame;

public class Pong extends JFrame{
	static final String WINDOW_TITLE = "Pong";
	static final int WINDOW_WIDTH = 600;
	static final int WINDOW_HEIGHT = 800;
	
	public Pong() {
		setTitle(WINDOW_TITLE);
		setSize(WINDOW_HEIGHT, WINDOW_WIDTH);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Pong();

	}

}
