//
// DO NOT EDIT THIS FILE.
// Generated using AndroidAnnotations 4.0.0.
// 
// You can create a larger work that contains this file and distribute that work under terms of your choice.
//


package jp.plen.plencheck.services;

import android.annotation.TargetApi;
import android.content.Context;
import org.androidannotations.api.builder.ServiceIntentBuilder;

@TargetApi(21)
public final class PlenScanService_
    extends PlenScanService
{

    public static PlenScanService_.IntentBuilder_ intent(Context context) {
        return new PlenScanService_.IntentBuilder_(context);
    }

    public static class IntentBuilder_
        extends ServiceIntentBuilder<PlenScanService_.IntentBuilder_>
    {

        public IntentBuilder_(Context context) {
            super(context, PlenScanService_.class);
        }
    }
}