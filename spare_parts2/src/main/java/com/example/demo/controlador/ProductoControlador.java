package com.example.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entidades.Producto;
import com.example.demo.servicios.ProductoService;

@Controller
public class ProductoControlador {

	@Autowired
	private ProductoService productoService;

	@GetMapping("/listarproductos")
	public String seleccionarProductos(Model model) {
		try {
			List<Producto> listaProductos = productoService.findAll();
			model.addAttribute("productos", listaProductos);

		} 

		catch (Exception e) {
			System.out.println("Error:" + e.getCause());

		} 

		return "/index";

	} 
	
	@GetMapping("/nuevoproducto")
	public String nuevoproducto(Model model) {
		model.addAttribute("productos",new Producto());
		return "/addproducto";
			
	}
	
	@PostMapping("/saveproducto")
	public String addProducto(@Validated Producto producto) {
		productoService.save(producto);
		return  "redirect:/listarproductos"; 
		
	}
	
	
	@GetMapping("/eliminarproducto/{id}")
	public String eliminar(@PathVariable Long id) {
		productoService.deleteById(id);
		return  "redirect:/listarproductos"; 
		
	}
	
	@GetMapping("/editarproducto/{id}")
	public String editar(@PathVariable long id,Model model) {
		Optional<Producto> producto = productoService.findById(id);
		model.addAttribute("productos",producto.get());
		return "/editproducto";
		
	}

} 
