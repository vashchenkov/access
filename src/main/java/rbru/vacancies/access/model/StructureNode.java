package rbru.vacancies.access.model;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString(exclude = {"parent"})
public abstract class StructureNode {
    private int id;
    private String name;
    private int parentId;
    private StructureNode parent;
    private List<Access> accesses = new ArrayList<>();
}
