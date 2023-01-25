package custom_keyboard_configurer.app.repository;

import java.util.List;

import custom_keyboard_configurer.app.entity.Keycaps;

public interface KeycapsRepository {
    void add(Keycaps keycaps);
    void delete(Keycaps keycaps);
    void deleteById(int id);
    Keycaps findKeycapsById(int id);
    Keycaps findKeycapsByProfile(String profile);
    Keycaps findKeycapsByFirm(String firm);
    Keycaps findKeycapsByMaterial(String material);
    Keycaps findKeycapsByCost(int cost);
    List<Keycaps> findAllKeycaps();
}