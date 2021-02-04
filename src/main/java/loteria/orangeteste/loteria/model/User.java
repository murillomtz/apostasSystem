package loteria.orangeteste.loteria.model;


import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "tb_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Id
    @Column(unique = true,name = "email")
     @NotBlank //Nao permite valores nulos e comprimento menor que 1
    private String email;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @NotBlank()
    private String nome;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @OneToMany(mappedBy = "user")
    private List<Aposta> apostas = new ArrayList<>();

    public User() {

    }

    public User(String email, String nome) {
        this.email = email;
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aposta> getApostas() {
        return apostas;
    }

    public void setApostas(List<Aposta> apostas) {
        this.apostas = apostas;
    }
}
