/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import javax.swing.JOptionPane;

public class Vehiculo extends Parqueadero
{
	
	String[] placa = new String[20];
	String[] fechaIngreso = new String [20];
	String[] horaIngreso = new String [20];
	String[] horaSalida = new String [20];
	String[] fechaSalida = new String [20];
	
	
	
	public Vehiculo(String placa, String fechaIngreso, String horaIngreso, String fechaSalida, String horaSalida)
	{
		this.placa[i] = placa;
		this.fechaIngreso[i] = fechaIngreso;
		this.fechaSalida[i] = fechaSalida;
		this.horaIngreso[i] = horaIngreso;
		this.horaSalida[i] = horaSalida;
		
	}
	
	
	public void registroEntrada()
	{
		placa[i] = JOptionPane.showInputDialog("Ingrese la placa del vehículo (XXX-NNN)");
		fechaIngreso[i] = JOptionPane.showInputDialog("Ingrese la fecha de ingreso (DD/MM/AAAA)");
		horaIngreso[i] = JOptionPane.showInputDialog("Ingrese la hora de entrada (HH:MM)");
		fechaSalida[i] = JOptionPane.showInputDialog("Ingrese la fecha de salida (DD/MM/AAAA)");
		horaSalida[i] = JOptionPane.showInputDialog("Ingrese la hora de salida (HH:MM)");
	}
	
	public void Mostrar()
	{
		JOptionPane.showMessageDialog(null, "Placa: "+this.placa[i]+ "\nFecha de ingreso: "+this.fechaIngreso[i]
				+ "\nHora de ingreso: "+this.horaIngreso[i]+"\nFecha de salida: "+this.fechaSalida[i]
				+"\nHora de salida: "+this.horaSalida[i]);
	}

}

