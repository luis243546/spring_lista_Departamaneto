package com.example.demo.model;

import java.util.ArrayList;

import com.example.demo.modelEntidades.ClienteEntidad;

public class Clientes {
	ArrayList<ClienteEntidad> listaCLI = new ArrayList<>();
	
	public void registrarCliente (ClienteEntidad objAE) {
		listaCLI.add(objAE);
	}
	
	public ArrayList<ClienteEntidad> getClientes(){
		return listaCLI;
	}
	
	public ArrayList<ClienteEntidad> getClientesPorDepartamento(){
		ArrayList<ClienteEntidad> clientePorDepartamento = new ArrayList<>();
		for(ClienteEntidad ae:listaCLI) {
			if(ae.getDepartamento().equals("Ayacucho")) {
				clientePorDepartamento.add(ae);
			}
		}
		
		return clientePorDepartamento;
	}
	
}
