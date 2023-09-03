package springAnnotation.Annotate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
//	@Autowired
  @Qualifier("stu123")
  Address address;



  public void setAddress(Address address) {
      this.address = address;
  }


//  public void displayDetails()
//  {
//     

public void displayDetails() {
	
	 System.out.println(address.getFlatNo()+"\t"+address.getCity());
}

	
}



