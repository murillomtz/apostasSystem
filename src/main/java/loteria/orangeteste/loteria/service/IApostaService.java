package loteria.orangeteste.loteria.service;

import loteria.orangeteste.loteria.model.Aposta;

import java.util.List;

public interface IApostaService {

    List<Aposta> findAll();

    Aposta findByid(long id);

    Aposta save(Aposta aposta);

    Long count();

    void delete(Aposta aposta);

    Boolean existsById(long id);
}
