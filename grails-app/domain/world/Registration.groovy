package world

class Registration {

	String name
	Date dateofbirth
	String gender
	String address
	String city
	String state 
	String zipcode
	String email
	Date dateCreated


	static mapping = {
		autoTimestamp false

	}
   static belongsTo = [race:Race] 
	static constraints = {


	}



}