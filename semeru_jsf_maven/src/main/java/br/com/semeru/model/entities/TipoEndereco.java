
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
@Table(name="tipoendereco")
public class TipoEndereco {
    
    public static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue
    @Column(name="idTipoEndereco",nullable=false)
    private Integer idTipoEndereco;
    
    @Column(name="descricaoTipoEndereco", nullable=false, length=35)
    private String descricaoTipoEndereco;
    
    @OneToMany
    @ForeignKey(name="EnderecoTipoEndereco")
    private List<Endereco> enderecos ;
    public TipoEndereco() {
    }

    public Integer getIdTipoEndereco() {
        return idTipoEndereco;
    }

    public void setIdTipoEndereco(Integer idTipoEndereco) {
        this.idTipoEndereco = idTipoEndereco;
    }

    public String getDescricaoTipoEndereco() {
        return descricaoTipoEndereco;
    }

    public void setDescricaoTipoEndereco(String DescricaoTipoEndereco) {
        this.descricaoTipoEndereco = DescricaoTipoEndereco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.idTipoEndereco != null ? this.idTipoEndereco.hashCode() : 0);
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
        final TipoEndereco other = (TipoEndereco) obj;
        if (this.idTipoEndereco != other.idTipoEndereco && (this.idTipoEndereco == null || !this.idTipoEndereco.equals(other.idTipoEndereco))) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
