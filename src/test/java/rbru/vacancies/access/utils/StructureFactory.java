package rbru.vacancies.access.utils;

import rbru.vacancies.access.model.Department;
import rbru.vacancies.access.model.StructureNode;
import rbru.vacancies.access.model.User;

public class StructureFactory {
    public StructureNode createNode(String it) {
        String[] params = it.split(";");
        if (params[TYPE_POS].equals("D"))
            return buildDepartment(params);
        else
            return buildUser(params);
    }

    private User buildUser(String[] params) {
        User user = new User();
        user.setId(getInt(params[ID_POS]));
        user.setParentId(getInt(params[PARENT_POS]));
        user.setName(getString(params[NAME_POS]));
        return user;
    }

    private String getString(String param) {
        return param.trim();
    }

    private int getInt(String param) {
        return Integer.parseInt(param.trim());
    }

    private Department buildDepartment(String[] params) {
        Department department = new Department();
        department.setId(getInt(params[ID_POS]));
        department.setParentId(getInt(params[PARENT_POS]));
        department.setName(getString(params[NAME_POS]));
        return department;
    }

    private static final int ID_POS=0;
    private static final int TYPE_POS=1;
    private static final int NAME_POS=2;
    private static final int PARENT_POS=3;
}
