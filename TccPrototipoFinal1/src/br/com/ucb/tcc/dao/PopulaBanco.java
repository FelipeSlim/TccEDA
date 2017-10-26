package br.com.ucb.tcc.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.ucb.tcc.modelo.Conteudista;
import br.com.ucb.tcc.modelo.Curriculo;
import br.com.ucb.tcc.modelo.Curso;
import br.com.ucb.tcc.modelo.NivelCurso;
import br.com.ucb.tcc.modelo.Usuario;
import br.com.ucb.tcc.bean.ConteudistaBean;
import br.com.ucb.tcc.dao.JPAUtil;
import br.com.ucb.tcc.modelo.BuscaEmConteudo;
import br.com.ucb.tcc.modelo.Certificacao;

public class PopulaBanco {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		NivelCurso tecnologo = new NivelCurso();
		tecnologo.setTipo("Tecnólogo");
		tecnologo.setDescricacao(" ");

		NivelCurso graduacao = new NivelCurso();
		graduacao.setTipo("Graduação");
		graduacao.setDescricacao(" ");

		NivelCurso posgraduacao = new NivelCurso();
		posgraduacao.setTipo("Pós-Graduação");
		posgraduacao.setDescricacao(" ");

		NivelCurso mestrado = new NivelCurso();
		mestrado.setTipo("Mestrado");
		mestrado.setDescricacao(" ");

		NivelCurso doutorado = new NivelCurso();
		doutorado.setTipo("Doutorado");
		doutorado.setDescricacao(" ");

		NivelCurso posdoutorado = new NivelCurso();
		posdoutorado.setTipo("Pós-Doutorado");
		posdoutorado.setDescricacao(" ");

		Conteudista cont = new Conteudista();
		cont.setCPF("1123213123");
		cont.setNome("testando");

		//

		// Endereco endereco = new Endereco();
		// endereco.setBairro("Leste");
		// endereco.setCidade("Gama");
		// endereco.setComplemento("33");
		// endereco.setUF(UnidadeFederacao.DF);
		// endereco.setCep("23345765");
		//
		// Conteudista conteudista = new Conteudista();
		// conteudista.setCPF("12312312312");
		// conteudista.setEmail("tabeco");
		// conteudista.setEndereco(endereco);
		//
		//
		Conteudista conteudista2 = new Conteudista();
		conteudista2.setCPF("123123123444");
		conteudista2.setEmail("tabedc");

		ConteudistaBean conteBean = new ConteudistaBean();
		conteBean.setConteudista(conteudista2);

		// conteBean.gravar();
		//
		// endereco.setUsuarios(Arrays.asList(conteudista, conteudista2));
		// EntityManager em = new JPAUtil().getEntityManager();

		// em.getTransaction().begin();
		// em.persist(tecnologo);
		// em.persist(graduacao);
		// em.persist(posgraduacao);
		// em.persist(mestrado);
		// em.persist(doutorado);
		// em.persist(posdoutorado);

		// em.persist(conteudista2);
		// em.persist(conteudista);
		// em.persist(endereco);
		//
		// em.getTransaction().commit();
		// em.getTransaction().begin();
		// Endereco end = em.find(Endereco.class, 1);
		//
		// Conteudista cond = em.find(Conteudista.class, 2);
		// end.setUsuarios(Arrays.asList(cond, conteudista));
		// em.getTransaction().commit();

		// Curriculo curriculo = new DAO<Curriculo>(Curriculo.class).buscaPorId(1);
		// List<Certificacao> resultados = new ArrayList<Certificacao>();
		// EntityManager em = new JPAUtil().getEntityManager();
		//
		// // abre transacao
		// em.getTransaction().begin();
		//
		// String jpql = "Select c from Curso c where c.curriculo = :pCurriculo";
		// Query query = em.createQuery(jpql);
		// query.setParameter("pCurriculo", curriculo);
		// // persiste o objeto
		// resultados = query.getResultList();
		// // commita a transacao
		// em.getTransaction().commit();
		//
		// // fecha a entity manager
		// em.close();
		// System.out.println("opaa");
		// //System.out.println(end.getUsuarios().size());
		// em.close();

