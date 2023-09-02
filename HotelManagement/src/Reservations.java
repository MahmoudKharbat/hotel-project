import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reservations {
    private int reservationId;
    private int guestId;
    private int roomNumber;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int totalGuests;
    private LocalDateTime reservationDate;
    
	public Reservations(int reservationId, int guestId, int roomNumber, LocalDate checkInDate, LocalDate checkOutDate,
			int totalGuests, LocalDateTime reservationDate) {
		super();
		this.reservationId = reservationId;
		this.guestId = guestId;
		this.roomNumber = roomNumber;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.totalGuests = totalGuests;
		this.reservationDate = reservationDate;
	}

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public int getGuestId() {
		return guestId;
	}

	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public int getTotalGuests() {
		return totalGuests;
	}

	public void setTotalGuests(int totalGuests) {
		this.totalGuests = totalGuests;
	}

	public LocalDateTime getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(LocalDateTime reservationDate) {
		this.reservationDate = reservationDate;
	}

	@Override
	public String toString() {
		return "Reservations [reservationId=" + reservationId + ", guestId=" + guestId + ", roomNumber=" + roomNumber
				+ ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", totalGuests=" + totalGuests
				+ ", reservationDate=" + reservationDate + "]";
	}

}
