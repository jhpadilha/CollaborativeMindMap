package Modulos.MapasMentais;

import java.util.ArrayList;
import java.util.List;

public class RamoMapaMental {
	
	public RamoMapaMental(String conceito) {
		this.conceitoPrincipal = conceito;
	}
	
	public RamoMapaMental(Long identificadorMapa,String conceito) {
		this.identificadorUnico = identificadorMapa;
		this.conceitoPrincipal = conceito;
	}
	
	private Long identificadorUnico;
	private String conceitoPrincipal;
	private List<RamoMapaMental> ramos;
	private RamoMapaMental ramoRaiz;
	private RamoMapaMental ramoPai;
	private String assinaturaMorfologica; // Ex. Ramo: 1.2.3.4
	private Long versao; // Versao e atribuida no ramo raiz
	
	
	public String getConceitoPrincipal() {
		return conceitoPrincipal;
	}

	public void setConceitoPrincipal(String conceitoPrincipal) {
		this.conceitoPrincipal = conceitoPrincipal;
	}
	
	public RamoMapaMental adicionaRamo(String conceito){
		if (ramos == null){
			ramos = new ArrayList<RamoMapaMental>();
		}
		
		RamoMapaMental novoRamo = new RamoMapaMental(conceito);
		novoRamo.setRamoPai(this);
		ramos.add(novoRamo);
		novoRamo.setAssinaturaMorfologica(this.getAssinaturaMorfologica() + "." + Integer.toString(ramos.indexOf(novoRamo)) );
		if (getRamoRaiz() == null){
			novoRamo.setRamoRaiz(this); 
		}else{
			novoRamo.setRamoRaiz(getRamoRaiz()); 
		}
		return novoRamo;
	}
	
	public RamoMapaMental adicionaRamo(RamoMapaMental novoRamo){
		if (ramos == null){
			ramos = new ArrayList<RamoMapaMental>();
		}
		
		novoRamo.setRamoPai(this);
		ramos.add(novoRamo);
		novoRamo.setAssinaturaMorfologica(this.getAssinaturaMorfologica() + "." + Integer.toString(ramos.indexOf(novoRamo)) );
		if (getRamoRaiz() == null){
			novoRamo.setRamoRaiz(this); 
		}else{
			novoRamo.setRamoRaiz(getRamoRaiz()); 
		}
		return novoRamo;
	}
	
	public RamoMapaMental removeRamo(String conceito){
		if (ramos == null || ramos.size() <= 0){
			return null;
		}
		
		RamoMapaMental ramoRemovido = null;
		for (RamoMapaMental ramoMapaMental : ramos) {
			if (ramoMapaMental.getConceitoPrincipal().equalsIgnoreCase(conceito)){
				ramos.remove(ramoMapaMental);
				ramoRemovido = ramoMapaMental;
				break;
			}
		}
		return ramoRemovido;
	}
	
	public RamoMapaMental removeRamo(RamoMapaMental ramo){
		if (ramos == null || ramos.size() <= 0){
			return null;
		}
		
		ramos.remove(ramo);
		return ramo;
	}
	
	public RamoMapaMental removeRamo(int index){
		if (ramos == null || ramos.size() <= 0){
			return null;
		}
		
		RamoMapaMental ramoRemovido = null;
		if (index >= ramos.size()){
			return null;
		}
		
		ramoRemovido = ramos.get(index);
		ramos.remove(ramoRemovido);
		return ramoRemovido;
	}

	public RamoMapaMental getRamoPai() {
		return ramoPai;
	}

	public void setRamoPai(RamoMapaMental ramoPai) {
		this.ramoPai = ramoPai;
	}

	public String getAssinaturaMorfologica() {
		return assinaturaMorfologica;
	}

	public void setAssinaturaMorfologica(String assinaturaMorfologica) {
		this.assinaturaMorfologica = assinaturaMorfologica;
	}

	public Long getVersao() {
		return versao;
	}

	public void setVersao(Long versao) {
		this.versao = versao;
	}

	public Long getIdentificadorUnico() {
		return identificadorUnico;
	}

	public void setIdentificadorUnico(Long identificadorUnico) {
		this.identificadorUnico = identificadorUnico;
	}

	public RamoMapaMental getRamoRaiz() {
		return ramoRaiz;
	}

	public void setRamoRaiz(RamoMapaMental ramoRaiz) {
		this.ramoRaiz = ramoRaiz;
	}
	

}
