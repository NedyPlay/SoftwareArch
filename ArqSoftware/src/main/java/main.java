import java.sql.Date;
import java.util.List;
import java.util.ArrayList;

import Dominio.EmprestimoMDS;
import Entidades.SituacaoLeitorDTO;

public class main {

	public static void main(String[] args) {
		int idLeitor = 2;
		List<Integer> livrosSolicitados = new ArrayList<Integer>();
		
		// 1.1
		EmprestimoMDS md = EmprestimoMDS.getInstance();

		// 1.2
		SituacaoLeitorDTO st = md.iniciarEmprestimo(idLeitor);
		for (Integer idLivro: livrosSolicitados) {
			// 2.1
				Date dataDev = md.emprestarLivro(idLivro); 
			}
	}

}
