package br.com.ucb.tcc.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.ucb.tcc.dao.ConteudoAptoDAO;
import br.com.ucb.tcc.dao.CurriculoDAO;
import br.com.ucb.tcc.modelo.Certificacao;
import br.com.ucb.tcc.modelo.Conteudista;
import br.com.ucb.tcc.modelo.ConteudoApto;
import br.com.ucb.tcc.modelo.Curriculo;
import br.com.ucb.tcc.modelo.Curso;
import javassist.expr.NewArray;

@ManagedBean
public class BuscaConteudistaBean {
	private String desdobramento = "";

	public String getDesdobramento() {
		return desdobramento;
	}

	public void setDesdobramento(String desdobramento) {
		this.desdobramento = desdobramento;
	}
	
	public List<Curriculo> getConteudistas(){
		String desdobramento = getDesdobramento();
		if(desdobramento.isEmpty()){
			return null;
		}
		List<ConteudoApto> conteudosAptos = new ConteudoAptoDAO().getConteudoPorDesdobramento(desdobramento); 
		List<Curriculo> curriculosCursos = new ArrayList<Curriculo>();
		List<Curriculo> curriculosCertificacao = new ArrayList<Curriculo>();
		List<Integer> curriculosId = new ArrayList<Integer>();
//		curriculosCursos.add(new ConteudoAptoDAO().getCurriculoCursoConteudo(4));
		
		
		for (ConteudoApto conteudoApto : conteudosAptos) {
			System.out.println(conteudoApto.getId() +": "+conteudoApto.getTitulo());
			Curriculo curricloCurso = new ConteudoAptoDAO().getCurriculoCursoConteudo(conteudoApto.getId());
			Curriculo curricloCertificacao = new ConteudoAptoDAO().getCurriculoCertificacaoConteudo(conteudoApto.getId());
			if(curricloCurso != null) {
				curriculosCursos.add(curricloCurso);
			}
			if(curricloCertificacao != null) {
				curriculosCertificacao.add(curricloCertificacao);
			}
		}
//		curriculosId = curriculosCertificacao;
		for (Curriculo curriculo : curriculosCertificacao) {
			curriculosId.add(curriculo.getId());
		}
		for (Curriculo curriculo : curriculosCursos) {
			if(curriculosId.contains(curriculo.getId())) 
			{
			}else {
				curriculosId.add(curriculo.getId());
			}
		}
		
		List<Conteudista> conteudistas = new ArrayList<Conteudista>();
		for (Integer id : curriculosId) {
			System.out.println(curriculosId);
			conteudistas.add(new CurriculoDAO().getUserPorCurriculo(id));
		}
		for (Conteudista conteudista : conteudistas) {
			System.out.println(conteudista.getNome());
		}
//		for (Curriculo curriculo : curriculosOrdem) {
//			System.out.println(curriculo.getId());
//		}
		
		System.out.println("view");
		return null;
		
	}
}
