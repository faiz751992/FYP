package asdfg;
import java.io.*;

public class carmodel {
	String branddata;
	String modeldata;
	String extramodel;
	double cccsv;
	int geartype;
	int gearno;
	double otrcsv;
	String segment;
	int airbagcsv;
	int seatcsv;
	int doorcsv;

	//default constructor
	public carmodel(){
		branddata = "";
		modeldata = "";
		extramodel = "";
		cccsv = 0.00;
		geartype = 0;
		gearno = 0;
		otrcsv = 0.00;
		segment = "";
		airbagcsv = 0;
		seatcsv = 0;
		doorcsv = 0;
	}

	//normal constructor
	public carmodel(String branddata, String modeldata, String extramodel, double cccsv, int geartype, int gearno, double otrcsv, String segment, int airbagcsv, int seatcsv, int doorcsv){
		this.branddata = branddata;
		this.modeldata = modeldata;
		this.extramodel = extramodel;
		this.cccsv = cccsv;
		this.geartype = geartype;
		this.gearno = gearno;
		this.otrcsv = otrcsv;
		this.segment = segment;
		this.airbagcsv = airbagcsv;
		this.seatcsv = seatcsv;
		this.doorcsv = doorcsv;
	}

	//group setter or mutator
	public void setCarmodel(String branddata, String modeldata, String extramodel, double cccsv, int geartype, int gearno, double otrcsv, String segment, int airbagcsv, int seatcsv, int doorcsv){
		this.branddata = branddata;
		this.modeldata = modeldata;
		this.extramodel = extramodel;
		this.cccsv = cccsv;
		this.geartype = geartype;
		this.gearno = gearno;
		this.otrcsv = otrcsv;
		this.segment = segment;
		this.airbagcsv = airbagcsv;
		this.seatcsv = seatcsv;
		this.doorcsv = doorcsv;
	}
	
	//individual setter
	public void setBranddata(String branddata){ this.branddata = branddata; }
	public void setModeldata(String modeldata){ this.modeldata = modeldata; }
	public void setExtramodel(String extramodel){ this.extramodel = extramodel; }
	public void setCccsv(double cccsv){ this.cccsv = cccsv; }	
	public void setGeartype(int geartype){ this.geartype = geartype; }
	public void setGearno(int gearno){ this.gearno = gearno; }
	public void setOtrcsv(double otrcsv){ this.otrcsv = otrcsv; }
	public void setSegment(String segment){ this.segment = segment; }
	public void setAirbagcsv(int airbagcsv){ this.airbagcsv = airbagcsv; }
	public void setSeatcsv(int seatcsv){ this.seatcsv = seatcsv; }
	public void setDoorcsv(int doorcsv){ this.doorcsv = doorcsv; }

	//getter or retriever
	public String getBranddata() { return branddata; }
	public String getModeldata() { return modeldata; }
	public String getExtramodel() { return extramodel; }
	public double getCccsv() { return cccsv; }
	public int getGeartype() { return geartype; }
	public int getGearno() { return gearno; }
	public double getOtrcsv() { return otrcsv; }
	public String getSegment() { return segment; }
	public int getAirbagcsv() { return airbagcsv; }
	public int getSeatcsv() { return seatcsv; }
	public int getDoorcsv() { return doorcsv; }
	
	//printer
	public String toString(){
		return "Brand: " + branddata +
				"\nModel: " + modeldata +
				"\nExtra model: " +extramodel +
				"\nCC: " + cccsv +
				"\nGear Type: " + geartype +
				"\nGear no: " + gearno +
				"\nOTR Price: " + otrcsv +
				"\nSegment: " + segment +
				"\nAir bag: " + airbagcsv +
				"\nSeat: " + seatcsv +
				"\nDoor: " + doorcsv;
	}
}
