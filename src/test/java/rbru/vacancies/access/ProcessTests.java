package rbru.vacancies.access;

import org.junit.jupiter.api.Test;
import rbru.vacancies.access.model.Access;
import rbru.vacancies.access.model.StructureNode;
import rbru.vacancies.access.model.User;
import rbru.vacancies.access.utils.TestDataReader;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProcessTests {

    public ProcessTests() throws URISyntaxException, IOException {
    }

    private Processor sut = new Processor();

    @Test
    public void ShouldReturnTrueWhenCheckYandexAccessForVanya() {
        User vanya = (User) getUser(VANYA_ID);
        Access yandex = getAccess(YANDEX_ID);
        boolean result = sut.checkAccess(vanya, yandex);
        assertTrue(result);
    }

    private StructureNode getUser(int userId) {
        return TestDataReader.structureHolder.get(userId);
    }

    private Access getAccess(int accessId) {
        return TestDataReader.accessHolder.get(accessId);
    }

    private final static int VANYA_ID = 13;
    private final static int YANDEX_ID = 7;
}
