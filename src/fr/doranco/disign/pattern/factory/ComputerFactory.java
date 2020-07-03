package fr.doranco.disign.pattern.factory;



public class ComputerFactory {

	
	public Computer getComputer(String ram,String hdd,String cpu, Object PC, Computer Server) {
		Computer computer = null;
		if(computer == PC) {
			System.out.println(PC);
			
		}else if(computer == Server) {
			System.out.println(Server);
		}
		return computer;
		
	}

	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		
		if("PC".equalsIgnoreCase(type))
        return new PC(ram,hdd,cpu);
        else if("Server".equalsIgnoreCase(type))
        	return new Server(ram,hdd,cpu);
        else if("Tablette".equalsIgnoreCase(type))
        	return new Tablette(ram,hdd,cpu);
        
        return null;
        
	}

	

	
	 
		



	
		
	

}
