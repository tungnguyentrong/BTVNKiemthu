
public class nextDay {
	
		String nextday(int date, int month, int year){
			String kq = new String();
			int nextD = date, nextM = month, nextY = year;
			if(month <= 0 || month >= 13 || year <= 0)
				return kq = "Ko phu hop";
			if(month == 2 && (year % 4 !=0)){
				if(date >= 1 && date <28){
					nextD ++;
					kq = nextD + " / " + nextM + " / "+ nextY;
				}else if(date == 28){
					nextD = 1;
					nextM ++;
					kq = nextD + " / " + nextM + " / "+ nextY;
				}else{
					kq = "Ko phu hop";
				}
			}else 
			if(month == 2 && (year % 4 == 0)){
				if( 1<= date && date <= 28){
					nextD = date +1;
					kq = nextD + " / " + nextM + " / "+ nextY;
				}else if(date == 29){
					nextD = 1;
					nextM ++;
					kq = nextD + " / " + nextM + " / "+ nextY;
				}else{
					kq = "Ko phu hop";
				}
			}else 
			if(month == 1 || month == 3 || month == 5 || month == 7 || month ==8 || month == 10 || month == 12){
				if(date >= 1 && date <= 30){
					nextD++;
					kq = nextD + " / " + nextM + " / "+ nextY;
				}else 
					if(date == 31 && month != 12){
					nextD = 1;
					nextM = month + 1;
					kq = nextD + "  " + nextM + " / "+ nextY;
				}else 
					if(date == 31 && month == 12){
					nextD = 1;
					nextM =1;
					nextY ++;
					kq = nextD + " / " + nextM + " / "+ nextY;
				}else{
					kq = "Ko phu hop";
				}
			}else{
				if(date >= 1 && date <= 29){
					nextD = date + 1;
					kq = nextD + " / " + nextM + " / "+ nextY;
				}else 
					if(date == 30){
					nextD = 1;
					nextM = month + 1;
					kq = nextD + " / " + nextM + " / "+ nextY;
				}else{
					kq = "Ko phu hop";
				}
			}
			return kq;		
		}
}