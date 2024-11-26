import javax.swing.JOptionPane;

public class Calculate {
    public static void main(String[]args){
        
        String strNum1,strNum2;
        strNum1=JOptionPane.showInputDialog(null,"First Number: " ,JOptionPane.INFORMATION_MESSAGE);
        strNum2=JOptionPane.showInputDialog(null,"Second Number: " ,JOptionPane.INFORMATION_MESSAGE);

        double Num1= Double.parseDouble(strNum1);
        double Num2= Double.parseDouble(strNum2);

        JOptionPane.showMessageDialog(null, Num1+Num2, "sum", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, Num1-Num2, "difference", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, Num1*Num2, "product", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, Num1/Num2, "quotient", JOptionPane.INFORMATION_MESSAGE);




        System.exit(0);
    }
}
