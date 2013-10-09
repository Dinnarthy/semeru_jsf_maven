
package br.com.semeru.model.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
    
    
    
    
}
