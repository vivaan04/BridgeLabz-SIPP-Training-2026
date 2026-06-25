class LibraryMember {
    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    void calculateFine(int overdueDays) {
        System.out.println("Fine: 0");
    }
}

class StudentMember extends LibraryMember {

    StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    void calculateFine(int overdueDays) {
        System.out.println("Student Fine = ₹" + (overdueDays * 2));
    }
}

class FacultyMember extends LibraryMember {

    FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    void calculateFine(int overdueDays) {
        System.out.println("Faculty Fine = ₹" + (overdueDays * 1));
    }
}

class GuestMember extends LibraryMember {

    GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    void calculateFine(int overdueDays) {
        System.out.println("Guest Fine = ₹" + (overdueDays * 5));
    }
}

public class Main {
    public static void main(String[] args) {

        StudentMember s = new StudentMember("Rahul", "S101");
        FacultyMember f = new FacultyMember("Amit", "F201");
        GuestMember g = new GuestMember("Riya", "G301");

        s.calculateFine(5);
        f.calculateFine(5);
        g.calculateFine(5);
    }
}