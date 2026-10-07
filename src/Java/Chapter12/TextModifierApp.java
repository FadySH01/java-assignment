import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TextModifierApp extends JFrame {

    //Declare GUI Components

    private JTextField inputField;
    private JLabel outputLabel;
    private JButton modifyButton;


    // Constructor to set Up GUI 

    public TextModifierApp() {
        super("Text Modifier App");// Window Title

        //Configure the main window

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,150);
        setLocationRelativeTo(null); // Center the window
        setLayout(new FlowLayout(FlowLayout.CENTER,10, 20)); // spacing

        //initialize components
        outputLabel = new JLabel("Enter text and click modify");
        inputField=new JTextField(20);
        modifyButton=new JButton("modify Text");

        //Register action listener for the button 

        modifyButton.addActionListener(this::onModifyButtonClick);

        //Add components to the window
        add(outputLabel);
        add(inputField);
        add(modifyButton);

        // Make the GUI visible
        setVisible(true);
    }

    private void onModifyButtonClick(ActionEvent e) {
        String inputText = inputField.getText();
        String modifiedText = inputText.toUpperCase();

        // Update the output label
        outputLabel.setText("Modified: " + modifiedText);

    }
    // Main Method to Launch App
    public static void main(String[] args) {
        // Run GUI on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(TextModifierApp::new);
    }
}