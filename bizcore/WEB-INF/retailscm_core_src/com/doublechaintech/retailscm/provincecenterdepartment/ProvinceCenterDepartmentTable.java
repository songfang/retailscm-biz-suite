
package com.doublechaintech.retailscm.provincecenterdepartment;
import com.doublechaintech.retailscm.AccessKey;


public class ProvinceCenterDepartmentTable{


	public static AccessKey withId(Object value){
		AccessKey accessKey = new AccessKey();
		accessKey.setColumnName(COLUMN_ID);
		accessKey.setValue(value);
		return accessKey;
	}
	//Add extra identifiers
	

	//only this package can use this, so the scope is default, not public, not private either nor protected
	public static final String TABLE_NAME="province_center_department_data";
	static final String COLUMN_ID = "id";
	static final String COLUMN_NAME = "name";
	static final String COLUMN_FOUNDED = "founded";
	static final String COLUMN_PROVINCE_CENTER = "province_center";
	static final String COLUMN_MANAGER_NAME = "manager_name";
	static final String COLUMN_VERSION = "version";
 
<<<<<<< HEAD
	public static final String []ALL_CLOUMNS = {COLUMN_ID, 
		COLUMN_NAME, COLUMN_FOUNDED, COLUMN_PROVINCE_CENTER, COLUMN_MANAGER, 
		COLUMN_VERSION};
	public static final String []NORMAL_CLOUMNS = {
		COLUMN_NAME, COLUMN_FOUNDED, COLUMN_PROVINCE_CENTER, COLUMN_MANAGER
		};
=======
	public static final String []ALL_CLOUMNS = {COLUMN_ID,COLUMN_NAME,COLUMN_FOUNDED,COLUMN_PROVINCE_CENTER,COLUMN_MANAGER_NAME,COLUMN_VERSION};
	public static final String []NORMAL_CLOUMNS = {COLUMN_NAME,COLUMN_FOUNDED,COLUMN_PROVINCE_CENTER,COLUMN_MANAGER_NAME};
>>>>>>> ea67698ef1c4e94c89147baaf9f93aa768973fbe
	
	
}


