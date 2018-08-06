package mySqlConnection

import java.sql.*
import com.kms.katalon.core.annotation.Keyword
import groovy.sql.Sql
public class executingQuery {


	@Keyword

	public int connection(String url, String user, String password, String driverClassName, String query){
		def sqlConnection =Sql.newInstance(url, user, password, driverClassName)
		//sqlConnection.executeQuery("update ct_json_config set JSON_STRING='{\"FORM\":{\"orientation\":\"top\",\"stepClick\":\"true\", \"backNav\": \"true\", \"forwardNav\": \"true\"}}' where CONFIG_ID='AR7053737_FORM'")
		/*sqlConnection.eachRow("select * from account_summary_data") 
		 {row ->
		 println row
		 }*/
		def result;
		def rowsCount = sqlConnection.rows(query)


		result =rowsCount.size();
		println result

		return result
	}
}
