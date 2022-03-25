import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelIngresar extends JPanel implements ActionListener
{
  private JButton btnIngresar, btnSalir;
  private JTextField txtUser;
  private JPasswordField passContra;
  
  public PanelIngresar()
  {
     setLayout(new GridLayout(5,1));
     JLabel lblUsuario = new JLabel("Usuario: ", JLabel.RIGHT);
     txtUser = new JTextField(15);
     add(lblUsuario);
     add(txtUser);
     
     JLabel lblcontra = new JLabel("Contraseña: ", JLabel.RIGHT);
     passContra = new JPasswordField(15);
     passContra.setToolTipText("Ingrese Contraseña");
     add(lblcontra);
     add(passContra);
     
     btnIngresar = new JButton("Ingresar");
     btnIngresar.addActionListener(this);
     btnIngresar.setBackground(Color.gray);
     btnIngresar.setFont(new Font("SansSerif", 3,15));
     
     btnSalir = new JButton("Salir");
     btnSalir.addActionListener(this);
     btnSalir.setBackground(Color.orange);
     btnSalir.setFont(new Font("SansSerif", 3,15));
     
    
     add(btnIngresar);
     add(btnSalir);
  }
  
  public void actionPerformed(ActionEvent e){
   String usuario = txtUser.getText();
   String contra = new String(passContra.getPassword());
   
   if(e.getSource()== btnIngresar){
     if(usuario.isEmpty() && contra.isEmpty())
     {
       JOptionPane.showMessageDialog(null, "Ingrese usuario y contrasena");
       txtUser.requestFocus();
     }
     else
     {
      if(usuario.equals("Administrador") && contra.equals("1234"))
      { 
        JOptionPane.showMessageDialog(null, "Bienvenida Administradora");
        JFrameMenu fMenu = new JFrameMenu();
      }
     else
     {
      JOptionPane.showMessageDialog(null, "Usuario o contrasena equivocada");
      txtUser.setText(null);
      passContra.setText(null);
      txtUser.requestFocus();
     }//else usuario
    }//else empty
   }//if boton Ingresar
   
   if(e.getSource() == btnSalir)
   {
     System.exit(0);
   }
  }//metodo ActionPerformed
 }