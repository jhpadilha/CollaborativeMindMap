package EDs;

import java.util.List;

import Modulos.MapasMentais.RamoMapaMental;

public class EditorMapa  implements Comparable<EditorMapa> {
	
	private Long identificador;
	private RamoMapaMental raizMapa; // Nao sei se o atributo necessario
	private Usuario usuarioEditor;
	private List<RamoMapaMental> ramosSelecionados;
	private List<Long> posicoesCursor;
	private Boolean selecaotextoCorrido = false;
	
	public EditorMapa(Usuario editor, RamoMapaMental raiz) {
		this.raizMapa = raiz;
		this.usuarioEditor = editor;
		this.identificador = getUsuarioEditor().getIdentificador();
	}
	
	public Usuario getUsuarioEditor() {
		return usuarioEditor;
	}
	public void setUsuarioEditor(Usuario usuarioEditor) {
		this.usuarioEditor = usuarioEditor;
	}
	public List<RamoMapaMental> getRamosSelecionados() {
		return ramosSelecionados;
	}
	public void setRamosSelecionados(List<RamoMapaMental> ramosSelecionados) {
		this.ramosSelecionados = ramosSelecionados;
	}
	public List<Long> getPosicoesCursor() {
		return posicoesCursor;
	}
	public void setPosicoesCursor(List<Long> posicoesCursor) {
		this.posicoesCursor = posicoesCursor;
	}
	public Boolean getSelecaotextoCorrido() {
		return selecaotextoCorrido;
	}
	public void setSelecaotextoCorrido(Boolean selecaotextoCorrido) {
		this.selecaotextoCorrido = selecaotextoCorrido;
	}

	public RamoMapaMental getRaizMapa() {
		return raizMapa;
	}

	public void setRaizMapa(RamoMapaMental raizMapa) {
		this.raizMapa = raizMapa;
	}

	public Long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}
	
	public int compareTo(EditorMapa outro) {
        if (this.identificador < outro.identificador) {
            return -1;
        }
        if (this.identificador > outro.identificador) {
            return 1;
        }
        return 0;
    }
	
}
