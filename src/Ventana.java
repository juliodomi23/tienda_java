
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
      Etiquetas_vendedores();
      Etiquetas_imagenes();
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
        
        
    
    }
    
    private void Botones(){
        JButton boton1 = new JButton();
        boton1.setText("Computadoras");
        boton1.setBounds(50,300,200,90);
        boton1.setEnabled(true);
        boton1.setMnemonic('1'); //shortcut alt+
        //boton1.setForeground(Color.red);
        boton1.setFont(new Font("arial",0,20));
        
        
        panel_principal.add(boton1);
        
        JButton boton2 = new JButton();
        boton2.setText("Celulares");
        boton2.setBounds(300,300,200,90);
        boton2.setEnabled(true);
        boton2.setMnemonic('2'); //shortcut alt+
        //boton1.setForeground(Color.red);
        boton2.setFont(new Font("arial",0,20));
        
        
        panel_principal.add(boton2);
       

        JButton boton3 = new JButton();
        boton3.setText("Audio");
        boton3.setBounds(525,300,200,90);
        boton3.setEnabled(true);
        boton3.setMnemonic('3'); //shortcut alt+
        //boton1.setForeground(Color.red);
        boton3.setFont(new Font("arial",0,20));
        
        
        panel_principal.add(boton3);
        
        JButton boton4 = new JButton();
        boton4.setText("Tablets");
        boton4.setBounds(750,300,200,90);
        boton4.setEnabled(true);
        boton4.setMnemonic('4'); //shortcut alt+
        //boton1.setForeground(Color.red);
        boton4.setFont(new Font("arial",0,20));
        
        
        panel_principal.add(boton4);
        
        //JButton boton2 = new JButton();
        //boton2.setBounds(500,300,200,90);
        //boton2.setBackground(Color.gray);
        //ImageIcon tablet = new ImageIcon("imagenes/tablet.png");
        //boton2.setIcon(new ImageIcon(tablet.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(),Image.SCALE_SMOOTH )));
        
        //panel_principal.add(boton2);
    }
    
    private void Etiquetas_vendedores(){
        JLabel vendedor1 = new JLabel();
        vendedor1.setText("Vendedor:Carlos Laires");
        vendedor1.setBounds(60,200,200,100);
        vendedor1.setFont(new Font("Titulo",Font.BOLD,15));
        
        panel_principal.add(vendedor1);
        
        JLabel vendedor2 = new JLabel();
        vendedor2.setText("Vendedor:Luis Melchor");
        vendedor2.setBounds(310,200,200,100);
        vendedor2.setFont(new Font("Titulo",Font.BOLD,15));
        
        panel_principal.add(vendedor2);
        
        JLabel vendedor3 = new JLabel();
        vendedor3.setText("Vendedor:Aspasia Prieto");
        vendedor3.setBounds(535,200,200,100);
        vendedor3.setFont(new Font("Titulo",Font.BOLD,15));
        
        panel_principal.add(vendedor3);
        
        JLabel vendedor4 = new JLabel();
        vendedor4.setText("Vendedor:Julio Dominguez");
        vendedor4.setBounds(750,200,200,100);
        vendedor4.setFont(new Font("Titulo",Font.BOLD,15));
        
        panel_principal.add(vendedor4);
        }
    
    private void Etiquetas_imagenes(){
    
    ImageIcon computadoras = new ImageIcon("imagenes/computadoras.jpg");
    JLabel imagen_compu = new JLabel (computadoras);
    imagen_compu.setBounds(50,450,200,250);
    imagen_compu.setIcon(new ImageIcon(computadoras.getImage().getScaledInstance(imagen_compu.getWidth(), imagen_compu.getHeight(),Image.SCALE_SMOOTH)));
    
    panel_principal.add(imagen_compu);
    
    ImageIcon celulares = new ImageIcon("imagenes/celulares.jpg");
    JLabel imagen_cel = new JLabel (celulares);
    imagen_cel.setBounds(300,450,200,250);
    imagen_cel.setIcon(new ImageIcon(celulares.getImage().getScaledInstance(imagen_cel.getWidth(), imagen_cel.getHeight(),Image.SCALE_SMOOTH)));
    
    panel_principal.add(imagen_cel);
    
    ImageIcon audio = new ImageIcon("imagenes/audio.jpg");
    JLabel imagen_audio = new JLabel (audio);
    imagen_audio.setBounds(525,450,200,250);
    imagen_audio.setIcon(new ImageIcon(audio.getImage().getScaledInstance(imagen_audio.getWidth(), imagen_audio.getHeight(),Image.SCALE_SMOOTH)));
    
    panel_principal.add(imagen_audio);
    
    ImageIcon tablets = new ImageIcon("imagenes/tablets.jpg");
    JLabel imagen_tablet = new JLabel (tablets);
    imagen_tablet.setBounds(750,450,200,250);
    imagen_tablet.setIcon(new ImageIcon(tablets.getImage().getScaledInstance(imagen_tablet.getWidth(), imagen_tablet.getHeight(),Image.SCALE_SMOOTH)));
    
    panel_principal.add(imagen_tablet);
    }
}

