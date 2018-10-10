package Util;

public class AppConstants {
	
	//App Parameters

	public static final String APK_PATH = System.getProperty("user.dir")+"\\apks\\app-debug.apk";
	public static final String DEVICE_NAME = "Nexus 7";
	public static final String DEVICE_VERSION = "6.0";
	public static final String PLATFORM_NAME = "Android";
	public static final String HUB_URL = "http://127.0.0.1:4723/wd/hub";
	
	//QaTestApp Elements
	
	public static final String FIRST_NAME_FIELD = "//android.widget.EditText[@text='First name']";
	public static final String LAST_NAME_FIELD = "//android.widget.EditText[@text='Last name']";
	public static final String SUBMIT_BUTTON = "//android.widget.Button[@text='Submit']";
	public static final String USER_FIRST_NAME_TEXT = "//android.widget.TextView[@index='1']";
	
	//Cheesesquare Elements
	public static final String ALL_CATEGORIES = "com.support.android.designlibdemo:id/tabs";
	public static final String UNIQUE_CATEGORY = "android.widget.TextView";
	public static final String CATEGORY_ITEMS = "com.support.android.designlibdemo:id/recyclerview";
	public static final String FIRST_CATEGORY_ITEM = "android:id/text1";
	public static final String CATEGORY_INFO = "android.widget.TextView";
	public static final String BACK_BUTTON = "//android.widget.ImageButton[@index='0']";
	public static final String CATEGORY1 = "//android.widget.TextView[@text='Category 1']";
	public static final String CATEGORY2 = "//android.widget.TextView[@text='Category 2']";
	public static final String CATEGORY3 = "//android.widget.TextView[@text='Category 3']";

}
