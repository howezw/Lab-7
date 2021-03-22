import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//create counter class with ActionListener
public class Counter implements ActionListener {
  JLabel leftLabel;
  JLabel rightLabel;
  int leftCount;
  int rightCount;
//create counter constructor set frames and buttons
  Counter(){
    JFrame frame = new JFrame("Let's Count!");
    frame.setLayout(new FlowLayout());
    frame.setSize (200, 110);

    JButton left = new JButton("Left");
    JButton right = new JButton ("Right");
//set button count to 0 for start
    int leftCount = 0;
    int rightCount = 0;
//add ActionListener to buttons
    left.addActionListener(this);
    right.addActionListener(this);

    frame.add(left);
    frame.add(right);
//Initialize labels so Count will be affected
    leftLabel = new JLabel("Count" + leftCount);
    rightLabel = new JLabel("Count" + rightCount);
    frame.add(leftLabel);
    frame.add(rightLabel);
//add reset button
    JButton reset = new JButton("Reset");
    reset.addActionListener(this);
    frame.add(reset);
    frame.setVisible(true);

  }
//create actionPerformed method to increase count and reset count
  public void actionPerformed(ActionEvent ae) {
    if (ae.getActionCommand().equals("Left")){
      leftCount++;
      leftLabel.setText("Count: " + leftCount);
    }
    if(ae.getActionCommand().equals("Right")) {
      rightCount++;
      rightLabel.setText("Count: " + rightCount);
    }
    if(ae.getActionCommand().equals("Reset")) {
      rightCount = 0;
      leftCount = 0;
      leftLabel.setText("Count: " + leftCount);
      rightLabel.setText("Count: " + rightCount);
    }
  }
}