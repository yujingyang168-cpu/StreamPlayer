package com.stream.player.ui
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import com.stream.player.ui.screen.play.PlayerScreen

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlayerScreen(
                videoUrl = "http://devimages.apple.com/iphone/samples/bipbop/bipbopall.m3u8",
                title = "苹果测试直播源",
                onBack = { finish() }
            )
        }
    }
}
