package com.pancabudi.ticketing.category;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/ticket/category")
public class TicketCategoryController {

    private final TicketCategoryService service;

    public TicketCategoryController(TicketCategoryService service) {
        this.service = service;
    }

    @GetMapping("/active")
    public List<TicketCategory> getActiveCategories() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public TicketCategory getCategoryById(@PathVariable Long id) {
        return service.findById(id).orElse(null);
    }

    @PostMapping("/add")
    public TicketCategory createCategory(@RequestBody TicketCategory category) {
        return service.save(category);
    }

    @PutMapping("/{id}")
    public TicketCategory updateCategory(@PathVariable Long id, @RequestBody TicketCategory category) {
        category.setId(id);
        return service.save(category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        service.deleteById(id);
    }
}
