package custom_keyboard_configurer.app.repository;

import java.util.List;

import custom_keyboard_configurer.app.entity.Set;

public interface SetRepository {
    void add(Set set);
    void delete(Set set);
    void deleteById(int id);
    Set findSetById(int id);
    Set findSetByFirm(String firm);
    Set findSetByType(String type);
    Set findSetByCost(int cost);
    List<Set> findAllSet();
}
