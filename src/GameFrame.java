import javax.swing.JFrame;

public class GameFrame extends JFrame{//JFrame class is a top-level container that can be used to create a windows in a desktop applications
	
	GameFrame(){ //The constructor of the class
		/*What wes are doing here is, we are instantiating the GamePanel class and 
		 * using the add() method from JFram the parent class we are adding to the framework the GamePanel class
		 * */
		
		//another way to declare the below code is in this way:
		//this.add(new GamePanel());
		GamePanel panel = new GamePanel();//We instantiate the class GamePanel
		this.add(panel); // We use the method of JFrame to add in this class the GamePanel
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
	}
}
