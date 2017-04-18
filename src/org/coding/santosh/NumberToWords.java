package org.coding.santosh;
public class NumberToWords 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String z = "23746574";
System.out.println(ThreeDigitToWords(z).toString());
	}
	public static StringBuffer ThreeDigitToWords(String x)
	{
		StringBuffer s = new StringBuffer();
		int count = x.length() ;
		//long num = Long.parseLong(x);
		//if(num < 10)
		//String q = Integer.toString(num);
		//if(num == 0 )
			//return s;
		//while(num % 10 != num)
		//{
			//num = num / 10;
			//count++;
		//}
		switch(count)
		{case 10 :
		
			switch(x.charAt(0))
			{
			case '1' : s.append("one billion ,"); s.append(ThreeDigitToWords(x.substring(1,4))); s.append("million , "); s.append(ThreeDigitToWords(x.substring(4,7)));
			s.append("Thousand ,"); s.append(ThreeDigitToWords(x.substring(7))); return s;
			case '2' : s.append("two billion ,"); s.append(ThreeDigitToWords(x.substring(1,4))); s.append("million , "); s.append(ThreeDigitToWords(x.substring(4,7)));
			s.append("Thousand ,"); s.append(ThreeDigitToWords(x.substring(7))); 
			return s;
			case '3' : s.append("three billion ,"); s.append(ThreeDigitToWords(x.substring(1,4))); s.append("million , "); s.append(ThreeDigitToWords(x.substring(4,7)));
			s.append("Thousand ,"); s.append(ThreeDigitToWords(x.substring(7))); 
			return s;
			case '4' : s.append("four billion ,"); s.append(ThreeDigitToWords(x.substring(1,4))); s.append("million , "); s.append(ThreeDigitToWords(x.substring(4,7)));
			s.append("Thousand ,"); s.append(ThreeDigitToWords(x.substring(7)));
			return s;
			case '5' : s.append("five billion ,"); s.append(ThreeDigitToWords(x.substring(1,4))); s.append("million , "); s.append(ThreeDigitToWords(x.substring(4,7)));
			s.append("Thousand ,"); s.append(ThreeDigitToWords(x.substring(7)));
			return s;
			case '6' : s.append("six billion ,"); s.append(ThreeDigitToWords(x.substring(1,4))); s.append("million , "); s.append(ThreeDigitToWords(x.substring(4,7)));
			s.append("Thousand ,"); s.append(ThreeDigitToWords(x.substring(7)));
			return s;
			case '7' : s.append("seven billion ,"); s.append(ThreeDigitToWords(x.substring(1,4))); s.append("million , "); s.append(ThreeDigitToWords(x.substring(4,7)));
			s.append("Thousand ,"); s.append(ThreeDigitToWords(x.substring(7)));
			return s;
			case '8' : s.append("eight billion ,"); s.append(ThreeDigitToWords(x.substring(1,4))); s.append("million , "); s.append(ThreeDigitToWords(x.substring(4,7)));
			s.append("Thousand ,"); s.append(ThreeDigitToWords(x.substring(7))); 
			return s;
			case '9' : s.append("nine billion ,"); s.append(ThreeDigitToWords(x.substring(1,4))); s.append("million , "); s.append(ThreeDigitToWords(x.substring(4,7)));
			s.append("Thousand ,"); s.append(ThreeDigitToWords(x.substring(7))); 
			return s;
			default : s.append(ThreeDigitToWords(x.substring(1))); return s;
			}
		
		case 9 :
		{
			s.append(ThreeDigitToWords(x.substring(0,3))); s.append("million , "); s.append(ThreeDigitToWords(x.substring(3,6)));
			s.append("Thousand ,"); s.append(ThreeDigitToWords(x.substring(6))); 
			return s;
		}
		
		case 8 :
		{
			s.append(ThreeDigitToWords(x.substring(0,2))); s.append("million , "); s.append(ThreeDigitToWords(x.substring(2,5)));
			s.append("Thousand ,"); s.append(ThreeDigitToWords(x.substring(5))); 
			return s;
		}
		
		case 7 :
		{
			switch(x.charAt(0))
			{
			case '1' : s.append("one million ,"); s.append(ThreeDigitToWords(x.substring(1,4))); s.append("thousand , "); s.append(ThreeDigitToWords(x.substring(4)));
		    return s;
			case '2' : s.append("two million ,"); s.append(ThreeDigitToWords(x.substring(1,4))); s.append("thousand , "); s.append(ThreeDigitToWords(x.substring(4)));
		    return s;
			case '3' : s.append("three million ,"); s.append(ThreeDigitToWords(x.substring(1,4))); s.append("thousand , "); s.append(ThreeDigitToWords(x.substring(4)));
		    return s;
			case '4' : s.append("four million ,"); s.append(ThreeDigitToWords(x.substring(1,4))); s.append("thousand , "); s.append(ThreeDigitToWords(x.substring(4)));
		    return s;
			case '5' : s.append("five million ,"); s.append(ThreeDigitToWords(x.substring(1,4))); s.append("thousand , "); s.append(ThreeDigitToWords(x.substring(4)));
		    return s;
			case '6' : s.append("six million ,"); s.append(ThreeDigitToWords(x.substring(1,4))); s.append("thousand , "); s.append(ThreeDigitToWords(x.substring(4)));
		    return s;
			case '7' : s.append("seven million ,"); s.append(ThreeDigitToWords(x.substring(1,4))); s.append("thousand , "); s.append(ThreeDigitToWords(x.substring(4)));
		    return s;
			case '8' : s.append("eight million ,"); s.append(ThreeDigitToWords(x.substring(1,4))); s.append("thousand , "); s.append(ThreeDigitToWords(x.substring(4)));
		    return s;
			case '9' : s.append("nine million ,"); s.append(ThreeDigitToWords(x.substring(1,4))); s.append("thousand , "); s.append(ThreeDigitToWords(x.substring(4)));
		    return s;
			default : s.append(ThreeDigitToWords(x.substring(1))); return s;
			}
		}
		
		case 6 :
		{
			s.append(ThreeDigitToWords(x.substring(0,3))); s.append("thousand , "); s.append(ThreeDigitToWords(x.substring(3)));
		    return s;
		}
		
		case 5 :
		{
			s.append(ThreeDigitToWords(x.substring(0,2))); s.append("thousand , "); s.append(ThreeDigitToWords(x.substring(2)));
		    return s;
		}
		case 4:
		{
			switch(x.charAt(0))
			{
		case '1' : s.append("one thousand ,"); s.append(ThreeDigitToWords(x.substring(1)));return s;
		case '2' : s.append("two thousand ,");
		s.append(ThreeDigitToWords(x.substring(1)));return s;
		case '3' : s.append("three thousand ,");
		s.append(ThreeDigitToWords(x.substring(1)));return s;
		case '4' : s.append("four thousand ,");
		s.append(ThreeDigitToWords(x.substring(1)));return s;
		case '5' : s.append("five thousand ,");
		s.append(ThreeDigitToWords(x.substring(1)));return s;
		case '6' : s.append("six thousand ,");
		s.append(ThreeDigitToWords(x.substring(1)));return s;
		case '7' : s.append("seven thousand ,");
		s.append(ThreeDigitToWords(x.substring(1)));return s;
		case '8' : s.append("eight thousand ,");
		s.append(ThreeDigitToWords(x.substring(1)));return s;
		case '9' : s.append("nine thousand ,");
		s.append(ThreeDigitToWords(x.substring(1)));return s;
		case '0' : s.append(ThreeDigitToWords(x.substring(1))) ; return s;
			}
		}
		case  3:
		{
			switch(x.charAt(0))
			{
			case '1' : s.append("one hundred "); s.append(ThreeDigitToWords(x.substring(1))); return s;
			case '2' : s.append("two hundred ");
			s.append(ThreeDigitToWords(x.substring(1))); return s;
			case '3' : s.append("three hundred ");
			s.append(ThreeDigitToWords(x.substring(1))); return s;
			case '4' : s.append("four hundred ");
			s.append(ThreeDigitToWords(x.substring(1))); return s;
			case '5' : s.append("five hundred ");
			s.append(ThreeDigitToWords(x.substring(1))); return s;
			case '6' : s.append("six hundred ");
			s.append(ThreeDigitToWords(x.substring(1))); return s;
			case '7' : s.append("seven hundred ");
			s.append(ThreeDigitToWords(x.substring(1))); return s;
			case '8' : s.append("eight hundred ");
			s.append(ThreeDigitToWords(x.substring(1))); return s;
			case '9' : s.append("nine hundred ");
			s.append(ThreeDigitToWords(x.substring(1))); return s;
			case '0' : s.append(ThreeDigitToWords(x.substring(1))); return s;
			}
		}	
			
		case 2 : 
		{
			switch(x)
			{
			case "01" : s.append("one ");return s;
			case "02" : s.append("two ");return s;
			case "03" : s.append("three ");return s;
			case "04" : s.append("four ");return s;
			case "05" : s.append("five ");return s;
			case "06" : s.append("six ");return s;
			case "07" : s.append("seven ");return s;
			case "08" : s.append("eight ");return s;
			case "09" : s.append("nine ");return s;
			case "10" : s.append("ten "); return s;
			case "11" : s.append("eleven "); return s;
			case "12" : s.append("twelve "); return s;
			case "13" : s.append("thirteen "); return s;
			case "14" : s.append("fourteen "); return s;
			case "15" : s.append("fifteen "); return s;
			case "16" : s.append("sixteen "); return s;
			case "17" : s.append("seventeen "); return s;
			case "18" : s.append("eighteen "); return s;
			case "19" : s.append("ninteen "); return s;
			case "20" : s.append("twenty "); return s;
			default : switch(x.charAt(0)){
						case '2' : s.append("twenty ");s.append(ThreeDigitToWords(x.substring(1)));
						return s;
						case '3' : s.append("thirty ");s.append(ThreeDigitToWords(x.substring(1)));
						return s;
						case '4' : s.append("fourty ");s.append(ThreeDigitToWords(x.substring(1)));
						return s;
						case '5' : s.append("fifty ");s.append(ThreeDigitToWords(x.substring(1)));
						return s;
						case '6' : s.append("sixty ");s.append(ThreeDigitToWords(x.substring(1)));
						return s;
						case '7' : s.append("seventy ");s.append(ThreeDigitToWords(x.substring(1)));
						return s;
						case '8' : s.append("eighty ");s.append(ThreeDigitToWords(x.substring(1)));
						return s;
						case '9' : s.append("ninty ");s.append(ThreeDigitToWords(x.substring(1)));
						return s;
						case '0' : s.append(ThreeDigitToWords(x.substring(1)));
						return s;
										 };
										 }
		}
		case 1 :
		{
		switch(x.charAt(0)){
		 case '1' : s.append("one "); return s;
			case '2' : s.append("two ");
			return s;
			case '3' : s.append("three ");
			return s;
			case '4' : s.append("four ");
			return s;
			case '5' : s.append("five ");
			return s;
			case '6' : s.append("six ");
			return s;
			case '7' : s.append("seven ");
			return s;
			case '8' : s.append("eight ");
			return s;
			case '9' : s.append("nine ");
			return s;
			case '0' : s.append("zero ");
			return s;
							 };
		}					 	
		default : return s;
	}
		//return s;
	}
}
