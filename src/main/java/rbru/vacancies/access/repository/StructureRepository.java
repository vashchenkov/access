package rbru.vacancies.access.repository;

import rbru.vacancies.access.model.StructureNode;

import java.util.HashMap;
import java.util.Map;

public class StructureRepository {

    private static StructureRepository instance = new StructureRepository();
    public static StructureRepository getInstance() {
        return instance;
    }
    static Map<Integer, StructureNode> structureHolder = new HashMap<>();

    public void addAccess(StructureNode access) {
        structureHolder.put(access.getId(), access);
    }

    public StructureNode getStructureNodeById(int accessId) {
        return structureHolder.get(accessId);
    }
}
