package custom_keyboard_configurer.app.entity;

import java.io.Serializable;

public interface Identifiable<E extends Serializable> {
    E getId();
}