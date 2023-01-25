package custom_keyboard_configurer.app;

import custom_keyboard_configurer.app.entity.Keycaps;
import custom_keyboard_configurer.app.entity.Set;
import custom_keyboard_configurer.app.entity.Switches;
import custom_keyboard_configurer.app.repository.KeycapsRepository;
import custom_keyboard_configurer.app.repository.SetRepository;
import custom_keyboard_configurer.app.repository.SwitchesRepository;
import custom_keyboard_configurer.app.repository.impl.KeycapsRepositoryImpl;
import custom_keyboard_configurer.app.repository.impl.SetRepositoryImpl;
import custom_keyboard_configurer.app.repository.impl.SwitchesRepositoryImpl;

import java.io.IOException;

public class CustomKeyboardConfigurerApp {
    private static KeycapsRepository KEYCAPS_REPOSITORY = new KeycapsRepositoryImpl();
    private static SwitchesRepository SWITCHES_REPOSITORY = new SwitchesRepositoryImpl();
    private static SetRepository SET_REPOSITORY = new SetRepositoryImpl();

    public static void main(String[] args) throws IOException {
        var firstKeycaps = new Keycaps();
        firstKeycaps.setId(1);
        firstKeycaps.setProfile("low");
        firstKeycaps.setCost(1000);
        firstKeycaps.setMaterial("ABS");
        firstKeycaps.setFirm("IDOBAO Cantaloupe");
        var secondKeycaps = new Keycaps();
        secondKeycaps.setId(2);
        secondKeycaps.setProfile("normal");
        secondKeycaps.setCost(3000);
        secondKeycaps.setMaterial("PBT");
        secondKeycaps.setFirm("EnjoyPBT");
        KEYCAPS_REPOSITORY.add(firstKeycaps);
        KEYCAPS_REPOSITORY.add(secondKeycaps);
        var firstSwitches = new Switches();
        firstSwitches.setId(1);
        firstSwitches.setProfile("low");
        firstSwitches.setCost(1000);
        firstSwitches.setType("linear");
        firstSwitches.setForce(45);
        SWITCHES_REPOSITORY.add(firstSwitches);
        var firstSet = new Set();
        firstSet.setId(1);
        firstSet.setFirm("NEREALNAYA");
        firstSet.setCost(5000);
        firstSet.setType("60%");
        SET_REPOSITORY.add(firstSet);
        System.out.println(KEYCAPS_REPOSITORY.findAllKeycaps());
        System.out.println(SWITCHES_REPOSITORY.findAllSwitches());
        System.out.println(SET_REPOSITORY.findAllSet());
    }
}
