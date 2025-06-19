package demo;

public class Customer {

       private int id;
       private String name;
       private String city;
       
       public void setId(int id){
    	   this.id = id;
    	   
    	   
    	   
       }

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}
       
	}


