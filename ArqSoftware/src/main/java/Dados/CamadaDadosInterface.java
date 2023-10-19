package Dados;

import java.sql.Date;
import java.util.List;

import Entidades.EmprestimoDTO;
import Entidades.LeitorDTO;
import Entidades.LivroDTO;

public interface CamadaDadosInterface {

	LeitorDTO buscarLeitor(int idLeitor);
	
	List<EmprestimoDTO> buscaNConcluidos(int idLeitor);
	
	LivroDTO buscarLivro(int idLivro);
	
	List<EmprestimoDTO> buscaEmpLivroNConcluidos(int idLivro);
	
	void armazenaEmprestimoLivro(int idLeitor, Integer idLivro, Date dataEmprestimo, Date dataDevolucao);

}
