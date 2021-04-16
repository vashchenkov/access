package rbru.vacancies.access;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import rbru.vacancies.access.model.Access;
import rbru.vacancies.access.model.User;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProcessTests {

    private Processor sut = new Processor();
    
    @BeforeAll
    private static void initContent() {

    }

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
