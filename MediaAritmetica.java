import javax.swing.JOptionPane;
public class MediaAritmetica{
   public static void main(String [] args){
       
      int[] nums = new int [5];
      nums[0] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: ")); 
      nums[1] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: ")); 
      nums[2] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: ")); 
      nums[3] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: ")); 
      nums[4] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: ")); 
      
      int media = 0;
      for(int i = 0; i < nums.length; i++){
         media += nums [i];
      }
      float total = (float)media / nums.length;
      
      JOptionPane.showMessageDialog(null, total);
   }
}