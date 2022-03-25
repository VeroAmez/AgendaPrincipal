import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelMenu extends JPanel implements ActionListener
{
  private JButton btnAlta, btnModificar, btnEliminar, btnConsultar;
  public static Agenda agenda;
  int cantidadPersonas;
  int cont;
  public PanelMenu()
  {  
    setLayout(new GridLayout(4,1));
    btnAlta = new JButton("Alta");
    btnAlta.addActionListener(this);
    btnAlta.setBackground(Color.green);
    btnAlta.setFont(new Font("SansSerif", 2,20));
    
    btnModificar = new JButton("Modificar");
    btnModificar.addActionListener(this);
    btnModificar.setBackground(Color.yellow);
    btnModificar.setFont(new Font("SansSerif", 2,20));
    
    btnConsultar = new JButton("Consultar");
    btnConsultar.addActionListener(this);
    btnConsultar.setBackground(Color.green);
    btnConsultar.setFont(new Font("SansSerif", 2,20));
    
    btnEliminar = new JButton("Eliminar");
    btnEliminar.addActionListener(this);
    btnEliminar.setBackground(Color.yellow);
    btnEliminar.setFont(new Font("SansSerif", 2,20));
    
    add(btnAlta);
    add(btnModificar);
    add(btnConsultar);
    add(btnEliminar);
  }
  
   public void actionPerformed(ActionEvent e){
      if(e.getSource() == btnAlta) {
        if (cont == 0) {
            cantidadPersonas = Integer.parseInt(JOptionPane.showInputDialog(this,
                "Ingrese la cantidad de personas que contendra la agenda: ",
                "inicializando la agenda"));
            agenda = new Agenda(cantidadPersonas);
            cont++;
        }
      if(cantidadPersonas > 0 ) {
            if (agenda.getCont() < cantidadPersonas){    
            JFrameAlta alta = new JFrameAlta();
            } else{
               JOptionPane.showMessageDialog(this,
                    "No hay espacio para registrar mas personas",
                    "Agenda llena",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        }      
      } else if (e.getSource() == btnModificar) {
         if (cont > 0){
            JFrameModificar modificar = new JFrameModificar();
        }
        else{
            JOptionPane.showMessageDialog(this,
                    "No se han registrado personas en la agenda",
                    "Agenda Vacía",
                    JOptionPane.INFORMATION_MESSAGE);
        }
         
      } else if (e.getSource() == btnConsultar) {
         if (cont > 0){
            JFrameConsulta modificar = new JFrameConsulta();
        }
        else{
            JOptionPane.showMessageDialog(this,
                    "No se han registrado personas en la agenda",
                    "Agenda Vacía",
                    JOptionPane.INFORMATION_MESSAGE);
        }

      } else if (e.getSource() == btnEliminar) {
         if (cont > 0){
            JFrameEliminar modificar = new JFrameEliminar();
        }
        else{
            JOptionPane.showMessageDialog(this,
                    "No se han registrado personas en la agenda",
                    "Agenda Vacía",
                    JOptionPane.INFORMATION_MESSAGE);
        }
      }
   }//metodo ActionPerformed

 }