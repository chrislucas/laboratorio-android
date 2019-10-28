package com.xp.navmod

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.content.pm.ResolveInfo
import android.os.Bundle
import androidx.core.app.ComponentActivity
import java.lang.Exception


object Gate {

    fun createIntentFromAction(extras: Bundle = Bundle(), action: String) : Intent =
        Intent(action).apply {
        this.putExtras(extras)
    }

    @Throws (Exception::class)
    fun startActivityFromIntent(intent: Intent, context: Context) {
        val list : List<ResolveInfo> = context.packageManager.queryIntentActivities(intent
            , PackageManager.GET_RESOLVED_FILTER)
        if (list.size == 1) {
            val resolveInfo = list[0]
            val componentName = resolveInfo.activityInfo.let {
                ComponentName(it.applicationInfo.packageName, it.name)
            }
            val intentDestination = Intent(intent).apply {
                this.component = componentName
            }
            context.startActivity(intent)
        }
        else {
            throw Exception("1 action está sendo usada para mais de uma Activity")
        }
    }

}