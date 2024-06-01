package com.franklin.backend.service;

import com.franklin.backend.Entity.Items;
import java.util.List;

public interface ItemsService {
    Items saveItems(Items items);

    Items updateItems(Items items);

    void deleteItemsById(int id);

    Items findItemsById(int id);

    List<Items> findAllItems();
}