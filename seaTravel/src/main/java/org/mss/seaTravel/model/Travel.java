package org.mss.seaTravel.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Sea_Travel")

public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 3, max = 50)
    private String destination;

    @NotBlank
    @Size(min = 3, max = 50)
    private String date_depart;
    @NotBlank
    @Size(min = 3, max = 50)
    private String heure_depart;
    @NotBlank
    @Size(min = 3, max = 50)
    private String company;
    private Boolean available;
private int maxCapacity;
    public String getHeure_depart() {
        return heure_depart;
    }

    public void setHeure_depart(String heure_depart) {
        this.heure_depart = heure_depart;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(String date_depart) {
        this.date_depart = date_depart;
    }

 
   



   

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Travel(Long id, @NotBlank @Size(min = 3, max = 50) String destination,
			@NotBlank @Size(min = 3, max = 50) String date_depart,
			@NotBlank @Size(min = 3, max = 50) String heure_depart, @NotBlank @Size(min = 3, max = 50) String company,
			Boolean available, int maxCapacity) {
		super();
		this.id = id;
		this.destination = destination;
		this.date_depart = date_depart;
		this.heure_depart = heure_depart;
		this.company = company;
		this.available = available;
		this.maxCapacity = maxCapacity;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public Travel() {
    }
}