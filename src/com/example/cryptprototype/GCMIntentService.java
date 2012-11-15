package com.example.cryptprototype;

import com.google.android.gcm.GCMBaseIntentService;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class GCMIntentService extends GCMBaseIntentService {
	//in main: public static String TAG = "GCMIntentService";
	
	public GCMIntentService() {
        super("Test");
    }
	
	public GCMIntentService(String senderId) {
		super(senderId);
		Log.d("GCMIntentService", senderId);
	}
	
	@Override
	protected void onRegistered(Context context, String regId) {
		Log.d("onRegistered", regId);
		
	}
	
	@Override
	protected void onUnregistered(Context context, String regId) {
		Log.d("onUnregistered", regId);
	}
	
	@Override
	protected void onMessage(Context context, Intent intent) {
		Log.d("onMessage", String.valueOf(intent));
	}
	
	@Override
	protected void onError(Context context, String errorId) {
		Log.d("onError", errorId);
	}
	
	@Override
	protected boolean onRecoverableError (Context context, String errorId) {
		Log.d("onRecoverableError", errorId);
		return false;
	}
}