		// EntityManager em = new JPAUtil().getEntityManager();
		//
		// // abre transacao
		// em.getTransaction().begin();
		//
		// String jpql = "Select c from Certificacao c join c.curriculos cu where cu =
		// :pCurriculo";
		// Query query = em.createQuery(jpql);
		// query.setParameter("pCurriculo", curriculo);
		// // persiste o objeto
		// resultados = query.getResultList();
		// // commita a transacao
		// em.getTransaction().commit();
		//
		// // fecha a entity manager
		// em.close();
		//
		//
		// for(int i= 0; i < resultados.size(); i++ ) {
		// System.out.println(resultados.get(i).getNome());
		//
		// }
//		String palavraBuscada = "java";
//		List<BuscaEmConteudo> conteudosTitulos = new ArrayList<BuscaEmConteudo>();
//		List<BuscaEmConteudo> conteudosPalavras = new ArrayList<BuscaEmConteudo>();
//		List<String> arquivosNomes = new ArrayList<String>();
//		Integer palavras = 0;
//		String str;
//		int encontrado;
//		int bloco = 1;
//		String fazTitulo = "";
//		String fazPalavra = "";
//		int totalBloco = 0;
//		String nomeArquivo = "Myfiles.html";
//		arquivosNomes.add("Myfile");
//		arquivosNomes.add("Myfile2");
//
//		for (int j = 0; j < arquivosNomes.size(); j++) {
//			encontrado = 0;
//			List<String> tituloAchado = new ArrayList<String>();
//			List<String> titulos = new ArrayList<String>();
//			try {
//				BufferedReader in = new BufferedReader(new FileReader("/Users/feliperodrigues/Documents/" + arquivosNomes.get(j) + ".html")); // declara
//																												// o
//																												// nome
//																												// do
//																												// arquivo
//
//				while ((str = in.readLine()) != null) { // vasculha todo o arquivo e armazena os dados encontrado na
//														// variável "str"
//
//					for (int i = 0; i < str.length(); i++) {
//						Character caractere = str.charAt(i); // Aqui a estring é diluida, ou seja, os caractere do
//																// arquivo
//																// serão jogados em vetores, para possível maniplação.
//
//						fazTitulo = fazTitulo + caractere;// aqui eu criei blocos de palavras
//						fazPalavra = fazPalavra + caractere;
//
//						if (fazPalavra.contains(palavraBuscada)) {
//							encontrado++; // que será uma espécie de contagem de quantos blocos há dentro do
//							fazPalavra = "";
//						}
//
//						if (fazTitulo.contains("<h1>")) {
//
//							fazTitulo = "";
//						} // arquivo.
//						if (fazTitulo.contains("</h1>")) {
//
//							fazTitulo = fazTitulo.substring(0, fazTitulo.length() - 5);
//							titulos.add(fazTitulo);
//							fazTitulo = ""; // O bloco é zerado para não ficar um bloco acumuladtivo
//						}
//
//					}
//				}
//
//				in.close();
//			} catch (IOException e) {
//				System.out.println("Há a possibilidade de um arquivo com nome diferente ao regristro no banco."); // possiveis
//																													// erros
//																													// são
//																													// tratatos
//																													// aqui
//			}
//			BuscaEmConteudo conteudo = new BuscaEmConteudo();
//			conteudo.setNomeArquivo(arquivosNomes.get(j));
//			conteudo.setQtdParalavras(encontrado);
//			if (titulos.size() > 0) {
//				// System.out.println(titulos.size());
//				Boolean inserirEmTitulos = false;
//				for (int i = 0; i < titulos.size(); i++) {
//					
//					if (titulos.get(i).toUpperCase().contains(palavraBuscada.toUpperCase())) {
//						inserirEmTitulos = true;
//						tituloAchado.add(titulos.get(i));
//						conteudo.setTitulo(tituloAchado);
//					}
//				}
//				if (inserirEmTitulos == true) {
//					conteudosTitulos.add(conteudo);
//				} else if ((inserirEmTitulos == false) && (encontrado > 0)) {
//					conteudosPalavras.add(conteudo);
//				}
//			}
//			// System.exit(0);
//			List<BuscaEmConteudo> listaFinal = new ArrayList<BuscaEmConteudo>();
//			listaFinal = conteudosTitulos;
//			for (int i = 0; i < conteudosPalavras.size(); i++) {
//
//				listaFinal.add(conteudosPalavras.get(i));
//
//			}
//			// System.out.println(conteudosPalavras.size());
//			// System.out.println(listaFinal.size());
//			if(j == arquivosNomes.size()-1) {
//			for (int i = 0; i < listaFinal.size(); i++) {
//				System.out.println(listaFinal.get(i).getNomeArquivo());
//				System.out.println(listaFinal.get(i).getTitulo());
//				System.out.println(listaFinal.get(i).getQtdParalavras());
//			}
//			}
//
//		}
	
	EntityManager em = new JPAUtil().getEntityManager();
		
		String jpql = "select u from Usuario u where u.email = '123@gmail.com' amd u.senha = '123'";
		Query query = em.createQuery(jpql);
		//query.setParameter("pEmail", usuario.getEmail());
		//query.setParameter("pSenha", usuario.getSenha());
		List<Usuario> resultados = query.getResultList();
		em.close(); 
		
		System.out.println(resultados.size()>0);
	
	}
}