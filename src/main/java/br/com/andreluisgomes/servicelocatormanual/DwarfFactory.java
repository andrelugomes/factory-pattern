package br.com.andreluisgomes.servicelocatormanual;

import br.com.andreluisgomes.servicelocatormanual.domain.Dwarf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DwarfFactory {

    @Autowired
    private List<Dwarf> dwarves;

    private Map<String, Dwarf> map = new HashMap<>();

    @PostConstruct
    public void init(){
        dwarves.forEach(dwarf -> map.put(dwarf.name(), dwarf));
    }

    public Dwarf of(String name){
        return map.get(name);
    }

    public Dwarf ofOrThrow(String name){
       return dwarves.stream()
               .filter(dwarf -> name.equals(dwarf.name()))
               .findAny()
               .orElseThrow(()-> new RuntimeException("Unknown Dwarf Boss!"));
    }
}
