package ob;
import java.util.Observer;

public class BinaryObserver implements Observer {
	 Observable subject;
     public BinaryObserver(Observable obs){
	      this.subject = obs;
	      Subject.addObserver(this);
	 }
	 public void update(Observable obs,Object arg){
		    if (obs instanceof Subject) {
		    Subject sujet=(Subject)obs;
		    this.state= sujet.getstate();
            System.out.println("La valeur du compteur en binaire est"+Integer.toBinaryString(state););
	        }
	 }
}

// afeeen hh

public class BinaryObserver extends JFrame implements Observer, ActionListener  {
	   private Subject subject;
	   private JLabel label = new JLabel("State Binary Value : Undefined");
	   private JPanel labelPanel = new JPanel();
	   private JPanel buttonPanel = new JPanel();
	   private JPanel emptyPanel = new JPanel();
	   private JButton subscribe = new JButton("Subscribe-Me");
	   private JButton unsubscribe = new JButton("Unsubscribe-Me");
	   private int state;

	   public BinaryObserver(Subject subject){
			  super("Welcome to the Binary Observer!");
		      this.subject = subject;
		      this.setLayout(new FlowLayout());
		      labelPanel.setLayout(new FlowLayout());
		      buttonPanel.setLayout(new FlowLayout());
		      labelPanel.add(label);
		      buttonPanel.add(subscribe);
		      buttonPanel.add(unsubscribe);
		      emptyPanel.setPreferredSize(new Dimension(300,150));
		      subscribe.addActionListener(this);
		      unsubscribe.addActionListener(this);
		      this.add(labelPanel);
		      this.add(emptyPanel);
		      this.add(buttonPanel);
		      this.subscribe.setEnabled(true);
			  this.unsubscribe.setEnabled(false);
		      this.setSize(300, 300);
		      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      this.setVisible(true); 
   		}
   		public void update(Observable obj) {
			   this.getLabel().setText( "State Binary Value : " 
		      + Integer.toBinaryString( subject.getState() ) ); 
		   }

		public JLabel getLabel() {
			return label;
		}

		public void setLabel(JLabel label) {
			this.label = label;
		}

		@Override
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == subscribe) {
				this.subject.subscribe(this);
				this.subscribe.setEnabled(false);
				this.unsubscribe.setEnabled(true);

			}
			
			else if (event.getSource() == unsubscribe) {
				this.subject.unsubscribe(this);
				this.getLabel().setText( "State Binary Value : Undefined");
				this.subscribe.setEnabled(true);
				this.unsubscribe.setEnabled(false);

			}
		}

	}

}
