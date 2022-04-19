/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import javax.swing.JOptionPane;

public class Parqueadero 
{
	static int i;
	public static void main(String[] args) 
	{
		Vehiculo vehiculoPrueba = new Vehiculo("GSR-739", "07/04/2022", "17:22", "08/04/2022", "8:05");
		Vehiculo vehiculo = new Vehiculo("", "", "", "", "");
		JOptionPane.showMessageDialog(null, "Bienvenido al sistema de Parqueadero");
		vehiculoPrueba.Mostrar();
		vehiculo.registroEntrada();
		vehiculo.Mostrar();
		
		
	}

}
