
public class RoomType {
	
	private int roomTypeId;
    private String roomTypeName;
    private String description;
    
	public RoomType(int roomTypeId, String roomTypeName, String description) {
		super();
		this.roomTypeId = roomTypeId;
		this.roomTypeName = roomTypeName;
		this.description = description;
	}

	public int getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(int roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public String getRoomTypeName() {
		return roomTypeName;
	}

	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "RoomType [roomTypeId=" + roomTypeId + ", roomTypeName=" + roomTypeName + ", description=" + description
				+ "]";
	}

}
