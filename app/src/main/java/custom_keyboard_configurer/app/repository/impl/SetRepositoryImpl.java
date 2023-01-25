package custom_keyboard_configurer.app.repository.impl;
import custom_keyboard_configurer.app.entity.Set;
import custom_keyboard_configurer.app.repository.SetRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SetRepositoryImpl implements SetRepository{
    private List<Set> list = new ArrayList<>();
    
    @Override
    public Set findSetById(int id) {
        for (Set set : list) {
            if (set.getId() == id)
                return set;
        }
        return null;
    }
    @Override
    public Set findSetByFirm(String firm) {
        for (Set set : list) {
            if (Objects.equals(set.getFirm(), firm))
                return set;
        }
        return null;
    }
    @Override
    public Set findSetByType(String type) {
        for (Set set : list) {
            if (Objects.equals(set.getFirm(), type))
                return set;
        }
        return null;
    }
    @Override
    public Set findSetByCost(int cost) {
        for (Set set : list) {
            if (Objects.equals(set.getFirm(), cost))
                return set;
        }
        return null;
    }
    @Override
    public List<Set> findAllSet() {
        return list;
    }
    @Override
    public void add(Set set) {
        this.list.add(set);
    }

    @Override
    public void delete(Set set) {
        this.list.remove(set);
    }

    @Override
    public void deleteById(int id) {
        this.list.remove(id);
    }
}
