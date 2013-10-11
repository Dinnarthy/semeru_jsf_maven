
package br.com.semeru.model.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="endereco")
public class Endereco implements Serializable{
    
    public static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue
    @Column(name="idEndereco",nullable=false)
    private Integer idEndereco;
    
    @Column(name="bairro",length=80)
    private String bairro;
    
    @Column(name="nomeLogradouro",length=80)
    private String nomeLogradouro;
    
    @Column(name="cep",length=9)
    private String cep;
    
    @Column(name="numero")
    private Integer numero;
    
    @Column(name="complemento")
    private Integer complemento;
    
    @OneToOne(optional=true, fetch= FetchType.LAZY)                 //(optional=true)Pode cadastrar uma pessoa
    @ForeignKey(name="PessoaPossuiEndereco")                        //sem cadastrar um endereco
    @JoinColumn(name="idPessoa",referencedColumnName = "idPessoa") //Lazy para quando fizer uma
    private Pessoa pessoa;                                          //consulta no banco buscar somente
                                                                    //o que eu tow pedindo
    
    @ManyToOne(optional=false,fetch=FetchType.LAZY)
    @ForeignKey(name="PessoaTipoLogradouro")
    @JoinColumn(name="idTipoLogradouro",referencedColumnName="idTipoLogradouro")
    private TipoLogradouro tipoLogradouro;
    
    @ManyToOne(optional=false,fetch=FetchType.LAZY)
    @ForeignKey(name="EnderecoTipoEndereco")
    @JoinColumn(name="idTipoEndereco",referencedColumnName="idTipoEndereco")
    private TipoEndereco tipoEndereco;
    
    @ManyToOne(optional=false, fetch=FetchType.LAZY)
    @ForeignKey(name="EnredecoEstado")
    @JoinColumn(name="idEstado",referencedColumnName="idEstado")
    private Estado estado;
    
    @ManyToOne(optional=false, fetch=FetchType.LAZY)
    @ForeignKey(name="EnderecoCidade")
    @JoinColumn(name="idCidade",referencedColumnName="idCidade")
    private Cidade cidade;

    public Endereco() {
    }

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNomeLogradouro() {
        return nomeLogradouro;
    }

    public void setNomeLogradouro(String nomeLogradouro) {
        this.nomeLogradouro = nomeLogradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getComplemento() {
        return complemento;
    }

    public void setComplemento(Integer complemento) {
        this.complemento = complemento;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.idEndereco != null ? this.idEndereco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Endereco other = (Endereco) obj;
        if (this.idEndereco != other.idEndereco && (this.idEndereco == null || !this.idEndereco.equals(other.idEndereco))) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
