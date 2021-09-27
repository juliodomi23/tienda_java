
/**
 *
 * @author julio
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.PopupMenu;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author julio
 */
public class Ventana extends JFrame{

    private PopupMenu panel_secundario;
    
    public Ventana (){
        this.setSize(1000,1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Tienda de electronicos");
        setLocationRelativeTo(null);
        setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        
        panel_principal();
    }   
    
    
    private void panel_principal(){
        JPanel panel_principal= new JPanel();
        
        panel_principal.setLayout(null);
        panel_principal.setBackground(Color.LIGHT_GRAY);
        this.getContentPane().add(panel_principal);
        
      
        
        JLabel bienvenida = new JLabel();
        bienvenida.setText("Bienvenido a la tienda");
        //x,y,ancho,alto
        bienvenida.setBounds(100,10,500,20);
        bienvenida.setHorizontalAlignment(SwingConstants.CENTER);
        bienvenida.setFont(new Font("Titulo",Font.BOLD,25));
        
        panel_principal.add(bienvenida);
        
        
       ImageIcon imagen1 = new ImageIcon("imagenes/tablets.jpg");
       JLabel imagen_tablet = new JLabel();
       imagen_tablet.setBounds(200,100,200,200);
       imagen_tablet.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH)));
        
        panel_principal.add(imagen_tablet);
        
    }
    
    
}

