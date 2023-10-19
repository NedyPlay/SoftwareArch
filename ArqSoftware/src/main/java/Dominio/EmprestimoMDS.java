package Dominio;

import java.sql.Date;

import Dominio.LeitorMDS;
import Entidades.SituacaoLeitorDTO;

public class EmprestimoMDS {
	// 1.2
	private static EmprestimoMDS instance;

	private EmprestimoMDS() {

	}

	public static EmprestimoMDS getInstance() {
		if (instance == null) {
			instance = new EmprestimoMDS();
		}
		return instance;
	}

	public SituacaoLeitorDTO iniciarEmprestimo(int idLeitor) {
		return null;
	}

	// 1.2.1
	LeitorMDS lm = LeitorMDS.buscarLeitorMDS(0);

	public Date emprestarLivro(int idLivro) {
		return null;
	}
}
