
package br.com.semeru.model.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="sexo")
public class Sexo {
    
    public static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue
    @Column(name="idSexo",nullable=false)
    private Integer idSexo;
    @Column(name="descricaoSexo",nullable=false,length=10)
    private String descricaoSexo;
    
    
    @OneToMany
    @ForeignKey(name="PessoaSexo")
    private List<Pessoa> pessoas;
    
    public Sexo() {
    }

    public Integer getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    public String getDescricaoSexo() {
        return descricaoSexo;
    }

    public void setDescricaoSexo(String descricaoSexo) {
        this.descricaoSexo = descricaoSexo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (this.idSexo != null ? this.idSexo.hashCode() : 0);
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
        final Sexo other = (Sexo) obj;
        if (this.idSexo != other.idSexo && (this.idSexo == null || !this.idSexo.equals(other.idSexo))) {
            return false;
        }
        return true;
    }
    
    
    
}
