package br.com.ucb.tcc.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.ucb.tcc.dao.ConteudistaDAO;
import br.com.ucb.tcc.dao.DAO;
import br.com.ucb.tcc.modelo.Certificacao;
import br.com.ucb.tcc.modelo.Conteudista;
import br.com.ucb.tcc.modelo.Curriculo;
import br.com.ucb.tcc.modelo.Curso;
import br.com.ucb.tcc.modelo.NivelCurso;

@ManagedBean
public class CursoBean {
	
	private Curso curso = new Curso();
	
	private NivelCurso nivelCurso = new NivelCurso();
	
	private Integer nivelCursoId;
	
	
	public Integer getNivelCursoId() {
		return nivelCursoId;
	}

	public void setNivelCursoId(Integer nivelCursoId) {
		this.nivelCursoId = nivelCursoId;
	}

	public NivelCurso getNivelCurso() {
		return nivelCurso;
	}

	public void setNivelCurso(NivelCurso nivelCurso) {
		this.nivelCurso = nivelCurso;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public List<NivelCurso> getNivelCursos(){
		return new DAO<NivelCurso>(NivelCurso.class).listaTodos();
	}
	
	public void gravar(){
		System.out.println("Gravando conteudista" + this.curso.getName());
		
		Curriculo curriculo = new DAO<Curriculo>(Curriculo.class).buscaPorId(1);
//		curriculo.;
		
		this.nivelCurso = new DAO<NivelCurso>(NivelCurso.class).buscaPorId(nivelCursoId);
		
		this.curso.setCurriculo(curriculo);
		this.curso.setNivelCurso(this.nivelCurso);
		new DAO<Curso>(Curso.class).adiciona(this.curso); 
	}
	
}