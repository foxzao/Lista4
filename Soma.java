import javax.swing.JOptionPane;
public class Soma{
   public static void main (String [] args){
      
      int num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
      int num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
      int soma;
      
      soma = num1 + num2;
      
      if(soma > 10){
         JOptionPane.showMessageDialog(null, soma);
      }
      
   }
}