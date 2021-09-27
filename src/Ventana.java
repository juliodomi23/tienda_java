
/**
 *
 * @author julio
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.PopupMenu;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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

    public JPanel panel_principal;
    
    public Ventana (){
        this.setSize(1024,768);
        setTitle("Tienda de electronicos");
        setLocationRelativeTo(null);
        setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel_principal();
    }   
    
    
    private void panel_principal(){
       
      Panel();
      Etiquetas();
      Botones();

    }
    
    private void Panel(){
     panel_principal= new JPanel();
        
        panel_principal.setLayout(null);
        panel_principal.setBackground(Color.LIGHT_GRAY);
        this.getContentPane().add(panel_principal);
    }
    
    private void Etiquetas(){
        
        JLabel bienvenida = new JLabel();
        bienvenida.setText("Bienvenido a la tienda");
        //x,y,ancho,alto
        bienvenida.setBounds(300,10,400,20);
        bienvenida.setHorizontalAlignment(SwingConstants.CENTER);
        bienvenida.setFont(new Font("Titulo",Font.BOLD,25));
        
        panel_principal.add(bienvenida);
        
        
       ImageIcon imagen4 = new ImageIcon("imagenes/tablets.jgp");
       JLabel imagen_tablet = new JLabel();
       imagen_tablet.setBounds(700,400,200,200);
       imagen_tablet.setIcon(new ImageIcon(imagen4.getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH)));
        
        panel_principal.add(imagen_tablet);
        
    
    }
    
    private void Botones(){
        JButton boton1 = new JButton();
        boton1.setText("Tablets");
        boton1.setBounds(700,300,200,90);
        boton1.setEnabled(true);
        boton1.setMnemonic('4'); //shortcut alt+
        //boton1.setForeground(Color.red);
        boton1.setFont(new Font("arial",0,20));
        
        
        panel_principal.add(boton1);
        
       
        
        JButton boton2 = new JButton();
        boton2.setBounds(400,300,200,90);
        //boton2.setBackground(Color.gray);
        ImageIcon tablet = new ImageIcon("imagenes/tablet.png");
        boton2.setIcon(new ImageIcon(tablet.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(),Image.SCALE_SMOOTH )));
        
        panel_principal.add(boton2);
    }
}

