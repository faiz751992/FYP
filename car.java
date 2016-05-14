package asdfg;

public class car implements Comparable<car> {
	String branddata;
	String modeldata;
	String extramodel;
	double cccsv;
	String geartype;
	int gearno;
	double otrcsv;
	double mInscsv;
	String segment;
	int airbagcsv;
	int seatcsv;
	int doorcsv;
	double distance;

	//default constructor
	public car(){
		branddata = "";
		modeldata = "";
		extramodel = "";
		cccsv = 0.00;
		geartype = "";
		gearno = 0;
		otrcsv = 0.00;
		mInscsv =0.00;
		segment = "";
		airbagcsv = 0;
		seatcsv = 0;
		doorcsv = 0;
		distance = 0.00;
	}

	//normal constructor
	public car(String branddata, String modeldata, String extramodel, double cccsv, String geartype, int gearno, double otrcsv, double mInscsv, String segment, int airbagcsv, int seatcsv, int doorcsv, double distance){
		this.branddata = branddata;
		this.modeldata = modeldata;
		this.extramodel = extramodel;
		this.cccsv = cccsv;
		this.geartype = geartype;
		this.gearno = gearno;
		this.otrcsv = otrcsv;
		this.mInscsv = mInscsv;
		this.segment = segment;
		this.airbagcsv = airbagcsv;
		this.seatcsv = seatcsv;
		this.doorcsv = doorcsv;
		this.distance = distance;
	}

	//group setter or mutator
	public void setCarResult(String branddata, String modeldata, String extramodel, double cccsv, String geartype, int gearno, double otrcsv, double mInscsv, String segment, int airbagcsv, int seatcsv, int doorcsv, double distance){
		this.branddata = branddata;
		this.modeldata = modeldata;
		this.extramodel = extramodel;
		this.cccsv = cccsv;
		this.geartype = geartype;
		this.gearno = gearno;
		this.otrcsv = otrcsv;
		this.mInscsv = mInscsv;
		this.segment = segment;
		this.airbagcsv = airbagcsv;
		this.seatcsv = seatcsv;
		this.doorcsv = doorcsv;
		this.distance = distance;
	}
	
	//individual setter
	public void setBranddata(String branddata){ this.branddata = branddata; }
	public void setModeldata(String modeldata){ this.modeldata = modeldata; }
	public void setExtramodel(String extramodel){ this.extramodel = extramodel; }
	public void setCccsv(double cccsv){ this.cccsv = cccsv; }	
	public void setGeartype(String geartype){ this.geartype = geartype; }
	public void setGearno(int gearno){ this.gearno = gearno; }
	public void setOtrcsv(double otrcsv){ this.otrcsv = otrcsv; }
	public void setMInscsv(double mInscsv){ this.mInscsv = mInscsv; }
	public void setSegment(String segment){ this.segment = segment; }
	public void setAirbagcsv(int airbagcsv){ this.airbagcsv = airbagcsv; }
	public void setSeatcsv(int seatcsv){ this.seatcsv = seatcsv; }
	public void setDoorcsv(int doorcsv){ this.doorcsv = doorcsv; }
	public void setDistance(double distance){ this.distance = distance; }

	//getter or retriever
	public String getBranddata() { return branddata; }
	public String getModeldata() { return modeldata; }
	public String getExtramodel() { return extramodel; }
	public double getCccsv() { return cccsv; }
	public String getGeartype() { return geartype; }
	public int getGearno() { return gearno; }
	public double getOtrcsv() { return otrcsv; }
	public double getMInscsv() { return mInscsv; }
	public String getSegment() { return segment; }
	public int getAirbagcsv() { return airbagcsv; }
	public int getSeatcsv() { return seatcsv; }
	public int getDoorcsv() { return doorcsv; }
	public double getDistance() { return distance; }
	
	//printer
	public String toString(){
		return "\nBrand: " + branddata +
				"\nModel: " + modeldata +
				"\nExtra model: " +extramodel +
				"\nCC: " + cccsv +
				"\nGear Type: " + geartype +
				"\nGear no: " + gearno +
				"\nOTR Price: " + otrcsv +
				"\nMonthly instalment: " + mInscsv +
				"\nSegment: " + segment +
				"\nAir bag: " + airbagcsv +
				"\nSeat: " + seatcsv +
				"\nDoor: " + doorcsv +
				"\nDistance: " + distance;
	}
	
	@Override
	public int compareTo(car o){
		return Double.valueOf(this.distance).compareTo(Double.valueOf(o.distance));
	}
}
