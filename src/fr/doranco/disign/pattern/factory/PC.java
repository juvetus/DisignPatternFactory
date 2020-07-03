package fr.doranco.disign.pattern.factory;

public class PC extends Computer{
	private String ram;
	private String hdd;
	private String cpu;
	
	
	
	public PC(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	
	
	
	public String getRam() {
		return ram;
	}



	public String getHdd() {
		return hdd;
	}



	public String getCpu() {
		return cpu;
	}



	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}



	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}



	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}



	@Override
	public String toString() {
		return "PC [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}



	
	
	
	

}
