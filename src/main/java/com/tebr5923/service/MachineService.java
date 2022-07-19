package com.tebr5923.service;

import com.tebr5923.domain.model.Machine;

import java.util.List;
import java.util.Optional;

public interface MachineService {
    Optional<Machine> getById(Long id);

    List<Machine> getAll();

    void save(Machine model);

    void update(Machine model);

    void delete(Machine model);

    int[] saveAll(List<Machine> modelList);
}
