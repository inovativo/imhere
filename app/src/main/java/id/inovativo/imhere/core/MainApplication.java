package id.inovativo.imhere.core;

import android.app.Application;
import android.content.Context;

import com.eyro.mesosfer.Mesosfer;

/**
 * Created by kamal on 24/06/16.
 */
public class MainApplication extends Application{

    public final static String MESOSFER_APPLICATION_ID = "EoGTpDENWg";
    public final static String MESOSFER_CLIENT_KEY = "2fv3XkAlc81IXqFFJHcEco4CWHuVa7Sa";

    //Constant to store shared preferences
    public static final String SHARED_PREF = "notificationapp";

    //To store boolean in shared preferences for if the device is registered to not
    public static final String REGISTERED = "registered";

    //To store the firebase id in shared preferences
    public static final String UNIQUE_ID = "uniqueid";

    private static MainApplication app;
    public static final String TAG = MainApplication.class.getSimpleName();

    public static synchronized MainApplication getInstance(){
        return app;
    }

    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
        app = this;
        Mesosfer.initialize(this, MESOSFER_APPLICATION_ID, MESOSFER_CLIENT_KEY);
        Mesosfer.setLogLevel(Mesosfer.LOG_LEVEL_VERBOSE);
    }

    public static Context getAppContext() {
        return app;
    }

    public MainApplication() {
        super();
    }

}
