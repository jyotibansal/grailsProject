import world.Race

class BootStrap {

    def init = { servletContext ->
    	new Race([
    		 name: "New Race",
			startDate: new Date(),
	 		city: "Hoshiarpur",
	 		state: "GA",
	 		cost: 50.0,
	 		distance: 10.0, 
	 		maxRunners: 15000
    		]).save(failOnError: true)
    		
    }
    def destroy = {
    }
}
