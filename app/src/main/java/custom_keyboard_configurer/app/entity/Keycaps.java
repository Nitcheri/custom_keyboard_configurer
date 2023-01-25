package custom_keyboard_configurer.app.entity;

import lombok.Data;

@Data
public class Keycaps extends AbstractEntity<Integer>{
    private Integer id;
    private String profile;
    private String firm;
    private String material;
    private Integer cost;

    @Override
    public Integer getId() {
        return this.id;
    }
}