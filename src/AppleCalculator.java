import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppleCalculator extends JFrame{
  private JTextField inputSpace;

  public AppleCalculator() {
    setLayout(null);
    inputSpace = new JTextField();
    inputSpace.setEditable(false);
    inputSpace.setForeground(Color.WHITE);
    inputSpace.setBackground(Color.DARK_GRAY);
    inputSpace.setFont(new Font("Arial",Font.PLAIN, 50));
    inputSpace.setBounds(-3,-3,287,70);
    inputSpace.setHorizontalAlignment(JTextField.RIGHT);

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(5,4,0,0));
    buttonPanel.setBounds(0,62,280,235);

    String[] buttonNames = {"C","±","%","÷","7","8","9","X","4","5","6","-","1","2","3","+","0","0",".","="};
    JButton[] buttons = new JButton[buttonNames.length];

    for(int i=0; i<buttonNames.length; i++){
      buttons[i] = new JButton(buttonNames[i]);
      buttons[i].setFont(new Font("Arial",Font.BOLD,20));
      if(i>=0&&i<4) buttons[i].setBackground(Color.GRAY);
      else if(i==3 || i==7 || i== 11 || i==15) buttons[i].setBackground(Color.orange);
      else buttons[i].setBackground(Color.lightGray);
      buttons[i].setForeground(Color.WHITE);
      buttons[i].setOpaque(true);
      buttons[i].setBorderPainted(false);
      buttons[i].addActionListener(new PadActionListener());
      buttonPanel.add(buttons[i]);

    }


    add(inputSpace);
    add(buttonPanel);

    setTitle("AppleCalculator");
    setSize(280,325);
    setLocationRelativeTo(null);
    setResizable(false);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  class PadActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
      String operation = e.getActionCommand();
      if(operation.equals("C")) inputSpace.setText("");
      else if(operation.equals("=")) {}
      else inputSpace.setText(inputSpace.getText()+e.getActionCommand());
    }
  }


  public static void main(String[] args){
    new AppleCalculator();
  }
}
