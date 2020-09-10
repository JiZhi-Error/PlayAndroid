package com.zj.play.view.official

import android.content.Context
import androidx.lifecycle.ViewModel

/**
 * 版权：渤海新能 版权所有
 * @author zhujiang
 * 版本：1.5
 * 创建日期：2020/5/17
 * 描述：PlayAndroid
 *
 */
class OfficialViewModel(context: Context) : ViewModel() {

    val officialTreeLiveData =
        OfficialRepository(context).getProjectTree()
}