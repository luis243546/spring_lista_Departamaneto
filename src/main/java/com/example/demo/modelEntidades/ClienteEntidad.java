package com.example.demo.modelEntidades;

public class ClienteEntidad {
	
	private Long codigo;
    private String apellidos;
    private String nombres;
    private String departamento;
    private String direccion;
    private String celular;
    private String correo;
    
    public ClienteEntidad() {
		super();
	}
	public ClienteEntidad(Long codigo, String apellidos, String nombres, String departamento, String direccion,
			String celular, String correo) {
		super();
		this.codigo = codigo;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.departamento = departamento;
		this.direccion = direccion;
		this.celular = celular;
		this.correo = correo;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
    
    
}
