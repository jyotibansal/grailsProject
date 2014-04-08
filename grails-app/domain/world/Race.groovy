package world

class Race {

	String name
	Date startDate
	String city
	String state 
	BigDecimal distance
	BigDecimal cost 
	Integer maxRunners = 100000

	static mapping = {

		sort "startDate"   
	}
  static hasMany =[registrations:Registration]

   String toString(){ 
   	
    return "${name}, ${startDate?.format('MM/dd/yyyy')}"
    }

	static constraints = {

		name(blank : false,maxSize : 50)

		state(inList:["GA","NC","SC","VA"]) 

		distance(min : 0.0 ) 

		cost(min:0.0,max:100.0) 

		maxRunners(min : 0, max : 100000) 
	}





}