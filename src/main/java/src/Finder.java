package src;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Finder {
    /**
     * Поиск групп людей старше определенного возраста.
     *
     * @param groups группы
     * @param targetAge возраст для поиска
     * @return список имен групп из списка групп старше возраста targetAge
     */
    public static Set<String> findOldMembers(List<MembersGroup> groups, int targetAge) {  //изменен на static
        return groups.stream() //stream MembersGroup
                .flatMap(membersGroup -> membersGroup.getMembers().stream()) // Members
                .filter(member -> member.getAge() > targetAge)
                .map(Member::getName) //names
                .collect(Collectors.toSet());
    }
}
