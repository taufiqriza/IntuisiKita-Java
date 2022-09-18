
package Aplikasi;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class RunUlar extends JFrame {
 public RunUlar() {
        
        initUI();
    }
    
    private void initUI() { 
        
        add(new background());
        
        setResizable(false);
        pack();
        
        setTitle("Ulo Nogo");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EventQueue.invokeLater(() -> {
            JFrame ex = new RunUlar();
            ex.setVisible(true);
        });
    }
    }
    

