package EDs;

import Modulos.MapasMentais.RamoMapaMental;
import Modulos.SessionScopes.SessaoBean;

public class Usuario {
	
	public Usuario(Long ident, String nome, String senha) {
		this.identificador = ident;
		this.nome = nome;
		this.senha = senha;
	}
	
	private Long identificador;
	private String nome;
	private String senha;
	private Boolean logado;
	private SessaoBean sessaoLogado;
	private RamoMapaMental mapaMentalEditado;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Boolean getLogado() {
		return logado;
	}
	public void setLogado(Boolean logado) {
		this.logado = logado;
	}
	public SessaoBean getSessaoLogado() {
		return sessaoLogado;
	}
	public void setSessaoLogado(SessaoBean sessaoLogado) {
		this.sessaoLogado = sessaoLogado;
	}
	public Long getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}
	public RamoMapaMental getMapaMentalEditado() {
		return mapaMentalEditado;
	}
	public void setMapaMentalEditado(RamoMapaMental mapaMentalEditado) {
		this.mapaMentalEditado = mapaMentalEditado;
	}
	
}
