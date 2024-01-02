package financys.controllers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Lancamento;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoController {

    private List<Lancamento> listaLancamentos = new ArrayList<>();

    @PostMapping
    public String createLancamento(@RequestBody Lancamento lancamento) {
        listaLancamentos.add(lancamento);
        return "Lançamento inserido com sucesso. Tipo: " + lancamento.getTipo();
    }

    @GetMapping
    public List<Lancamento> getAllLancamentos() {
    	return listaLancamentos.stream()
                .sorted(Comparator.comparing(Lancamento::getData))
                .collect(Collectors.toList());
    }
}     