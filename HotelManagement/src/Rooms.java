
public class Rooms {

	private int roomNumber;
    private int roomTypeId;
    private int bedCount;
    private int maximumOccupancy;
    private String availabilityStatus;
    
	public Rooms(int roomNumber, int roomTypeId, int bedCount, int maximumOccupancy, String availabilityStatus) {
		super();
		this.roomNumber = roomNumber;
		this.roomTypeId = roomTypeId;
		this.bedCount = bedCount;
		this.maximumOccupancy = maximumOccupancy;
		this.availabilityStatus = availabilityStatus;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(int roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public int getBedCount() {
		return bedCount;
	}

	public void setBedCount(int bedCount) {
		this.bedCount = bedCount;
	}

	public int getMaximumOccupancy() {
		return maximumOccupancy;
	}

	public void setMaximumOccupancy(int maximumOccupancy) {
		this.maximumOccupancy = maximumOccupancy;
	}

	public String getAvailabilityStatus() {
		return availabilityStatus;
	}

	public void setAvailabilityStatus(String availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}

	@Override
	public String toString() {
		return "Rooms [roomNumber=" + roomNumber + ", roomTypeId=" + roomTypeId + ", bedCount=" + bedCount
				+ ", maximumOccupancy=" + maximumOccupancy + ", availabilityStatus=" + availabilityStatus + "]";
	}
    
}
