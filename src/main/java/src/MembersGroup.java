package src;

import java.util.List;


public class MembersGroup {
    private final String groupName;
    private final List<Member> members;

    public MembersGroup(String groupName, List<Member> members) {
        this.groupName = groupName;
        this.members = members;
    }

    public List<Member> getMembers() {
        return members;
    }
}
