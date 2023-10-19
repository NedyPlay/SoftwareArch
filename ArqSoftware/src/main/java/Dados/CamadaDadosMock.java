package Dados;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import Entidades.EmprestimoDTO;
import Entidades.LeitorDTO;
import Entidades.LivroDTO;

public class CamadaDadosMock implements CamadaDadosInterface {
	
	@Override
	public LeitorDTO buscarLeitor(int idLeitor) {
		return new LeitorDTO(idLeitor);
	}

	@Override
	public List<EmprestimoDTO> buscaNConcluidos(int idLeitor) {
		return new ArrayList<EmprestimoDTO>();
	}

	@Override
	public LivroDTO buscarLivro(int idLivro) {
		return new LivroDTO(idLivro);
	}

	@Override
	public List<EmprestimoDTO> buscaEmpLivroNConcluidos(int idLivro) {
		return new ArrayList<EmprestimoDTO>();
	}

	@Override
	public void armazenaEmprestimoLivro(int idLeitor, Integer idLivro, Date dataEmprestimo, Date dataDevolucao) {
		
	}
	
}