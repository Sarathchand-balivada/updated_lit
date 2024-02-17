//package org.littuss.hrManagementApp.pdfModel;
//
//import java.util.Arrays;
//
////import jakarta.persistence.Column;
////
////import jakarta.persistence.Entity;
////import jakarta.persistence.GeneratedValue;
////import jakarta.persistence.GenerationType;
////import jakarta.persistence.Id;
////import jakarta.persistence.Table;
////
////
////@Entity
////@Table(name = "tutorials")
////
////public class Tutorial {
////
////	@Id
////	@GeneratedValue(strategy = GenerationType.AUTO)
////	private long id;
////
////	@Column(name = "title")
////	private String title;
////
////	@Column(name = "description")
////	private String description;
////
////	@Column(name = "published")
////	private boolean published;
////
////	public Tutorial() {
////
////	}
////
////	public Tutorial(String title, String description, boolean published) {
////		this.title = title;
////		this.description = description;
////		this.published = published;
////	}
////
////	public long getId() {
////		return id;
////	}
////
////	public String getTitle() {
////		return title;
////	}
////
////	public void setTitle(String title) {
////		this.title = title;
////	}
////
////	public String getDescription() {
////		return description;
////	}
////
////	public void setDescription(String description) {
////		this.description = description;
////	}
////
////	public boolean isPublished() {
////		return published;
////	}
////
////	public void setPublished(boolean isPublished) {
////		this.published = isPublished;
////	}
////
////	@Override
////	public String toString() {
////		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
////	}
////}
//
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Lob;
//import jakarta.persistence.Table;
//import lombok.Builder;
//
//@Builder
//
//@Entity
//@Table(name = "SarathResume")
//
//public class vendorupload {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    private String name;
//    private String type;
//    @Lob
//    
//    @Column(name = "cvdata", length = 10000000) // Adjust the length based on your needs
//// private String cvdata;
//
//    private byte[] content;
//	public vendorupload() {
//		
//	}
//	public vendorupload(Long id, String name, String type, byte[] content) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.type = type;
//		this.content = content;
//	}
//	public Long getId() {
//		return id;
//	}
//	public String getName() {
//		return name;
//	}
//	public String getType() {
//		return type;
//	}
//	public byte[] getContent() {
//		return content;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
//	public void setContent(byte[] content) {
//		this.content = content;
//	}
//	@Override
//	public String toString() {
//		return "Tutorial [id=" + id + ", name=" + name + ", type=" + type + ", content=" + Arrays.toString(content)
//				+ "]";
//	}
//	
//    
//    
//}