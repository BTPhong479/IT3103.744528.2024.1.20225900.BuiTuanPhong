import javax.swing.JOptionPane;


public class Degree {
    public static void main(String[]args){
        String strChoose;
        strChoose= JOptionPane.showInputDialog(null, "1.First-degree 1 var\n2.First-degree 2 var\n3.Second-degree",JOptionPane.INFORMATION_MESSAGE );
        if(strChoose.equals("1")){
            String strNum1,strNum2,strNum3;
            strNum1=JOptionPane.showInputDialog(null,"input a: " ,JOptionPane.INFORMATION_MESSAGE);
            strNum2=JOptionPane.showInputDialog(null,"input b: " ,JOptionPane.INFORMATION_MESSAGE);
            strNum3=JOptionPane.showInputDialog(null,"input c: " ,JOptionPane.INFORMATION_MESSAGE);
            double Num1= Double.parseDouble(strNum1);
            double Num2= Double.parseDouble(strNum2);
            double Num3= Double.parseDouble(strNum3);
            if(Num1==0){
                JOptionPane.showMessageDialog(null,"a=0 ???");
                
            }else {
                JOptionPane.showMessageDialog(null, (Num3-Num2)/Num1, "x= ", JOptionPane.INFORMATION_MESSAGE);
            }

        }else if(strChoose.equals("2")){
            String stra11,stra12,strb1,stra21,stra22,strb2;
            stra11=JOptionPane.showInputDialog(null,"input a11: " ,JOptionPane.INFORMATION_MESSAGE);
            stra12=JOptionPane.showInputDialog(null,"input a12: " ,JOptionPane.INFORMATION_MESSAGE);
            strb1=JOptionPane.showInputDialog(null,"input b1: " ,JOptionPane.INFORMATION_MESSAGE);
            stra21=JOptionPane.showInputDialog(null,"input a21: " ,JOptionPane.INFORMATION_MESSAGE);
            stra22=JOptionPane.showInputDialog(null,"input a22: " ,JOptionPane.INFORMATION_MESSAGE);
            strb2=JOptionPane.showInputDialog(null,"input b2: " ,JOptionPane.INFORMATION_MESSAGE);
            double a11= Double.parseDouble(stra11);
            double a12= Double.parseDouble(stra12);
            double b1= Double.parseDouble(strb1);
            double a21= Double.parseDouble(stra21);
            double a22= Double.parseDouble(stra22);
            double b2= Double.parseDouble(strb2);
            if(a11*a22-a21*a12==0){
                JOptionPane.showMessageDialog(null,"Valid!!!");
            }else {
                JOptionPane.showMessageDialog(null, (b1*a22-b2*a12)/(a11*a22-a21*a12), "x1= ", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, (a11*b2-a21*b1)/(a11*a22-a21*a12), "x2= ", JOptionPane.INFORMATION_MESSAGE);
            }
        }else if(strChoose.equals("3")){
            String stra,strb,strc;
            stra=JOptionPane.showInputDialog(null,"input a: " ,JOptionPane.INFORMATION_MESSAGE);
            strb=JOptionPane.showInputDialog(null,"input b: " ,JOptionPane.INFORMATION_MESSAGE);
            strc=JOptionPane.showInputDialog(null,"input c: " ,JOptionPane.INFORMATION_MESSAGE);
            double a= Double.parseDouble(stra);
            double b= Double.parseDouble(strb);
            double c= Double.parseDouble(strc);
            if(b*b-4*a*c<0){
                JOptionPane.showMessageDialog(null,"Valid!!!");
            }else if(b*b-4*a*c==0){

                JOptionPane.showMessageDialog(null, -1*b/(2*a), "x= ", JOptionPane.INFORMATION_MESSAGE);
            }else {
                double d=Math.sqrt(b*b-4*a*c);
                JOptionPane.showMessageDialog(null, (-1*b+d)/(2*a), "x= ", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, (-1*b-d)/(2*a), "x= ", JOptionPane.INFORMATION_MESSAGE);
            }

        }
        System.exit(0);

    }
}
