package Dominio;

import java.util.List;

import Dados.CamadaDadosInterface;
import Dados.CamadaDadosMock;
import Entidades.EmprestimoDTO;
import Entidades.LivroDTO;

public class LivroMDS {
	
	private static LivroMDS instance = null;
	private int idLivro;
	
	private LivroMDS(int idLivro) {
		this.idLivro = idLivro;
	}

	public static LivroMDS getInstance(int idLivro) {
		if (instance  == null)
			instance = new LivroMDS(idLivro);
		return instance;
	}
	
	public static CamadaDadosInterface dados = new CamadaDadosMock();


	public static LivroMDS buscarLivro(int idLivro) {
		
		//2.1.1.1
		LivroDTO dto = dados.buscarLivro(idLivro);
		LivroMDS livroEncontrado = getInstance(idLivro);
		
		return livroEncontrado;
	}

	public List<EmprestimoDTO> buscaEmprestimosNConcluidos() {
		
		//2.1.2.1
		List<EmprestimoDTO>nc = dados.buscaEmpLivroNConcluidos(idLivro);
		
		return nc;
	}
}