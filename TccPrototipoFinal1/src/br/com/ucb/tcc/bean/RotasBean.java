package br.com.ucb.tcc.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class RotasBean {
	public static String goHome() {
		return "Home?faces-redirect=true";
	}
	public static String goCertificacao() {
		return "CadastroCertificacao?faces-redirect=true";
	}
	public static String goCurso() {
		return "CadastroCurso?faces-redirect=true";
	}
	public static String goCadastroFeito() {
		return "CadastroFeito?faces-redirect=true";
	}
	public static String goConteudo() {
		return "CadastroConteudoApto?faces-redirect=true";
	}
}
