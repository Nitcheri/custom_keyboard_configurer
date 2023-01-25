package custom_keyboard_configurer.app.entity;

import lombok.Data;

@Data
public class Set extends AbstractEntity<Integer>{
    private Integer id;
    private String firm;
    private String type;
    private Integer cost;
    
    @Override
    public Integer getId() {
        return this.id;
    }
}