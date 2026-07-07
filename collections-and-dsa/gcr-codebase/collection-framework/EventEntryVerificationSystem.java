import java.util.HashSet;

public class EventEntryVerificationSystem {

    public static void main(String[] args) {

        HashSet<String> participants = new HashSet<>();

        registerParticipant(participants, "harshita@gmail.com");
        registerParticipant(participants, "riya@gmail.com");
        registerParticipant(participants, "amit@gmail.com");
        registerParticipant(participants, "harshita@gmail.com");
        registerParticipant(participants, "riya@gmail.com");
        registerParticipant(participants, "neha@gmail.com");

        System.out.println("\nUnique Registered Participants:");
        for (String email : participants) {
            System.out.println(email);
        }

        System.out.println("\nTotal Eligible Participants: " + participants.size());
    }

    public static void registerParticipant(HashSet<String> participants, String email) {

        if (participants.add(email)) {
            System.out.println(email + " registered successfully.");
        } else {
            System.out.println(email + " is already registered. Duplicate entry rejected.");
        }
    }
}