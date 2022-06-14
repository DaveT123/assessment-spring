package org.generation.SpringAssessment.service;

import org.generation.SpringAssessment.repository.entity.Item;

import java.util.List;

public interface ItemService {

    List<Item> all();

    // method use for both add and edit item
    Item save(Item item);

    void delete(int itemId);

    Item findById(int itemId);

}
