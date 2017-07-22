package tpgtasks;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class IpRegularValidation {

	private static Pattern pattern;
    private static Matcher matcher;

    private static final String IP_REGUAL = 
		"^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" +
		"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    public IpRegularValidation(){
	  pattern = Pattern.compile(IP_REGUAL);
    }

   /**
    * Validate ip address with regular expression
    * @param ip ip address for validation
    * @return true valid ip address, false invalid ip address
    */
    public boolean validate(final String ip_address){
	  matcher = pattern.matcher(ip_address.trim());
	  return matcher.matches();
    }
	public static void main(String[] args) {
		try {
			File file = new File("src/ip_validator_test.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;	
			IpRegularValidation validator = new IpRegularValidation();
		
			while ((line = bufferedReader.readLine()) != null) {
				if (!validator.validate(line))
				System.out.println(line + " is not a valid ip address\n");
			}
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
