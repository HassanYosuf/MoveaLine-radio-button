import javax.swing.*;

class Radios extends JFrame 
{
	JPanel panel = new JPanel();
	
	JRadioButton radio1 = new JRadioButton( "Java", true ) ;
	JRadioButton radio2 = new JRadioButton( "C++" ) ;
	//JRadioButton radio3 = new JRadioButton( "Common Lisp" ) ;

	ButtonGroup wines = new ButtonGroup() ;	

	public Radios()
	{
		super( "Radio Buttons" );
		setSize( 300,80 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(panel);

		wines.add( radio1 ) ;
		wines.add( radio2 ) ;
		//wines.add( radio3 ) ;

		panel.add( radio1 ) ;
		panel.add( radio2 ) ;
		////panel.add( radio3 ) ;

		setVisible( true );
	}

	public static void main ( String[] args )
	{
		new Radios();
	} 
}