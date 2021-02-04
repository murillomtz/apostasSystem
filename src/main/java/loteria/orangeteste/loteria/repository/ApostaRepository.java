package loteria.orangeteste.loteria.repository;

import loteria.orangeteste.loteria.model.Aposta;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


@Repository
public interface ApostaRepository extends JpaRepository<Aposta, Long> {

    //List<Aposta> listaPorData(String email);
}
