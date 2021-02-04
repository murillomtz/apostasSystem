package loteria.orangeteste.loteria.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Random;


import static java.lang.StrictMath.random;

@Entity
@Table(name = "tb_aposta")
public class Aposta implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_email",referencedColumnName = "email")
    private User email_user;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate data;

    private Integer num1;
    private Integer num2;
    private Integer num3;
    private Integer num4;
    private Integer num5;
    private Integer num6;

    public Aposta() {

    }


    public Aposta(Long id, User email_user) {
        this.id = id;
        this.email_user = email_user;
        this.data = LocalDate.now();
        this.num1 = randomizandoNumeros();
        this.num2 = randomizandoNumeros();
        this.num3 = randomizandoNumeros();
        this.num4 = randomizandoNumeros();
        this.num5 = randomizandoNumeros();
        this.num6 = randomizandoNumeros();
    }




    public Integer randomizandoNumeros() {

        Random random = new Random();

        Integer valorRandomico;

        do {
            valorRandomico = random.nextInt(60) + 1;
        } while (valorRandomico == num1 || valorRandomico == num2 || valorRandomico == num3 || valorRandomico == num4
                || valorRandomico == num5 || valorRandomico == num6);

        return valorRandomico;

    }
}
