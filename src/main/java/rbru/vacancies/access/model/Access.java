package rbru.vacancies.access.model;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString(exclude = "parent")
public class Access {
    private int id;
    private int parentId;
    private Access parent;
    private String name;
    private List<Access> children = new ArrayList<>();

    public void addChild(Access access) {
        children.add(access);
    }
}
