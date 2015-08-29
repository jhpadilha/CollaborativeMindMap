package Modulos.Sistema.EditandoMapa;

import java.util.HashMap;
import java.util.Map;

import EDs.Usuario;
import Modulos.Login.Login;
import Modulos.MapasMentais.RamoMapaMental;
import Modulos.Operacoes.Observer.ControladorOperacoes;

public class UmEscreveOutroRecebe {
	
	public UmEscreveOutroRecebe() {
	}
	
	public void executaOperacoes(){
		// Tenho Dois Usuarios A e B
		Usuario usuarioA = new Usuario(1l, "A", "A");
		Usuario usuarioB = new Usuario(2l, "B","B");
		
		// Que se Logaram no sistema
		Login loginBean = new Login();
		loginBean.efetuarLogin(usuarioA);
		loginBean.efetuarLogin(usuarioB);
		
		// Que possuo mapas mentais cadastrados
		
		Map <String, RamoMapaMental> listaMapas = new HashMap<String, RamoMapaMental>();
		
		RamoMapaMental mapamentalTesteX = new RamoMapaMental(1l, "teste_XX");
		mapamentalTesteX.adicionaRamo("teste_XX_01");
		mapamentalTesteX.adicionaRamo("teste_XX_02");
		mapamentalTesteX.adicionaRamo("teste_XX_03");
		mapamentalTesteX.adicionaRamo("teste_XX_04");
		
		RamoMapaMental mapamentalTesteY = new RamoMapaMental(2l, "teste_YY");
		mapamentalTesteY.adicionaRamo("teste_YY_01");
		mapamentalTesteY.adicionaRamo("teste_YY_02");
		mapamentalTesteY.adicionaRamo("teste_YY_03");
		mapamentalTesteY.adicionaRamo("teste_YY_04");
		
		listaMapas.put("XX", mapamentalTesteX);
		listaMapas.put("YY", mapamentalTesteY);
		
		// Usuario Uausrio A e B abrem
		// cada usuario na sua sessao.
		// Com observer em escopo aplicacao
		// controlando Mapas Editados > Usuarios conectados
		// vou ter duas visoes :
		//    Visao do usuario
		//    Visao do Obseever
		
		ControladorOperacoes controladorOperacoesObserver = new ControladorOperacoes();
		controladorOperacoesObserver.editarMapaMental(mapamentalTesteX, usuarioA);
		controladorOperacoesObserver.editarMapaMental(mapamentalTesteX, usuarioB);
		
		// Usuario A inclui dados em um ramo 
		// do mapa X e o usuario B e notificado
		// e atualizado
		
		
	}

	public static void main (String ... Args) {
		UmEscreveOutroRecebe casoUmEscreveOutroRecebe = new UmEscreveOutroRecebe();
		casoUmEscreveOutroRecebe.executaOperacoes();
	}
}
