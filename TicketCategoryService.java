package com.pancabudi.ticketing.category;

import com.pancabudi.common.common.misc.BaseService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class TicketCategoryService extends BaseService<TicketCategoryRepository, TicketCategory, Long> {

    public List<TicketCategory> findAllActiveCategories() {
        return repository.findByDisableFalse();
    }
    public TicketCategory create(TicketCategory category) {
        return repository.save(category);
    }

    @Transactional
    public void deleteById(Long id) {
        Optional<TicketCategory> optionalCategory = repository.findById(id);
        if (optionalCategory.isPresent()) {
            TicketCategory category = optionalCategory.get();
            category.setDisable(true);
            repository.save(category);
        } else {
            throw new RuntimeException("Ticket category not found with id: " + id);
        }
    }
}
