package SSVSEM.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/*
  @author   Mariia Naduieva
  @project   course-project
  @class  ItemUpdateForm
  @version  1.0.0 
  @since 22.07.2021 - 18.18
*/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemUpdateForm {
    private String id;
    private String name;
    private String desc;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}