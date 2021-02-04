package loteria.orangeteste.loteria.service.serviceImp;

import loteria.orangeteste.loteria.model.Aposta;
import loteria.orangeteste.loteria.repository.ApostaRepository;
import loteria.orangeteste.loteria.service.IApostaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApostaServiceImp implements IApostaService {

    private final ApostaRepository apostaRepository;

    public ApostaServiceImp(ApostaRepository apostaRepository) {
        this.apostaRepository = apostaRepository;
    }


    @Override
    public List<Aposta> findAll() {
        return apostaRepository.findAll();
    }

    @Override
    public Aposta findByid(long id) {
        return apostaRepository.findById(id).get();
    }

    @Override
    public Aposta save(Aposta aposta) {
        return apostaRepository.save(aposta);
    }

    @Override
    public Long count() {
        return apostaRepository.count();
    }

    @Override
    public void delete(Aposta aposta) {
        apostaRepository.delete(aposta);

    }

    @Override
    public Boolean existsById(long id) {
        return apostaRepository.existsById(id);
    }
}
