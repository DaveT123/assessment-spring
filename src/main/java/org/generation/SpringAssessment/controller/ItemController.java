package org.generation.SpringAssessment.controller;

import org.generation.SpringAssessment.controller.dto.ItemDto;
import org.generation.SpringAssessment.repository.entity.Item;
import org.generation.SpringAssessment.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/item")
public class ItemController {

    final ItemService itemService;

    public ItemController(@Autowired ItemService itemService) {

        this.itemService = itemService;

    }

    @CrossOrigin
    @GetMapping("/all")
    public Iterable<Item> getItems() {
        return itemService.all();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public Item findItemById(@PathVariable Integer id) {
        return itemService.findById(id);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        itemService.delete(id);
    }

    @CrossOrigin
    @PostMapping("/add")
    public void save(  @RequestParam(name="name", required = true) String name,
                       @RequestParam(name="description", required = true) String description,
                       @RequestParam(name="date", required = true) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date)
    {
        ItemDto itemDto = new ItemDto(name, description, date);
        itemService.save(new Item(itemDto));
    }

}
