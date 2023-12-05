package com.algaoworks.algatransito.algatransitoapi.domain.repository;

import com.algaoworks.algatransito.algatransitoapi.domain.model.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ProprietarioRepository {
    public interface ProprietarioRepository extends JpaRepository<Proprietario, Long>{

    }
}
