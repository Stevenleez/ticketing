package com.pancabudi.ticketing.category;

import com.pancabudi.common.common.misc.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketCategoryService extends BaseService<TicketCategoryRepository, TicketCategory, Long> {
    public TicketCategory create(TicketCategory category) {
        return repository.save(category);
    }
}

