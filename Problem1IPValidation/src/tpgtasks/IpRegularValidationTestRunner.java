package tpgtasks;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class IpRegularValidationTestRunner {

	private static Pattern pattern;
    private static Matcher matcher;

    private static final String IP_REGUAL = 
		"^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" +
		"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    public IpRegularValidationTestRunner(){
	  pattern = Pattern.compile(IP_REGUAL);
    }

   /**
    * Validate ip_address with regular expression
    * @param ip_address for validation
    * @return true valid, false invalid 
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
			IpRegularValidationTestRunner validator = new IpRegularValidationTestRunner();
		
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
