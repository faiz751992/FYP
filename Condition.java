package asdfg;

public class Condition {

	public static double selection(double salary, double cc, int geartype, int seat, int door, int airbag,
									double pay, double monthIns, double monthInscsv, double payrange, double cccsv, int gearcsv,
									int airbagcsv, int seatcsv, int doorcsv){
		
		double diffOTR = 100;
		double output = 100;
		if ((cc != 0) && (geartype != 0) && (seat != 0) && (door != 0) && (airbag != 0)){

				if(monthInscsv <= pay){
					diffOTR = (pay - monthIns);
				}
				else if(monthInscsv <= payrange){
					diffOTR = (payrange - monthInscsv);
					//System.out.println("Salary range:"+range);
					//System.out.println("salary + range:"+payrange);
				}
				double sqrOTR = Math.pow(diffOTR, 2);
				
				double diffCC = (cc - cccsv); 
				double sqrCC = Math.pow(diffCC, 2);
				
				double diffGEAR = (geartype - gearcsv);
				double sqrGEAR = Math.pow(diffGEAR, 2);
				
				double diffAIR = (airbag - airbagcsv);
				double sqrAIR = Math.pow(diffAIR, 2);
				
				double diffSEAT = (seat - seatcsv); 
				double sqrSEAT = Math.pow(diffSEAT, 2);
				
				double diffDoor = (door - doorcsv);
				double sqrDOOR = Math.pow(diffDoor, 2);
				
				output = Math.sqrt(sqrOTR + sqrCC + sqrGEAR + sqrAIR + sqrSEAT + sqrDOOR);
				
		}
		
		else if ((cc == 0) && (geartype != 0) && (seat != 0) && (door != 0) && (airbag != 0)){
			
				if(monthInscsv <= pay){
					diffOTR = (pay - monthIns);
				}
				else if(monthInscsv <= payrange){
					diffOTR = (payrange - monthInscsv);
					//System.out.println("Salary range:"+range);
					//System.out.println("salary + range:"+payrange);
				}
				double sqrOTR = Math.pow(diffOTR, 2);
				
				double diffGEAR = (geartype - gearcsv);
				double sqrGEAR = Math.pow(diffGEAR, 2);
				
				double diffAIR = (airbag - airbagcsv);
				double sqrAIR = Math.pow(diffAIR, 2);
				
				double diffSEAT = (seat - seatcsv); 
				double sqrSEAT = Math.pow(diffSEAT, 2);
				
				double diffDoor = (door - doorcsv);
				double sqrDOOR = Math.pow(diffDoor, 2);
				
				output = Math.sqrt(sqrOTR + sqrGEAR + sqrAIR + sqrSEAT + sqrDOOR);
		}
		else if ((cc != 0) && (geartype == 0) && (seat != 0) && (door != 0) && (airbag != 0)){
		
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffCC = (cc - cccsv); 
			double sqrCC = Math.pow(diffCC, 2);
			
			double diffAIR = (airbag - airbagcsv);
			double sqrAIR = Math.pow(diffAIR, 2);
			
			double diffSEAT = (seat - seatcsv); 
			double sqrSEAT = Math.pow(diffSEAT, 2);
			
			double diffDoor = (door - doorcsv);
			double sqrDOOR = Math.pow(diffDoor, 2);
			
			output = Math.sqrt(sqrOTR + sqrCC + sqrAIR + sqrSEAT + sqrDOOR);
		}
		else if ((cc != 0) && (geartype != 0) && (seat == 0) && (door != 0) && (airbag != 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffCC = (cc - cccsv); 
			double sqrCC = Math.pow(diffCC, 2);
			
			double diffGEAR = (geartype - gearcsv);
			double sqrGEAR = Math.pow(diffGEAR, 2);
			
			double diffAIR = (airbag - airbagcsv);
			double sqrAIR = Math.pow(diffAIR, 2);
			
			double diffDoor = (door - doorcsv);
			double sqrDOOR = Math.pow(diffDoor, 2);
			
			output = Math.sqrt(sqrOTR + sqrCC + sqrGEAR + sqrAIR + sqrDOOR);
		} 
		else if ((cc != 0) && (geartype != 0) && (seat != 0) && (door == 0) && (airbag != 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffCC = (cc - cccsv); 
			double sqrCC = Math.pow(diffCC, 2);
			
			double diffGEAR = (geartype - gearcsv);
			double sqrGEAR = Math.pow(diffGEAR, 2);
			
			double diffAIR = (airbag - airbagcsv);
			double sqrAIR = Math.pow(diffAIR, 2);
			
			double diffSEAT = (seat - seatcsv); 
			double sqrSEAT = Math.pow(diffSEAT, 2);
			
			output = Math.sqrt(sqrOTR + sqrCC + sqrGEAR + sqrAIR + sqrSEAT);
		}
		else if ((cc != 0) && (geartype != 0) && (seat != 0) && (door != 0) && (airbag == 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffCC = (cc - cccsv); 
			double sqrCC = Math.pow(diffCC, 2);
			
			double diffGEAR = (geartype - gearcsv);
			double sqrGEAR = Math.pow(diffGEAR, 2);
			
			double diffSEAT = (seat - seatcsv); 
			double sqrSEAT = Math.pow(diffSEAT, 2);
			
			double diffDoor = (door - doorcsv);
			double sqrDOOR = Math.pow(diffDoor, 2);
			
			output = Math.sqrt(sqrOTR + sqrCC + sqrGEAR + sqrSEAT + sqrDOOR);
		}
		else if ((cc == 0) && (geartype == 0) && (seat != 0) && (door != 0) && (airbag != 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffAIR = (airbag - airbagcsv);
			double sqrAIR = Math.pow(diffAIR, 2);
			
			double diffSEAT = (seat - seatcsv); 
			double sqrSEAT = Math.pow(diffSEAT, 2);
			
			double diffDoor = (door - doorcsv);
			double sqrDOOR = Math.pow(diffDoor, 2);
			
			output = Math.sqrt(sqrOTR + sqrAIR + sqrSEAT + sqrDOOR);
		}
		else if ((cc == 0) && (geartype != 0) && (seat == 0) && (door != 0) && (airbag != 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffGEAR = (geartype - gearcsv);
			double sqrGEAR = Math.pow(diffGEAR, 2);
			
			double diffAIR = (airbag - airbagcsv);
			double sqrAIR = Math.pow(diffAIR, 2);
			
			double diffDoor = (door - doorcsv);
			double sqrDOOR = Math.pow(diffDoor, 2);
			
			output = Math.sqrt(sqrOTR + sqrGEAR + sqrAIR + sqrDOOR);
		}
		else if ((cc == 0) && (geartype != 0) && (seat != 0) && (door == 0) && (airbag != 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffGEAR = (geartype - gearcsv);
			double sqrGEAR = Math.pow(diffGEAR, 2);
			
			double diffAIR = (airbag - airbagcsv);
			double sqrAIR = Math.pow(diffAIR, 2);
			
			double diffSEAT = (seat - seatcsv); 
			double sqrSEAT = Math.pow(diffSEAT, 2);
			
			output = Math.sqrt(sqrOTR + sqrGEAR + sqrAIR + sqrSEAT);
		}
		else if ((cc == 0) && (geartype != 0) && (seat != 0) && (door != 0) && (airbag == 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffGEAR = (geartype - gearcsv);
			double sqrGEAR = Math.pow(diffGEAR, 2);
			
			double diffSEAT = (seat - seatcsv); 
			double sqrSEAT = Math.pow(diffSEAT, 2);
			
			double diffDoor = (door - doorcsv);
			double sqrDOOR = Math.pow(diffDoor, 2);
			
			output = Math.sqrt(sqrOTR + sqrGEAR + sqrSEAT + sqrDOOR);
		}
		else if ((cc != 0) && (geartype == 0) && (seat == 0) && (door != 0) && (airbag != 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffCC = (cc - cccsv); 
			double sqrCC = Math.pow(diffCC, 2);
			
			double diffAIR = (airbag - airbagcsv);
			double sqrAIR = Math.pow(diffAIR, 2);
			
			double diffDoor = (door - doorcsv);
			double sqrDOOR = Math.pow(diffDoor, 2);
			
			output = Math.sqrt(sqrOTR + sqrCC + sqrAIR + sqrDOOR);
		}
		else if ((cc != 0) && (geartype == 0) && (seat != 0) && (door == 0) && (airbag != 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffCC = (cc - cccsv); 
			double sqrCC = Math.pow(diffCC, 2);
			
			double diffAIR = (airbag - airbagcsv);
			double sqrAIR = Math.pow(diffAIR, 2);
			
			double diffSEAT = (seat - seatcsv); 
			double sqrSEAT = Math.pow(diffSEAT, 2);
			
			output = Math.sqrt(sqrOTR + sqrCC + sqrAIR + sqrSEAT);
		}
		else if ((cc != 0) && (geartype == 0) && (seat != 0) && (door != 0) && (airbag == 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffCC = (cc - cccsv); 
			double sqrCC = Math.pow(diffCC, 2);
			
			double diffSEAT = (seat - seatcsv); 
			double sqrSEAT = Math.pow(diffSEAT, 2);
			
			double diffDoor = (door - doorcsv);
			double sqrDOOR = Math.pow(diffDoor, 2);
			
			output = Math.sqrt(sqrOTR + sqrCC + sqrSEAT + sqrDOOR);
		}
		else if ((cc != 0) && (geartype != 0) && (seat == 0) && (door == 0) && (airbag != 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffCC = (cc - cccsv); 
			double sqrCC = Math.pow(diffCC, 2);
			
			double diffGEAR = (geartype - gearcsv);
			double sqrGEAR = Math.pow(diffGEAR, 2);
			
			double diffAIR = (airbag - airbagcsv);
			double sqrAIR = Math.pow(diffAIR, 2);
			
			output = Math.sqrt(sqrOTR + sqrCC + sqrGEAR + sqrAIR);
		} 
		else if ((cc != 0) && (geartype != 0) && (seat == 0) && (door != 0) && (airbag == 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffCC = (cc - cccsv); 
			double sqrCC = Math.pow(diffCC, 2);
			
			double diffGEAR = (geartype - gearcsv);
			double sqrGEAR = Math.pow(diffGEAR, 2);
			
			double diffDoor = (door - doorcsv);
			double sqrDOOR = Math.pow(diffDoor, 2);
			
			output = Math.sqrt(sqrOTR + sqrCC + sqrGEAR + sqrDOOR);
		} 
		else if ((cc != 0) && (geartype != 0) && (seat != 0) && (door == 0) && (airbag == 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffCC = (cc - cccsv); 
			double sqrCC = Math.pow(diffCC, 2);
			
			double diffGEAR = (geartype - gearcsv);
			double sqrGEAR = Math.pow(diffGEAR, 2);
			
			double diffSEAT = (seat - seatcsv); 
			double sqrSEAT = Math.pow(diffSEAT, 2);
			
			output = Math.sqrt(sqrOTR + sqrCC + sqrGEAR + sqrSEAT);
		}
		else if ((cc == 0) && (geartype == 0) && (seat == 0) && (door != 0) && (airbag != 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffAIR = (airbag - airbagcsv);
			double sqrAIR = Math.pow(diffAIR, 2);
			
			double diffDoor = (door - doorcsv);
			double sqrDOOR = Math.pow(diffDoor, 2);
			
			output = Math.sqrt(sqrOTR + sqrAIR + sqrDOOR);
		}
		else if ((cc == 0) && (geartype == 0) && (seat != 0) && (door == 0) && (airbag != 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffAIR = (airbag - airbagcsv);
			double sqrAIR = Math.pow(diffAIR, 2);
			
			double diffSEAT = (seat - seatcsv); 
			double sqrSEAT = Math.pow(diffSEAT, 2);
			
			output = Math.sqrt(sqrOTR + sqrAIR + sqrSEAT);
		}
		else if ((cc == 0) && (geartype == 0) && (seat != 0) && (door != 0) && (airbag == 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffSEAT = (seat - seatcsv); 
			double sqrSEAT = Math.pow(diffSEAT, 2);
			
			double diffDoor = (door - doorcsv);
			double sqrDOOR = Math.pow(diffDoor, 2);
			
			output = Math.sqrt(sqrOTR + sqrSEAT + sqrDOOR);
		}
		else if ((cc == 0) && (geartype != 0) && (seat == 0) && (door == 0) && (airbag != 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffGEAR = (geartype - gearcsv);
			double sqrGEAR = Math.pow(diffGEAR, 2);
			
			double diffAIR = (airbag - airbagcsv);
			double sqrAIR = Math.pow(diffAIR, 2);
			
			output = Math.sqrt(sqrOTR + sqrGEAR + sqrAIR);
		}
		else if ((cc == 0) && (geartype != 0) && (seat == 0) && (door != 0) && (airbag == 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffGEAR = (geartype - gearcsv);
			double sqrGEAR = Math.pow(diffGEAR, 2);
			
			double diffDoor = (door - doorcsv);
			double sqrDOOR = Math.pow(diffDoor, 2);
			
			output = Math.sqrt(sqrOTR + sqrGEAR + sqrDOOR);
		}
		else if ((cc == 0) && (geartype != 0) && (seat != 0) && (door == 0) && (airbag == 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffGEAR = (geartype - gearcsv);
			double sqrGEAR = Math.pow(diffGEAR, 2);
			
			double diffSEAT = (seat - seatcsv); 
			double sqrSEAT = Math.pow(diffSEAT, 2);
			
			output = Math.sqrt(sqrOTR + sqrGEAR + sqrSEAT);
		}
		else if ((cc != 0) && (geartype == 0) && (seat == 0) && (door == 0) && (airbag != 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffCC = (cc - cccsv); 
			double sqrCC = Math.pow(diffCC, 2);
			
			double diffAIR = (airbag - airbagcsv);
			double sqrAIR = Math.pow(diffAIR, 2);
			
			output = Math.sqrt(sqrOTR + sqrCC + sqrAIR);
		}
		else if ((cc != 0) && (geartype == 0) && (seat == 0) && (door != 0) && (airbag == 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffCC = (cc - cccsv); 
			double sqrCC = Math.pow(diffCC, 2);
			
			double diffDoor = (door - doorcsv);
			double sqrDOOR = Math.pow(diffDoor, 2);
			
			output = Math.sqrt(sqrOTR + sqrCC + sqrDOOR);
		}
		else if ((cc != 0) && (geartype != 0) && (seat == 0) && (door == 0) && (airbag == 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffCC = (cc - cccsv); 
			double sqrCC = Math.pow(diffCC, 2);
			
			double diffGEAR = (geartype - gearcsv);
			double sqrGEAR = Math.pow(diffGEAR, 2);
			
			output = Math.sqrt(sqrOTR + sqrCC + sqrGEAR);
		}
		else if ((cc == 0) && (geartype == 0) && (seat == 0) && (door == 0) && (airbag != 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffAIR = (airbag - airbagcsv);
			double sqrAIR = Math.pow(diffAIR, 2);
			
			output = Math.sqrt(sqrOTR + sqrAIR);
		}
		else if ((cc == 0) && (geartype == 0) && (seat == 0) && (door != 0) && (airbag == 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffDoor = (door - doorcsv);
			double sqrDOOR = Math.pow(diffDoor, 2);
			
			output = Math.sqrt(sqrOTR + sqrDOOR);
		}
		else if ((cc == 0) && (geartype != 0) && (seat == 0) && (door == 0) && (airbag == 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffGEAR = (geartype - gearcsv);
			double sqrGEAR = Math.pow(diffGEAR, 2);
			
			output = Math.sqrt(sqrOTR + sqrGEAR );
		}
		else if ((cc == 0) && (geartype == 0) && (seat != 0) && (door == 0) && (airbag == 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffSEAT = (seat - seatcsv); 
			double sqrSEAT = Math.pow(diffSEAT, 2);
			
			output = Math.sqrt(sqrOTR + sqrSEAT);
		}
		else if ((cc != 0) && (geartype == 0) && (seat == 0) && (door == 0) && (airbag == 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			double diffCC = (cc - cccsv); 
			double sqrCC = Math.pow(diffCC, 2);
			
			output = Math.sqrt(sqrOTR + sqrCC);
		}
		else if ((cc == 0) && (geartype == 0) && (seat == 0) && (door == 0) && (airbag == 0)){
			if(monthInscsv <= pay){
				diffOTR = (pay - monthIns);
			}
			else if(monthInscsv <= payrange){
				diffOTR = (payrange - monthInscsv);
				//System.out.println("Salary range:"+range);
				//System.out.println("salary + range:"+payrange);
			}
			double sqrOTR = Math.pow(diffOTR, 2);
			
			output = Math.sqrt(sqrOTR);
		}
		return output;
	}

}
