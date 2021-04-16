package rbru.vacancies.access.model;

import lombok.Data;

import java.util.List;

@Data
public class Access {
    private Access parent;
    private String name;
    private List<Access> children;
}
