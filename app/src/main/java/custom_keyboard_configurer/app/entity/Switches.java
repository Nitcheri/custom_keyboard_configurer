package custom_keyboard_configurer.app.entity;

import lombok.Data;

@Data
public class Switches extends AbstractEntity<Integer>{
    private Integer id;
    private String profile;
    private String type;
    private Integer force;
    private Integer cost;
    
    @Override
    public Integer getId() {
        return this.id;
    }
}