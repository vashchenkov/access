package rbru.vacancies.access.repository;

import rbru.vacancies.access.model.Access;

import java.util.HashMap;
import java.util.Map;

public class AccessRepository {

    private static AccessRepository instance = new AccessRepository();
    public static AccessRepository getInstance() {
        return instance;
    }
    static Map<Integer, Access> accessHolder = new HashMap<>();

    public void addAccess(Access access) {
        accessHolder.put(access.getId(), access);
    }

    public Access getAccessById(int accessId) {
        return accessHolder.get(accessId);
    }
}
