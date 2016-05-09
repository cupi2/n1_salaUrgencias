package uniandes.cupi2.model.interfaz.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.interfaz.*;
import index.I;

/**
* 
*/
@UIPanel
public class PanelArea extends _PanelArea
{
	/**
	* <span style="font-size: 12.8px;">Comando para ejecutar la acción del botón btnIngresarPacientes.</span>
	*/
	public final static invalid INGRESAR_PACIENTES = "Ingresar pacientes";
	/**
	* <span style="font-size: 12.8px;">Comando para ejecutar la acción del botón btnAgregarProfesionales.</span>
	*/
	public final static invalid AGREGAR_PROFESIONALES = "Agregar profesionales";
	/**
	* <span style="font-size: 12.8px;">Comando para ejecutar la acción del botón btnRetirarProfesionales.</span>
	*/
	public final static invalid RETIRAR_PROFESIONALES = "Retirar profesionales";
	/**
	* <span style="font-size: 12.8px;">Comando para ejecutar la acción del botón btnRetirarPacientes.</span>
	*/
	public final static invalid RETIRAR_PACIENTES = "Retirar pacientes";
	

	/**
	* Campo de texto para la cantidad de profesionales.
	*/
	@UITextField(nombre = " CantidadProfesionales ", enabled = true)
	private JTextField txtCantidadProfesionales;
	
	/**
	* <span style="font-size: 12.8px;">Comando para ejecutar la acción del botón btnIngresarPacientes.</span>
	*/
	private invalid INGRESAR_PACIENTES="Ingresar pacientes"; 	
	
	/**
	* Etiqueta para la imagen del área.
	*/
	@UILabel(nombre = " Imagen ")
	private JLabel lblImagen;
	
	/**
	* Número de área.
	*/
	private Integer numeroArea; 	
	
	/**
	* <span style="font-size: 12.8px;">Comando para ejecutar la acción del botón btnAgregarProfesionales.</span>
	*/
	private invalid AGREGAR_PROFESIONALES="Agregar profesionales"; 	
	
	/**
	* Botón para ingresar pacientes al área.
	*/
	@UIBoton( comando = " ", label = " ", metodo = I.)
	private JButton btnIngresarPacientes;
	
	/**
	* Campo de texto para la cantidad de cupos libres.
	*/
	@UITextField(nombre = " CantidadCuposLibres ", enabled = true)
	private JTextField txtCantidadCuposLibres;
	
	/**
	* Campo de texto para la cantidad de cupos disponibles.
	*/
	@UITextField(nombre = " CantidadCuposDisponibles ", enabled = true)
	private JTextField txtCantidadCuposDisponibles;
	
	/**
	* Botón para retirar profesionales del área.
	*/
	@UIBoton( comando = " ", label = " ", metodo = I.)
	private JButton btnRetirarProfesionales;
	
	/**
	* <span style="font-size: 12.8px;">Comando para ejecutar la acción del botón btnRetirarProfesionales.</span>
	*/
	private invalid RETIRAR_PROFESIONALES="Retirar profesionales"; 	
	
	/**
	* Botón para agregar profesionales al área.
	*/
	@UIBoton( comando = " ", label = " ", metodo = I.)
	private JButton btnAgregarProfesionales;
	
	/**
	* <span style="font-size: 12.8px;">Comando para ejecutar la acción del botón btnRetirarPacientes.</span>
	*/
	private invalid RETIRAR_PACIENTES="Retirar pacientes"; 	
	
	/**
	* Botón para retirar pacientes del área.
	*/
	@UIBoton( comando = " ", label = " ", metodo = I.)
	private JButton btnRetirarPacientes;
	
	/**
	* Campo de texto para la cantidad de pacientes.
	*/
	@UITextField(nombre = " CantidadPacientes ", enabled = true)
	private JTextField txtCantidadPacientes;
	
	

	
	/**
	* 
	*/
	public void actualizar()
	{
	
	}
	
	

} 
