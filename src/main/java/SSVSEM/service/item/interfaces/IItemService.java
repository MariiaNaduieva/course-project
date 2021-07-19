package SSVSEM.service.item.interfaces;

import SSVSEM.model.Item;

import java.util.List;

/*
  @author   Mariia Naduieva
  @project   course-project
  @class  IItemService
  @version  1.0.0 
  @since 18.07.2021 - 19.21
*/
public interface IItemService {
    //CRUD
    Item create(Item item);
    Item get(String id);
    Item update(Item item);
    Item delete(String id);
    List<Item> getAll();

}
