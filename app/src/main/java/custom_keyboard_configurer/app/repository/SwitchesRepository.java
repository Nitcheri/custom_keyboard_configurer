package custom_keyboard_configurer.app.repository;

import java.util.List;

import custom_keyboard_configurer.app.entity.Switches;

public interface SwitchesRepository {
    void add(Switches switches);
    void delete(Switches switches);
    void deleteById(int id);
    Switches findSwithesById(int id);
    Switches findSwithesByProfile(String profile);
    Switches findSwithesByType(String type);
    Switches findSwithesByForce(int force);
    Switches findSwithesByCost(int cost);
    List<Switches> findAllSwitches();
}
