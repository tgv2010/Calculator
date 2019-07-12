/*
 * This program is a light version of a calculator
 */
package calculator;

/**
 *
 * @author George
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;
public class Calculator implements ActionListener {
    
   JTextArea screen = new JTextArea(2,20);
   String displayString = "";
   float displayInteger, hiddenInteger1 = 0;
   String operator;
   
   
   public Calculator(){
        initComponents();
   }
   public void initComponents(){
        JPanel gui = new JPanel(new BorderLayout(5,5));
        gui.setBorder(new EmptyBorder(15,15,15,15));
        
        gui.add(screen, BorderLayout.NORTH);
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(gui);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelButtons = new JPanel(new GridLayout(4,4,10,10));
       
        /* Creates buttons for calculator      
            Adds each button to the gui
            The order was chosen to resemble an
            actual calculator
        */
        /*
        // Creates button 7
        JButton button7 = new JButton("7");
        panelButtons.add(button7);
        button7.addActionListener(this);
        
        //Creates button 8
        JButton button8 = new JButton("8");
        panelButtons.add(button8);
        button8.addActionListener(this);
        
        //Creates button 9
        JButton button9 = new JButton("9");
        panelButtons.add(button9);
        button9.addActionListener(this);
        
        //Creates division button
        JButton button12 = new JButton("/");
        panelButtons.add(button12);
        button12.addActionListener(this);
        
        //Creates button 4
        JButton button4 = new JButton("4");
        panelButtons.add(button4);
        button4.addActionListener(this);
        
        //Creates button 5
        JButton button5 = new JButton("5");
        panelButtons.add(button5);
        button5.addActionListener(this);
        
        //Creates button 6
        JButton button6 = new JButton("6");
        panelButtons.add(button6);
        button6.addActionListener(this);
        
        //Creates multiplication button
        JButton button13 = new JButton("*");
        panelButtons.add(button13);
        button13.addActionListener(this);
        
        //Creates button 1
        JButton button1 = new JButton("1");
        panelButtons.add(button1);
        button1.addActionListener(this);
        
        //Creates button 2
        JButton button2 = new JButton("2");
        panelButtons.add(button2);
        button2.addActionListener(this);
        
        //Creates button 3
        JButton button3 = new JButton("3");
        panelButtons.add(button3);
        button3.addActionListener(this);
        
        //Creates subtraction button
        JButton button11 = new JButton("-");
        panelButtons.add(button11);
        button11.addActionListener(this);
        
        //Creates clear button 
        JButton button15 = new JButton("C");
        button15.setPreferredSize(new Dimension(40,40));
        panelButtons.add(button15);
        button15.addActionListener(this);
        
        //Creates button 0
        JButton button0 = new JButton("0");
        button0.setPreferredSize(new Dimension(40,80));
        panelButtons.add(button0);
        button0.addActionListener(this);
        
        //Creates equal button
        JButton button14 = new JButton("=");
        panelButtons.add(button14);
        button14.addActionListener(this);
        
        //Creates addition button
        JButton button10 = new JButton("+");
        panelButtons.add(button10);
        button10.addActionListener(this);
        */
        
        // Creates buttons 1 through 3
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        
        // Creates buttons 4 through 6
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        
        // Creates buttons 7 through 9
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        
        // Creates button 0
        JButton button0 = new JButton("0");
        
        // Creates all the additional buttons
        // Creates addition button
        JButton button10 = new JButton("+");
        // Creates subtraction button
        JButton button11 = new JButton("-");
        // Creates division button
        JButton button12 = new JButton("/");
        // Creates multiplication button
        JButton button13 = new JButton("*");        
        //Creates equal button
        JButton button14 = new JButton("=");
        // Creates clear button 
        JButton button15 = new JButton("C");
        
        // Adds all the buttons in the correct order
        panelButtons.add(button7);
        panelButtons.add(button8);
        panelButtons.add(button9);
        panelButtons.add(button12);
        panelButtons.add(button4);
        panelButtons.add(button5);
        panelButtons.add(button6);
        panelButtons.add(button13);
        panelButtons.add(button1);
        panelButtons.add(button2);
        panelButtons.add(button3);
        panelButtons.add(button11);
        panelButtons.add(button15);
        panelButtons.add(button0);
        panelButtons.add(button14);
        panelButtons.add(button10);
        
        // Add all the action listners
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);
        button11.addActionListener(this);
        button12.addActionListener(this);
        button13.addActionListener(this);
        button14.addActionListener(this);
        button15.addActionListener(this);
        
        //Add features to buttons
        button0.setPreferredSize(new Dimension(40,40));
        button15.setPreferredSize(new Dimension(40,80));
             
        gui.add(panelButtons, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
   }
   /*
   Uses action listener to determine which button is pushed
   each case deals with its respective button
   the number buttons concatinate displayString with their number
   once an arithmatic button is pushed displayString converts to an int
   the integer is stored until the next string of numbers is converted
   */
   public void actionPerformed(ActionEvent event) {
       Object source = event.getSource();
       //System.out.println(((JButton) source).getText());
       switch(((JButton) source).getText()){
            case "0": displayString += "0";
                break;
            case "1": displayString += "1";
                System.out.println(displayString);
                break;
            case "2": displayString += "2";
                break;
            case "3": displayString += "3";
                break;
            case "4": displayString += "4";
                break;
            case "5": displayString += "5";                
                break;
            case "6": displayString += "6";                
                break;
            case "7": displayString += "7";                
                break;
            case "8": displayString += "8";                
                break;
            case "9": displayString += "9";                
                break;
            case "C": displayString = "";  // clear button                 
                break;
            case "+": displayInteger = Float.valueOf(displayString) ;    // add button            
                operator = "+";                
                hiddenInteger1 = displayInteger;                
                displayString = "";
                break;
            case "-": displayInteger = Float.valueOf(displayString) ;    // add button            
                operator = "-";                
                hiddenInteger1 = displayInteger;                
                displayString = "";
                break;
            case "/": displayInteger = Float.valueOf(displayString) ;    // add button            
                operator = "/";                
                hiddenInteger1 = displayInteger;                
                displayString = "";
                break;
            case "*": displayInteger = Float.valueOf(displayString) ;    // add button            
                operator = "*";                
                hiddenInteger1 = displayInteger;                
                displayString = "";
                break;
            case "=": 
                if(!displayString.equals("")){
                    displayInteger = Float.parseFloat(displayString) ;
                    switch(operator){
                    case "+": displayString = Float.toString(hiddenInteger1 + displayInteger);
                        break;
                    case "-": displayString = Float.toString(hiddenInteger1 - displayInteger);
                        break;
                    case "/": displayString = Float.toString(hiddenInteger1 / displayInteger);
                        break;
                    case "*": displayString = Float.toString(hiddenInteger1 * displayInteger);
                        break;
                    }
                    break;
                }
       }
       screen.setText(displayString);
       //System.out.println(displayString);
   }

    public static void main(String[] args) {
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {

         @Override
         public void run() {
            new Calculator();
         }
        }); 
                */
        new Calculator();
    }
    
}
