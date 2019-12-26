package com.promobiletools.commons.interfaces

import com.promobiletools.commons.activities.BaseSimpleActivity

interface RenameTab {
    fun initTab(activity: BaseSimpleActivity, paths: ArrayList<String>)

    fun dialogConfirmed(callback: (success: Boolean) -> Unit)
}
