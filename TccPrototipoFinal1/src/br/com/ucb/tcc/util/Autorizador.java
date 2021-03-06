package br.com.ucb.tcc.util;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import br.com.ucb.tcc.modelo.Login;
import br.com.ucb.tcc.modelo.Usuario;

public class Autorizador implements PhaseListener{
	
	private static final long serialVersionUID = 1L;

	@Override
	public void afterPhase(PhaseEvent event) {
		// TODO Auto-generated method stub
		FacesContext context = event.getFacesContext();
		
		String nomePagina = context.getViewRoot().getViewId();
		
		System.out.println(nomePagina);
		
		if("/Login.xhtml".equals(nomePagina)) {			
			return;
		}else if("/CadastroSimples.xhtml".equals(nomePagina)) {
			return;
		}else if("/BuscaConteudo.xhtml".equals(nomePagina)) {
			return;
		}else if("/ShowAvisoCadastro.xhtml".equals(nomePagina)) {
			return;
		}else if("/CadrastaConteudo.xhtml".equals(nomePagina)) {
			return;
		}else if("/BuscaConteudista.xhtml".equals(nomePagina)) {
			return;
		}else if("/ShowCurriculo.xhtml".equals(nomePagina)) {
			return;
		}
		
		Login loginDeUsuario = (Login) context.getExternalContext().getSessionMap().get("usuarioLogado");
		Integer usuarioId = (Integer) context.getExternalContext().getSessionMap().get("usuarioId");
	
//		if((usuarioId == 1) ||(usuarioId ==2)) {
//			NavigationHandler handler = context.getApplication().getNavigationHandler();
//			handler.handleNavigation(context, null, "BuscaConteudo?faces-redirect=true");
//			context.renderResponse();
//			return;
//		}
		if(loginDeUsuario != null) {
			return;
		}
		
		NavigationHandler handler = context.getApplication().getNavigationHandler();
		handler.handleNavigation(context, null, "Login?faces-redirect=true");
		context.renderResponse();
	}

	@Override
	public void beforePhase(PhaseEvent event) {
		// TODO Auto-generated method stub
	}

	@Override
	public PhaseId getPhaseId() {
		// TODO Auto-generated method stub
		
		return PhaseId.RESTORE_VIEW;
	}

}
