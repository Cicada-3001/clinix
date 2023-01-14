package main.java.com.example.demo.clinic;


import jakarta.persistence.*;

@Entity
@Table(name="clinics")
public class Clinic {
    @Id
    @SequenceGenerator(
            name= "clinic_sequence",
            sequenceName= "clinic_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "clinic_sequence"
    )
    
    @Column(name= "id")
    private long id;
    public String name;
    private String branch;
    
    
    @Column(length = 1500)
    private String about; 
    private String address; 
    private String value;
    private String email; 
    private String tel; 
    private String imgUrl;
    private String mapLink;
    

    public Clinic(){

    }

    public Clinic(String name, String branch, String about, String address, String value,
    		String email, String tel,String imgUrl, String mapLink) {
        this.name = name;
        this.branch = branch;
        this.about= about;
        this.address = address; 
        this.value = value;
        this.email = email; 
        this.tel = tel;
        this.imgUrl= imgUrl;
        this.mapLink= mapLink;
    }
    
 
	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    
    public String getMapLink() {
        return mapLink;
    }

    public void setMapLink(String mapLink) {
        this.mapLink = mapLink;
    }
    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    
    
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
   
    
    

    
    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    
    
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    public String getValue() {
        return value;
    }

    public void setValue(String address) {
        this.value =  value;
    }
    
    
    

   
}
