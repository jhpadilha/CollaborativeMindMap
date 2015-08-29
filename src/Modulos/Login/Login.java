package Modulos.Login;

import EDs.Usuario;
import Modulos.SessionScopes.SessaoBean;

public class Login {
	
	public SessaoBean efetuarLogin(Usuario usuario){
		SessaoBean sessao = new SessaoBean();
		sessao.setUsuarioLogado(usuario);
		usuario.setSessaoLogado(sessao);
		usuario.setLogado(true);
		return sessao;
	}

}
