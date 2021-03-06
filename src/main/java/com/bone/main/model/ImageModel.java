package com.bone.main.model;
import javax.persistence.*;

@Entity
@Table(name="images")
public class ImageModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int imageId;
	@Column(name = "name")
	private String name;
	@Column(name="type")
	private String type;
	@Column(name="size")
	private long size;
	
	@Lob	// @Lob used for converting image into binary format
	@Column(name="pic")
	private byte[] img;
	
	public long getSize() {
		return size;
	}
	
	public void setSize(long size) {
		this.size = size;
	}
	
	public ImageModel() {
		// TODO Auto-generated constructor stub
	}
	
	public ImageModel(String name, String type, byte[] img) {
		super();
		this.name = name;
		this.type = type;
		this.img = img;
	}
	
	public ImageModel(String name, String type, long size, byte[] img) {
		super();
		this.name = name;
		this.type = type;
		this.size = size;
		this.img = img;
	}

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}
	
}
