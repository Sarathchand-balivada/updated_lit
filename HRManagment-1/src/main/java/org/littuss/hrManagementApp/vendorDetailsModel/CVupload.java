package org.littuss.hrManagementApp.vendorDetailsModel;	
//	import java.util.Arrays;
//	import jakarta.persistence.Column;
//	import jakarta.persistence.Entity;
//	import jakarta.persistence.GeneratedValue;
//	import jakarta.persistence.GenerationType;
//	import jakarta.persistence.Id;
//	import jakarta.persistence.Lob;
//	import jakarta.persistence.Table;
//	import lombok.Builder;
//
//	@Builder
//
//	@Entity
//	@Table(name = "ResumeDetails")
//
//	public class CVupload {
//	    @Id
//	    @GeneratedValue(strategy = GenerationType.AUTO)
//	    private Long id;
//
//	    private String name;
//	    private String type;
//	    @Lob
//	    
//	    @Column(name = "cvdata", length = 10000000) // Adjust the length based on your needs
//	// private String cvdata;
//
//	    private byte[] content;
//		public CVupload() {
//			
//		}
//		public CVupload(Long id, String name, String type, byte[] content) {
//			super();
//			this.id = id;
//			this.name = name;
//			this.type = type;
//			this.content = content;
//		}
//		public Long getId() {
//			return id;
//		}
//		public String getName() {
//			return name;
//		}
//		public String getType() {
//			return type;
//		}
//		public byte[] getContent() {
//			return content;
//		}
//		public void setId(Long id) {
//			this.id = id;
//		}
//		public void setName(String name) {
//			this.name = name;
//		}
//		public void setType(String type) {
//			this.type = type;
//		}
//		public void setContent(byte[] content) {
//			this.content = content;
//		}
//		@Override
//		public String toString() {
//			return "Tutorial [id=" + id + ", name=" + name + ", type=" + type + ", content=" + Arrays.toString(content)
//					+ "]";
//		}
//		public byte[] getcontent() {
//			
//			return null;
//		}
//		
//	    
//	    
//	}



import jakarta.persistence.Column;

//NEW



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class CVupload {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Lob
    @Column ( columnDefinition = "LONGBLOB")
    private byte[] content;

	public CVupload() {
		super();
		
	}

	public CVupload(Long id, String name, byte[] content) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public byte[] getContent() {
		return content;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}



}



