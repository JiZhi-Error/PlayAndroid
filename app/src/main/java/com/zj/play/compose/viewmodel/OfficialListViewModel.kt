package com.zj.play.compose.viewmodel

import android.app.Application
import android.util.Log
import com.zj.play.compose.common.BaseAndroidViewModel
import com.zj.model.pojo.QueryArticle
import com.zj.model.room.entity.Article
import com.zj.play.compose.repository.OfficialRepository

/**
 * 版权：Zhujiang 个人版权
 * @author zhujiang
 * 版本：1.5
 * 创建日期：2020/5/19
 * 描述：PlayAndroid
 *
 */
class OfficialListViewModel(application: Application) :
    BaseAndroidViewModel<List<Article>, Article, QueryArticle>(application) {

    private val officialRepository = OfficialRepository(application)

    override suspend fun getData(page: QueryArticle){
        Log.e("ZHUJIANG123", "getData: 22222")
        return officialRepository.getWxArticle(_state,page)
    }

}
