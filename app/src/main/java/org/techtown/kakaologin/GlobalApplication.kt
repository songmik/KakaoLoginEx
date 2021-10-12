package org.techtown.kakaologin

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        KakaoSdk.init(this, "{네이티브 앱 키를 입력하세요({}지우고)}")
    }
}