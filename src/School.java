import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class School {
    private List<Person> members;

    public School() {
        members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    @Override
    public String toString() {
        members.sort(Comparator.comparing(person -> person.toString()));
        StringBuilder sb = new StringBuilder();
        for (Person member : members) {
            sb.append(member.toString()).append("\n");
        }
        return sb.toString();
    }
}