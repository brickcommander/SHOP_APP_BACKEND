package com.brickcommander.crud.app.repository;

import com.brickcommander.crud.app.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    Item findOneByItemId(Long itemId);
}
