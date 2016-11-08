import javax.print.attribute.standard.Chromaticity;


public class RoomaNumbrid {

	public Integer romanToArabian(String num) {
		int result = 0;
		for (int i = 0; i < num.length()-1; i++) {
			int cur = singleRomanToArabian(num.charAt(i));
			int next = singleRomanToArabian(num.charAt(i+1));
				if(cur < next){
					result -= cur;
				} else if(cur >= next){
					result += cur; 
				}
			}
		return result += singleRomanToArabian(num.charAt(num.length()-1));
	}
	
	public Integer singleRomanToArabian(Character chr) {
		switch (chr) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}
	
}
