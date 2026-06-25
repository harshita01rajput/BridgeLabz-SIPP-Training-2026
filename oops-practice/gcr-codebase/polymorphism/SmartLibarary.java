class LibraryMember {
    protected String memberName;
    protected String memberId;

    public LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    public double calculateFine(int overdueDays) {
        return 0;
    }

    public void printDetails() {
        System.out.println("Name      : " + memberName);
        System.out.println("Member ID : " + memberId);
    }
}

class StudentMember extends LibraryMember {

    public StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 2.0;
    }
}

class FacultyMember extends LibraryMember {

    public FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 1.0;
    }
}

class GuestMember extends LibraryMember {

    public GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 5.0;
    }
}

public class SmartLibarary {

    public static void findMember(
            LibraryMember[] members,
            String searchId) {

        boolean found = false;

        for (LibraryMember m : members) {
            if (m.memberId.equals(searchId)) {
                System.out.println("\nMember Found:");
                m.printDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nNo member found with ID: "
                    + searchId);
        }
    }

    public static void main(String[] args) {

        LibraryMember[] members = {
                new StudentMember("Harshita", "S101"),
                new FacultyMember("Dr. Sharma", "F201"),
                new GuestMember("Rahul", "G301")
        };

        int overdueDays = 5;

        System.out.println("=== Member Details & Fine ===\n");

        for (LibraryMember m : members) {

            m.printDetails();

            // Runtime Polymorphism
            System.out.println(
                    "Fine : ₹" +
                    m.calculateFine(overdueDays)
            );

            System.out.println();
        }

        // Search by ID
        findMember(members, "F201");
    }
}
