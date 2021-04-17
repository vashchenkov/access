package rbru.vacancies.access.utils;

import rbru.vacancies.access.model.Access;
import rbru.vacancies.access.model.Department;
import rbru.vacancies.access.model.StructureNode;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class TestDataReader {
    private static StructureFactory structureFactory = new StructureFactory();
    private static AccessFactory accessFactory = new AccessFactory();

    public static StructureNode readStructure() throws URISyntaxException, IOException {

        URL systemResource = ClassLoader.getSystemResource("organization-structure.txt");
        List<StructureNode> lines = Files.readAllLines(Paths.get(systemResource.toURI()))
                .stream().map(it -> structureFactory.createNode(it)).collect(Collectors.toList());

        StructureNode first = lines.get(0);
        StructureNode[] previous = new StructureNode[1];
        StructureNode[] current = new StructureNode[1];
        lines.forEach(it -> {
                    current[0] = it;
                    if ((current[0]).getParentId() == 0) {
                        previous[0] = current[0];
                        return;
                    }
                    while (current[0].getParentId() != previous[0].getId()) {
                        previous[0] = previous[0].getParent();
                    }
                    if (previous[0] != null) {
                        ((Department) previous[0]).addChild(current[0]);
                        current[0].setParent(previous[0]);
                    }
                    previous[0] = current[0];
                }
        );
        return first;
    }

    public static Access readAccess() throws URISyntaxException, IOException {

        URL systemResource = ClassLoader.getSystemResource("accesses.txt");
        List<Access> lines = Files.readAllLines(Paths.get(systemResource.toURI()))
                .stream().map(it -> accessFactory.createAccess(it)).collect(Collectors.toList());

        Access first = lines.get(0);
        Access[] previous = new Access[1];
        Access[] current = new Access[1];
        lines.forEach(it -> {
                    current[0] = it;
                    if ((current[0]).getParentId() == 0) {
                        previous[0] = current[0];
                        return;
                    }
                    while (current[0].getParentId() != previous[0].getId()) {
                        previous[0] = previous[0].getParent();
                    }
                    if (previous[0] != null) {
                        previous[0].addChild(current[0]);
                        current[0].setParent(previous[0]);
                    }
                    previous[0] = current[0];
                }
        );
        return first;
    }

    static StructureNode readAccesses() {
        return null;
    }
}
