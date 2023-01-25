package custom_keyboard_configurer.app.repository.impl;
import custom_keyboard_configurer.app.entity.Switches;
import custom_keyboard_configurer.app.repository.SwitchesRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SwitchesRepositoryImpl implements SwitchesRepository {
    private List<Switches> list = new ArrayList<>();
    
    @Override
    public synchronized Switches findSwithesById(int id) {
        for (Switches switches : list) {
            if (switches.getId() == id)
                return switches;
        }
        return null;
    }
    @Override
    public synchronized Switches findSwithesByProfile(String profile) {
        for (Switches switches : list) {
            if (Objects.equals(switches.getProfile(), profile))
                return switches;
        }
        return null;
    }
    @Override
    public synchronized Switches findSwithesByType(String type) {
        for (Switches switches : list) {
            if (Objects.equals(switches.getType(), type))
                return switches;
        }
        return null;
    }
    @Override
    public synchronized Switches findSwithesByForce(int force) {
        for (Switches switches : list) {
            if (Objects.equals(switches.getForce(), force))
                return switches;
        }
        return null;
    }
    @Override
    public Switches findSwithesByCost(int cost) {
        for (Switches swithes : list) {
            if (Objects.equals(swithes.getCost(), cost))
                return swithes;
        }
        return null;
    }
    @Override
    public List<Switches> findAllSwitches() {
        return list;
    }
    @Override
    public void add(Switches switches) {
        this.list.add(switches);
    }

    @Override
    public void delete(Switches switches) {
        this.list.remove(switches);
    }

    @Override
    public void deleteById(int id) {
        this.list.remove(id);
    }
}