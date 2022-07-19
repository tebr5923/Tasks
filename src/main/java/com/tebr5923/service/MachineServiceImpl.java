package com.tebr5923.service;

import com.tebr5923.domain.model.Machine;
import com.tebr5923.repository.MachineRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
@Transactional
public class MachineServiceImpl implements MachineService {
    private final MachineRepository machineRepository;

    public MachineServiceImpl(MachineRepository machineRepository) {
        this.machineRepository = machineRepository;
    }

    @Override
    public Optional<Machine> findById(Long id) {
        return machineRepository.findById(id);
    }

    @Override
    public List<Machine> findAll() {
        List<Machine> machines = new ArrayList();
        Iterator<Machine> iterator = machineRepository.findAll().iterator();
        if (iterator.hasNext()) {
            machines.add(iterator.next());
        }
        return machines;
    }

    @Override
    public void save(Machine model) {
        machineRepository.save(model);
    }

    @Override
    public void update(Machine model) {

    }

    @Override
    public void delete(Machine model) {
        machineRepository.delete(model);
    }

    @Override
    public int[] saveAll(List<Machine> modelList) {
        return new int[0];
    }
}
