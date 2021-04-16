package rbru.vacancies.access.model;

import lombok.Data;

import java.util.List;

@Data
public class Department extends StructureNode{
    private List<StructureNode> children;
}
