package ch.es.pl.quotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class QuoteService {
    @Autowired
    private QuoteRepository quoteRepository;

    @Transactional
    public void allQuotesOrNothing(List<Quote> quotes) {
        for (Quote quote : quotes) {
            quoteRepository.save(new QuoteEntity(
                    quote.getId(), quote.getAuthor(), quote.getCitation()));
        }
    }
}
