import javax.swing.*;
import java.awt.*;

public class AppleCalculator extends JFrame{
  private JTextField inputSpace;

  public AppleCalculator() {
    setLayout(null);
    inputSpace = new JTextField();
    inputSpace.setEditable(false);
    inputSpace.setBackground(Color.WHITE);
    inputSpace.setFont(new Font("Arial",Font.BOLD, 50));
    inputSpace.setBounds(10,10,285,70);

    add(inputSpace);

    setTitle("AppleCalculator");
    setSize(300,370);
    setLocationRelativeTo(null);
    setResizable(false);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }


  public static void main(String[] args){
    new AppleCalculator();
  }
}
