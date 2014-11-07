package ktSoNguyenTo;

public class ktSonguyento {
	public String check(int n){
		int dem=0;
		String result = null;
		for(int i=2; i<n; i++){
			if(n%i==0)
				dem++;
		}
		if(n>=2 && dem==0){
			result="La so nguyen to";
		}
		if(dem>0 || n<2){
			result="Ko la so nguyen to";
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
