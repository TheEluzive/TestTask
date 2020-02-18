package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;


public class Main {

    public static void main(String[] args) {

        ArrayList<Member> listMembers = new ArrayList<Member>(){};
        Collections.addAll(listMembers, new Member("Andrey", 12), new Member("NeAndrey", 22),
                new Member("Rudolf ", 44));

        MembersGroup membersGroup = new MembersGroup("Humans", listMembers);
        ArrayList<MembersGroup> membersGroups = new ArrayList<>();
        membersGroups.add(membersGroup);

        Set<String> set = Finder.findOldMembers(membersGroups, 20);
        for (String names : set){
            System.out.println(names);
        }
    }

}
