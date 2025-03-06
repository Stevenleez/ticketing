package com.pancabudi.ticketing.category;
import com.pancabudi.common.common.misc.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketCategoryRepository extends BaseRepository<TicketCategory, Long> {
    List<TicketCategory> findByDisableFalse();
}
