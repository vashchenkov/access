package rbru.vacancies.access.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Department extends StructureNode{
    private List<StructureNode> children = new ArrayList<>();

    public void addChild(StructureNode child) {
        children.add(child);
    }
}
