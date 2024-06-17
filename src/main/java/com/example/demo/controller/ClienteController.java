package com.example.demo.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.model.Clientes;
import com.example.demo.modelEntidades.ClienteEntidad;


@Controller
public class ClienteController {
	
	Clientes objCLI =new Clientes();

	@GetMapping({"/index", "/"})
    public String index(Model model) {
        return "FormularioRegistro";
    }

    @PostMapping("/registrar")
    public String registrarCliente(@Validated ClienteEntidad cliente) {
        if(cliente!= null) {
        	objCLI.registrarCliente (cliente);
        }
        return "FormularioRegistro";
    }
    
    @GetMapping("/lista")
    public String getLista (Model model) {
    	List<ClienteEntidad> listCLI = new ArrayList<>();
    	listCLI = objCLI.getClientes();
    	model.addAttribute("ListaA", listCLI);
    	return "FormularioListaCliente";
    }
    
    @GetMapping("/ListaPorDepartamento")
    public String getListaPorDepartamento(Model model) {
        List<ClienteEntidad> listaClientes = objCLI.getClientesPorDepartamento();
        model.addAttribute("ListaD", listaClientes);
        return "FormularioListaDepartamento";
    }
    
}
