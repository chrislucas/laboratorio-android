package com.xp.genericadapterrecycllerview.views.viewholders

import androidx.annotation.IntDef

class ViewHolderHelper {

    companion object {
        @IntDef(COLUMN_LAYOUT)
        @Retention(AnnotationRetention.SOURCE)
        annotation class TypeViewHolder

        const val COLUMN_LAYOUT = 1
    }

}