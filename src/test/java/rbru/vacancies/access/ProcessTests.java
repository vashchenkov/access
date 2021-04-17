package rbru.vacancies.access;

import org.junit.jupiter.api.BeforeAll;
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
    private StructureNode struture = TestDataReader.readStructure();
    private Access access = TestDataReader.readAccess();


    @Test
    public void ShouldReturnTrueWhenCheckYandexAccessForVanya() {
        User vanya = getUser("Vanya");
        Access yandex = getAccess("Yandex");
        boolean result = sut.checkAccess(vanya, yandex);
        assertTrue(result);
    }

    private User getUser(String username) {
        return null;
    }

    private Access getAccess(String accessname) {
        return null;
    }
}
