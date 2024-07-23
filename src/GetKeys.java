import java.util.Base64;

public class GetKeys {
	public static String encodeToBase64(byte[] bytes) {
	        return Base64.getEncoder().encodeToString(bytes);
	    }


	}

