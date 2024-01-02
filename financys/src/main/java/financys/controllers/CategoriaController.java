package financys.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Categoria;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
	private List<Categoria> listaCategorias = new ArrayList<>();

	@PostMapping
	public String createCategoria(@RequestBody Categoria categoria) {
		listaCategorias.add(categoria);
		String mensagem = "Categoria inserida com sucesso. Nome: " + categoria.getNome();
		return mensagem;
	}

	@GetMapping
	public List<Categoria> getAllCategorias() {
		return listaCategorias;
	}
}