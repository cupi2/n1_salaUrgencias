package uniandes.cupi2.model.interfaz.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.interfaz.*;
import index.I;

/**
* 
*/
@UIPanel
public class PanelInformacion extends _PanelInformacion
{
	

	/**
	* Campo de texto para el porcentaje de ocupación.
	*/
	@UITextField(nombre = " PorcentajeOcupacion ", enabled = true)
	private JTextField txtPorcentajeOcupacion;
	
	/**
	* Campo de texto para la cantidad total de pacientes.
	*/
	@UITextField(nombre = " TotalPacientes ", enabled = true)
	private JTextField txtTotalPacientes;
	
	/**
	* Campo de texto para el porcentaje de disponibilidad.
	*/
	@UITextField(nombre = " ProcentajeDisponibilidad ", enabled = true)
	private JTextField txtProcentajeDisponibilidad;
	
	/**
	* Campo de texto para la cantidad total de cupos libres.
	*/
	@UITextField(nombre = " TotalCuposLibres ", enabled = true)
	private JTextField txtTotalCuposLibres;
	
	/**
	* Campo de texto para el promedio de profesionales por área.
	*/
	@UITextField(nombre = " CantidadPromedioProfesionales ", enabled = true)
	private JTextField txtCantidadPromedioProfesionales;
	
	

	
	/**
	* 
	*/
	public void actualizar(Integer pTotalCuposLibres, Double pPorcentajeDisponibilidad, Integer pTotalPacientes, Double pProcentajeOcupacion, Integer pCantidadPromedioProfesionales)
	{
	
	}
	
	

} 
