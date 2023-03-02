package ch.es.pl.quotes;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface QuoteRepository extends JpaRepository<QuoteEntity, Integer> {
    List<QuoteEntity> findByAuthorLike(String pattern);

}