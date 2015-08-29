package Modulos.Operacoes.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import EDs.EditorMapa;
import EDs.Usuario;
import Modulos.MapasMentais.RamoMapaMental;

public class ControladorOperacoes {
	
	private Map<Long,List<EditorMapa>> listaMapasEditados;
	
	public ControladorOperacoes() {
		if (listaMapasEditados == null){
			listaMapasEditados = new TreeMap<Long,List<EditorMapa>>();
		}
	}
	
	public void editarMapaMental(RamoMapaMental raizMapa, Usuario usuario){
		EditorMapa novoEditor = new EditorMapa(usuario, raizMapa);
		if (listaMapasEditados.containsKey(raizMapa.getIdentificadorUnico())){
			listaMapasEditados.get(raizMapa.getIdentificadorUnico()).add(novoEditor);
		}else {
			List<EditorMapa> listaEditores = new ArrayList();
			listaEditores.add(novoEditor);
			listaMapasEditados.put(raizMapa.getIdentificadorUnico(), listaEditores);
		}
		usuario.setMapaMentalEditado(raizMapa);
	}

}
