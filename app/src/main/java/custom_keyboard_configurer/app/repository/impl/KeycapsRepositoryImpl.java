package custom_keyboard_configurer.app.repository.impl;
import custom_keyboard_configurer.app.entity.Keycaps;
import custom_keyboard_configurer.app.repository.KeycapsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class KeycapsRepositoryImpl implements KeycapsRepository {
    private List<Keycaps> list = new ArrayList<>();

    @Override
    public Keycaps findKeycapsById(int id) {
        for (Keycaps keycaps : list) {
            if (keycaps.getId() == id)
                return keycaps;
        }
        return null;
    }
    @Override
    public Keycaps findKeycapsByProfile(String profile) {
        for (Keycaps keycaps : list) {
            if (Objects.equals(keycaps.getProfile(), profile))
                return keycaps;
        }
        return null;
    }
    @Override
    public Keycaps findKeycapsByFirm(String firm) {
        for (Keycaps keycaps : list) {
            if (Objects.equals(keycaps.getFirm(), firm))
                return keycaps;
        }
        return null;
    }
    @Override
    public Keycaps findKeycapsByMaterial(String material) {
        for (Keycaps keycaps : list) {
            if (Objects.equals(keycaps.getMaterial(), material))
                return keycaps;
        }
        return null;
    }
    @Override
    public Keycaps findKeycapsByCost(int cost) {
        for (Keycaps keycaps : list) {
            if (Objects.equals(keycaps.getCost(), cost))
                return keycaps;
        }
        return null;
    }
    @Override
    public List<Keycaps> findAllKeycaps() {
        return list;
    }

    @Override
    public void add(Keycaps keycaps) {
        this.list.add(keycaps);
    }

    @Override
    public void delete(Keycaps keycaps) {
        this.list.remove(keycaps);
    }

    @Override
    public void deleteById(int id) {
        this.list.remove(id);
    }
}