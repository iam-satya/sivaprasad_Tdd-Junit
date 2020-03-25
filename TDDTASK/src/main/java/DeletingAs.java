public class DeletingAs {
	public static String delete(String string)
	{
		int strlength=string.length();
		String output="";
		if(strlength>=1)
		{
		if(string.charAt(0)!='A')
			output=string;
		if(string.charAt(0)=='A') {
		if(strlength>2)
			output=string.substring(1);
		}
	if(strlength>=2&&string.charAt(0)=='A'&& string.charAt(1)=='A')
			output=string.substring(2);
	if(string.charAt(0)!='A'&&string.charAt(1)=='A')
			output=string.substring(0,1)+string.substring(2);
		}
		    return output;
	}

}