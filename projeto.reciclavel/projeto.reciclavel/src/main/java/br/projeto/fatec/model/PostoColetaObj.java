package br.projeto.fatec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_postocoleta")
public class PostoColetaObj extends AbstractEntity{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "nm_posto", length = 60)
	private String nmPostoColeta;
	
	@Column(name = "tx_localizacao", length = 120)
	private String txLocalizacao;
	
	@Column(name = "tx_descricao", length = 120)
	private String txDescricao;
	
	@ManyToOne
	private MaterialObj materialObj;
	
	public PostoColetaObj() {
	}

	public String getNmPostoColeta() {
		return nmPostoColeta;
	}

	public void setNmPostoColeta(String nmPostoColeta) {
		this.nmPostoColeta = nmPostoColeta;
	}

	public String getTxLocalizacao() {
		return txLocalizacao;
	}

	public void setTxLocalizacao(String txLocalizacao) {
		this.txLocalizacao = txLocalizacao;
	}

	public String getTxDescricao() {
		return txDescricao;
	}

	public void setTxDescricao(String txDescricao) {
		this.txDescricao = txDescricao;
	}

	public MaterialObj getMaterialObj() {
		return materialObj;
	}

	public void setMaterialObj(MaterialObj materialObj) {
		this.materialObj = materialObj;
	}
}
