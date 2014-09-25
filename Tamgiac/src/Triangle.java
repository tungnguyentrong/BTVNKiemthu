
public class Triangle {
	String Triangle(int a, int b, int c){
		String ketqua = new String();
		
		// Is a triangle?
		if((a < b+ c) && (b < a + c) && (c < a+ b)){

			if((a == b) && (b==c)){
				ketqua= "Equilateral";
			}else if((a != b) && (a != c) && (b != c)){
				ketqua ="Scalene";
			}else{
				ketqua = "Isosceles";
			}
		}else{
			ketqua = "NotATriangle";
		}
		//Determine triangle type
		return ketqua;
		
	}
	
}
