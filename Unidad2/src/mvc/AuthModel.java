package mvc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AuthModel {
	private String filePath="src/documento.json";
	private  ObjectMapper mapper=new ObjectMapper();
	public AuthModel()
	{
		
	}
	public boolean login(String userName, String password) {
		String psw = null;
		String usr=null;
		try {
            
            String jsonContent=new String(Files.readAllBytes(Paths.get(filePath)));
          
            JsonNode root=mapper.readTree(jsonContent);
            usr= root.get("username").asText();
            psw= root.get("password").asText();
        
        } catch (IOException e1) {
            e1.printStackTrace();
            System.out.println("--No se encontro el archivo--");
        }
		
		if(userName.equals(usr)&&password.equals(psw))
		{
			return true;
		}
		return false;
	}
}
