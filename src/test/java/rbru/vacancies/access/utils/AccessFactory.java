package rbru.vacancies.access.utils;

import com.sun.xml.internal.bind.v2.model.core.ID;
import rbru.vacancies.access.model.Access;

public class AccessFactory {
    public Access createAccess(String line) {
        String[] params = line.split(";");
        Access access = new Access();
        access.setId(getInt(params[ID_POS]));
        access.setParentId(getInt(params[PARENT_POS]));
        access.setName(getString(params[NAME_POS]));
        return access;
    }

    private String getString(String param) {
        return param.trim();
    }

    private int getInt(String param) {
        return Integer.parseInt(param.trim());
    }


    private static final int ID_POS=0;
    private static final int NAME_POS=1;
    private static final int PARENT_POS=2;
}
