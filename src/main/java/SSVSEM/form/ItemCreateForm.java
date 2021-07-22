package SSVSEM.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
  @author   Mariia Naduieva
  @project   course-project
  @class  ItemCreateForm
  @version  1.0.0 
  @since 22.07.2021 - 10.44
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemCreateForm {
        private String name;
        private String desc;
    }
