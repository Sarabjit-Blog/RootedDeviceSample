package blog.sarabjit.rooteddevicesample;

import android.app.Application;

/**
 * Created by Sarabjit Bagga on 03/01/19.
 */

public class BaseApplication extends Application {
    private static BaseApplication mBaseApplication;

    public static BaseApplication getInstance() {
        return mBaseApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mBaseApplication = this;
    }
}
