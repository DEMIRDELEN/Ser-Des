package ser_deser;

import java.io.Serializable;

public class User implements Serializable {
    /**
     * Deserialization yapan taraf serialVersionUID numaralarını karşılaştırıyor farklı ise
     * aşağıdaki exceptionu fırlatıyor.
     * java.io.InvalidClassException: com.tpe.ser_deser.User; local class incompatible:
     */
//	private static final long serialVersionUID = 1L;


    private Long id;
    private String name;
    private String ssn;


    public User(Long id, String name, String ssn) {
        this.id = id;
        this.name = name;
        this.ssn = ssn;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getSsn() {
        return ssn;
    }


    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", ssn=" + ssn + "]";
    }


}
