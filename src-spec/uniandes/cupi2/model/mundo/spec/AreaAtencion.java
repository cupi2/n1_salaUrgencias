package uniandes.cupi2.model.mundo.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.*;

/**
* 
*/
public class AreaAtencion extends _AreaAtencion
{

	

	/**
	* Nombre del área.
	*/
	@Atributo(genGet=true, genSet=true)
	private String nombre;
	/**
	* Cantidad de pacientes presentes en el área.
	*/
	@Atributo(genGet=true, genSet=true)
	private Integer cantidadPacientes;
	/**
	* Cantidad de profesionales presentes en el área.
	*/
	@Atributo(genGet=true, genSet=true)
	private Integer cantidadProfesionales;
	/**
	* <span style="font-size: 12.8px;">Ruta donde se guarda la imagen del área.</span>
	*/
	@Atributo(genGet=true, genSet=true)
	private String rutaImagen;
	

	

	/**
	* 
	*/
	public Integer darCantidadCuposDisponibles()
	{
	
	}
	
	/**
	* 
	*/
	public void retirarProfesionales(Integer pCantidadProfesionales)
	{
	
	}
	
	/**
	* 
	*/
	public Integer darCantidadProfesionales()
	{
	
	}
	
	/**
	* 
	*/
	public void ingresarPacientes(Integer pCantidadPacientes)
	{
	
	}
	
	/**
	* 
	*/
	public void inicializar(String pNombre, Integer pCantidadPacientes, Integer pCantidadProfresionales, String pRutaImagen)
	{
	
	}
	
	/**
	* 
	*/
	public Integer darCantidadPacientes()
	{
	
	}
	
	/**
	* 
	*/
	public void agregarProfesionales(Integer pCantidadProfesionales)
	{
	
	}
	
	/**
	* 
	*/
	public void retirarPacientes(invalid pCantidadPacientes)
	{
	
	}
	
	/**
	* 
	*/
	public void reiniciar()
	{
	
	}
	
	/**
	* 
	*/
	public String darNombre()
	{
	
	}
	
	/**
	* 
	*/
	public Integer darCantidadCuposLibres()
	{
	
	}
	
	
}

