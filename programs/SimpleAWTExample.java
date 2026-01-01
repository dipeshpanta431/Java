import java.awt.*;
import java.awt.event.*;

public class SimpleAWTExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example"); // Create a new window
        Button button = new Button("Click Me!"); // Create a button

        button.addActionListener(new ActionListener() { // Add a click event
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });

        frame.add(button); // Add button to the window
        frame.setSize(300, 200); // Set window size
        frame.setLayout(new FlowLayout()); // Set layout manager
        frame.setVisible(true); // Display the window
    }
}
