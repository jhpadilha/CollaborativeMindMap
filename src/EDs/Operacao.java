package EDs;

import Modulos.MapasMentais.RamoMapaMental;

public class Operacao {

	public enum TipoOperacaoEnum {
		INCLUSAO(1l,"Inclusao"), EXCLUSAO(2l,"Exclusao"), FOCO_RAMO(3l,"FocoRamo"), REMOVE_FOCO_RAMO(4l,"RemoveFocoRamo"),
		INCLUI_CURSOR(5l,"IncluiCursor"), REMOVE_CURSOR(6l,"RemoveCursor");
		
		private TipoOperacaoEnum(Long identificador, String descricao) {
			this.identificador = identificador;
			this.descricao = descricao;
		}
		
		private Long identificador;
		private String descricao;

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public Long getIdentificador() {
			return identificador;
		}

		public void setIdentificador(Long identificador) {
			this.identificador = identificador;
		}
		
		public TipoOperacaoEnum getNegacaoOpreacao(TipoOperacaoEnum tipoOper){
			TipoOperacaoEnum retorno;
			if (tipoOper.equals(TipoOperacaoEnum.INCLUSAO)){
				retorno = TipoOperacaoEnum.EXCLUSAO;
			}else if (tipoOper.equals(TipoOperacaoEnum.EXCLUSAO)){
				retorno = TipoOperacaoEnum.INCLUSAO;
			}else {
				retorno = null;
			}
			return retorno;
		}
	}

	public enum TipoAcaoEnum {
		FAZER(1l,"Fazer"), DESFAZER(2l,"Desfazer");
		
		private TipoAcaoEnum(Long identificador, String descricao) {
			this.identificador = identificador;
			this.descricao = descricao;
		}
		
		private Long identificador;
		private String descricao;

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public Long getIdentificador() {
			return identificador;
		}

		public void setIdentificador(Long identificador) {
			this.identificador = identificador;
		}
		
		public TipoAcaoEnum getNegacaoAcao(TipoAcaoEnum tipoOper){
			TipoAcaoEnum retorno;
			if (tipoOper.equals(TipoAcaoEnum.FAZER)){
				retorno = TipoAcaoEnum.DESFAZER;
			}else if (tipoOper.equals(TipoAcaoEnum.DESFAZER)){
				retorno = TipoAcaoEnum.FAZER;
			}else {
				retorno = null;
			}
			return retorno;
		}
	}
	
	private TipoAcaoEnum tipoAcao;
	private TipoOperacaoEnum tipoOperacaoEnum;
	private String conteudo;
	private RamoMapaMental ramoAlterado;
	
	public TipoAcaoEnum getTipoAcao() {
		return tipoAcao;
	}
	public void setTipoAcao(TipoAcaoEnum tipoAcao) {
		this.tipoAcao = tipoAcao;
	}
	public TipoOperacaoEnum getTipoOperacaoEnum() {
		return tipoOperacaoEnum;
	}
	public void setTipoOperacaoEnum(TipoOperacaoEnum tipoOperacaoEnum) {
		this.tipoOperacaoEnum = tipoOperacaoEnum;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public RamoMapaMental getRamoAlterado() {
		return ramoAlterado;
	}
	public void setRamoAlterado(RamoMapaMental ramoAlterado) {
		this.ramoAlterado = ramoAlterado;
	}
	
}
