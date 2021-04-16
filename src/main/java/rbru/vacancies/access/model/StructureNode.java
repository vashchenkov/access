package rbru.vacancies.access.model;

import lombok.Data;

import java.util.List;

@Data
public abstract class StructureNode {
    protected StructureNode parent;
    protected String name;
    protected List<Access> accesses;
}
