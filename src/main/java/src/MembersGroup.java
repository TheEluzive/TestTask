package src;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class MembersGroup {
    private final String groupName;
    private final List<Member> members;

}
