import java.util.Scanner;

class HotelBooking {
    String guestName, roomType;
    int nights;

    HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }

    HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }

    HotelBooking(HotelBooking hb) {
        guestName = hb.guestName;
        roomType = hb.roomType;
        nights = hb.nights;
    }

    void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Guest Name:");
        String guestName = sc.nextLine();

        System.out.println("Enter Room Type:");
        String roomType = sc.nextLine();

        System.out.println("Enter Number of Nights:");
        int nights = sc.nextInt();

        HotelBooking booking = new HotelBooking(guestName, roomType, nights);
        booking.display();

        sc.close();
    }
}
