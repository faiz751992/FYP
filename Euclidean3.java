package asdfg;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;


public class Euclidean3 {

	
	private static Interface2 cars[];

	public static void main(String[] args) {
		//contoh user input
		String a = "2500";
		String b = "1.5";
		String c = "automatic";
		String d = "5";
		String f = "4";
		String g = "2";
		calc(a, b, c, d, f, g);
		

	}

	public static car[] calc(String a, String b, String c, String d, String f, String g){
		DecimalFormat df = new DecimalFormat("#0.00");
		String csvFile = "carmodel.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		//carmodel cm[] = new carmodel[1000];
		car cr[] = new car[350];
		//cars = null;
		
		System.out.println("euclidean part");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
		System.out.println(g);
		
		double salary,cc = 0;
		int geartype = 0, seat = 0, door = 0, airbag = 0;
		
		salary = Double.parseDouble(a);
		if (b != null)
			cc = Double.parseDouble(b);
		else
			cc = 0;
		
		if (d != null)
			seat = Integer.parseInt(d);
		else
			seat = 0;
		
		if (f != null)
			door = Integer.parseInt(f);
		else
			door = 0;
		
		if (g != null)
			airbag = Integer.parseInt(g);
		else
			airbag = 0;
		
		if(c == null)
			geartype = 0;
		else if (c.equalsIgnoreCase("AUTOMATIC"))
			geartype = 1;
		else if (c.equalsIgnoreCase("MANUAL"))
			geartype = 2;
		else if (c.equalsIgnoreCase("CVT"))
			geartype = 3;
		else if (c.equalsIgnoreCase("DSG"))
			geartype = 4;
		
		int i = 0;	
		
		int num = 1;
		double distance = 100;
		
		double range = 0.0;
		if((salary >= 1000)&&(salary <= 2500))
			range = 1;
		else if((salary >= 2501)&&(salary <= 4500))
			range = 2;
		else if((salary >= 4501)&&(salary <= 7000))
			range = 3;
		else if((salary >= 7001)&&(salary <= 10000))
			range = 5;
		
		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

			        // use comma as separator
				String[]csvdata = line.split(cvsSplitBy);
				
				//amek data dlm csv file
				String branddata = csvdata[1];
				String modelcsv = csvdata[2];
				String extramodelcsv = csvdata[3];
				String ccdata = csvdata[4];
				String geartypedata = csvdata[6];
				String gearnocsv = csvdata[7];
				String otrpricedata = csvdata[10];
				String segmentcsv = csvdata[12];
				String airbagdata = csvdata[14];
				int seatcsv = Integer.parseInt(csvdata[16]);
				int doorcsv = Integer.parseInt(csvdata[17]);
				
				//CC
				double cccsv;
				if ((ccdata.equalsIgnoreCase("NA"))||(ccdata.equalsIgnoreCase("TT")))
					cccsv = 0.0;
				else
					cccsv = Double.parseDouble(ccdata);
				
				//Gear
				int gearcsv=0;
				
				if (geartypedata.equalsIgnoreCase("AUTO"))
					gearcsv = 1;
				else if (geartypedata.equalsIgnoreCase("MANUAL"))
					gearcsv = 2;
				else if (geartypedata.equalsIgnoreCase("CVT"))
					gearcsv = 3;
				else if (geartypedata.equalsIgnoreCase("DSG"))
					gearcsv = 4;
				
				//Gear no
				int gearno;
				if ((gearnocsv.equalsIgnoreCase("NA"))||(gearnocsv.equalsIgnoreCase("TT")))
					gearno = 0;
				else
					gearno = Integer.parseInt(gearnocsv);
				
				//OTR Price with Salary
				double otrcsv;
				if ((otrpricedata.equalsIgnoreCase("NA"))||(otrpricedata.equalsIgnoreCase("TT")))
					otrcsv = 0.0;
				else
					otrcsv = Double.parseDouble(otrpricedata);
				
				Double pay = (salary * 0.3)/100;//minimum monthly payment
				Double otrPcsv = otrcsv / 10000;
				Double otrPricecsv=Double.valueOf(df.format(otrPcsv));
				
				//monthly installment.. 9 years
				double mIns = otrcsv / (9 * 12);
				double mInscsv = Double.valueOf(df.format(mIns));
				double monthIns = mIns / 100;
				double monthInscsv = Double.valueOf(df.format(monthIns));
				
				//Air bag
				int airbagcsv;
				if ((airbagdata.equalsIgnoreCase("NA"))||(airbagdata.equalsIgnoreCase("TT")))
					airbagcsv = 0;
				else
					airbagcsv = Integer.parseInt(airbagdata);
				
				//simpan value feature kereta dlm array
				//cm[num] = new carmodel(branddata, modelcsv, extramodelcsv, cccsv, geartypedata, gearno, otrcsv, mInscsv, segmentcsv, airbagcsv, seatcsv, doorcsv);
			
				double payrange = pay + range;
				
				//kire euclidean distance dlm class Condition.java
				double output = Condition.selection(salary, cc, geartype, seat, door, airbag, pay, monthIns, monthInscsv, payrange, cccsv, gearcsv, airbagcsv, seatcsv, doorcsv);
				distance=Double.valueOf(df.format(output));
				
				if ((distance >= 0)&&(distance <= 3)){
					
					cr[i] = new car(branddata, modelcsv, extramodelcsv, cccsv, geartypedata, gearno, otrcsv, mInscsv, segmentcsv, airbagcsv, seatcsv, doorcsv, distance);
					/*if ((distance >= 0)&&(distance <= 1)){
						cr[i] = new car(branddata, modelcsv, extramodelcsv, cccsv, geartypedata, gearno, otrcsv, mInscsv, segmentcsv, airbagcsv, seatcsv, doorcsv, distance);
						//System.out.println("\n"+num+")Distance: "+distance);
						//System.out.println("\n" + num + ")");
						//System.out.println(cr[num].toString());
						//cars[i] = new Interface2 (branddata, modelcsv, extramodelcsv, cccsv, geartypedata, gearno, otrcsv, mInscsv, segmentcsv, airbagcsv, seatcsv, doorcsv, distance);
					}
					else if ((distance > 1)&&(distance <= 2)){
						cr[i] = new car(branddata, modelcsv, extramodelcsv, cccsv, geartypedata, gearno, otrcsv, mInscsv, segmentcsv, airbagcsv, seatcsv, doorcsv, distance);
						//System.out.println("\n"+num+")Distance: "+distance);
						//System.out.println("\n" + num + ")");
						//System.out.println(cr[num].toString());
						//cars[i] = new Interface2 (branddata, modelcsv, extramodelcsv, cccsv, geartypedata, gearno, otrcsv, mInscsv, segmentcsv, airbagcsv, seatcsv, doorcsv, distance);
					}
					else if ((distance > 2)&&(distance <= 3)){
						cr[i] = new car(branddata, modelcsv, extramodelcsv, cccsv, geartypedata, gearno, otrcsv, mInscsv, segmentcsv, airbagcsv, seatcsv, doorcsv, distance);
						//System.out.println("\n"+num+")Distance: "+distance);
						//System.out.println("\n" + num + ")");
						//System.out.println(cr[num].toString());
						//cars[i] = new Interface2 (branddata, modelcsv, extramodelcsv, cccsv, geartypedata, gearno, otrcsv, mInscsv, segmentcsv, airbagcsv, seatcsv, doorcsv, distance);
					}*/
				i++;
				}
				
				num++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(cr.length);
		for(int j = 0;j<cr.length;j++){
			System.out.println(j+")"+cr[j]);
		}
		
		System.out.println("end part");
		System.out.println(salary);
		System.out.println(cc);
		System.out.println(geartype);
		System.out.println(seat);
		System.out.println(door);
		System.out.println(airbag);
		return cr;
	}
}