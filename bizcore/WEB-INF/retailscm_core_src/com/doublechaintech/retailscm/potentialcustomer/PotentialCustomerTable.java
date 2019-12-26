
package com.doublechaintech.retailscm.potentialcustomer;
import com.doublechaintech.retailscm.AccessKey;


public class PotentialCustomerTable{


	public static AccessKey withId(Object value){
		AccessKey accessKey = new AccessKey();
		accessKey.setColumnName(COLUMN_ID);
		accessKey.setValue(value);
		return accessKey;
	}
	//Add extra identifiers
	

	//only this package can use this, so the scope is default, not public, not private either nor protected
	public static final String TABLE_NAME="potential_customer_data";
	static final String COLUMN_ID = "id";
	static final String COLUMN_NAME = "name";
	static final String COLUMN_MOBILE = "mobile";
	static final String COLUMN_CITY_SERVICE_CENTER = "city_service_center";
	static final String COLUMN_CITY_PARTNER = "city_partner";
	static final String COLUMN_DESCRIPTION = "description";
	static final String COLUMN_LAST_UPDATE_TIME = "last_update_time";
	static final String COLUMN_VERSION = "version";
 
<<<<<<< HEAD
	public static final String []ALL_CLOUMNS = {COLUMN_ID, 
		COLUMN_NAME, COLUMN_MOBILE, COLUMN_CITY_SERVICE_CENTER, COLUMN_CITY_PARTNER, COLUMN_DESCRIPTION, COLUMN_LAST_UPDATE_TIME, 
		COLUMN_VERSION};
	public static final String []NORMAL_CLOUMNS = {
		COLUMN_NAME, COLUMN_MOBILE, COLUMN_CITY_SERVICE_CENTER, COLUMN_CITY_PARTNER, COLUMN_DESCRIPTION, COLUMN_LAST_UPDATE_TIME
		};
=======
	public static final String []ALL_CLOUMNS = {COLUMN_ID,COLUMN_NAME,COLUMN_MOBILE,COLUMN_CITY_SERVICE_CENTER,COLUMN_CITY_PARTNER,COLUMN_DESCRIPTION,COLUMN_LAST_UPDATE_TIME,COLUMN_VERSION};
	public static final String []NORMAL_CLOUMNS = {COLUMN_NAME,COLUMN_MOBILE,COLUMN_CITY_SERVICE_CENTER,COLUMN_CITY_PARTNER,COLUMN_DESCRIPTION,COLUMN_LAST_UPDATE_TIME};
>>>>>>> ea67698ef1c4e94c89147baaf9f93aa768973fbe
	
	
}


